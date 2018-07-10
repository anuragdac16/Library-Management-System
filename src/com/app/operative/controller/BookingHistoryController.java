package com.app.operative.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.operative.pojo.Book;
import com.app.operative.pojo.BookingHistory;
import com.app.operative.pojo.User;
import com.app.operative.service.BookService;
import com.app.operative.service.BookingHistoryService;

@Controller
@RequestMapping(value = "/history")
public class BookingHistoryController {

	public BookingHistoryController() {
		System.out.println("In constructor of  : " + getClass().getName());
	}

	@Autowired
	private BookingHistoryService service;
	@Autowired
	private BookService bookService;


	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String processDashboard(User user, Model model, HttpSession hs) {
		user = (User) model.asMap().get("user");
		System.out.println("User name in process form : " + user.getFirstName() + "  " + user.getLastName());
		return "dashboard";
	}

	@RequestMapping(value = "/myList")
	public String showMyList(Model model, HttpServletRequest req, HttpServletResponse response) {
		System.out.println("In Show My List Form  : " );
	
		return "myList";
	}
	
	@RequestMapping(value = "/myList" , method= RequestMethod.POST)
	public String processMyList(Model model, HttpServletRequest req ) {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user == null)
			return "redirect:/user/login";
		System.out.println("User name in myList form : " + user.getFirstName() + "  " + user.getLastName());
		session.setAttribute("myModel", service.myBookList(user.getuId()));
		return "myList";
	}

	

	
	@RequestMapping(value = "/booksearch" , method= RequestMethod.GET)
	public ModelAndView processBookSearch( HttpSession hs , Book book ,BindingResult res , HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		if(res.hasErrors())
			return new ModelAndView("booksearch");
		if(user == null)
			return new ModelAndView("redirect:/user/login");
		if(book.getCategory() == null && book.getBookName() ==null && book.getAuthorName()==null)
			return new ModelAndView("booksearch");
		
		System.out.println("Process Book search controller");
		List<Book> list = bookService.searchBook(book);
	
		return new ModelAndView("bookDetail" ,"model" , list);	
	}

	
	
	@RequestMapping(value = "/booking" , method= RequestMethod.GET)
	public String showBookSearch(Book book , Model model , BindingResult res ,HttpServletRequest req) {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(res.hasErrors())
			return "booksearch";
		System.out.println("Show Booking controller "+ model);
		System.out.println("Book is : "+book);
		if(user == null)
			return "redirect:/user/login";
		
		
		List<BookingHistory> list =service.myBookList(user.getuId());
		//Book book1 = bookService.myBookName(book.getbId());
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getBook().getbId() == book.getbId()) { 
				System.out.println(list.get(i).getBook().getbId());
				System.out.println(book.getbId());
				return "booksearch";
			}
		}
		
		
		//System.out.println("Book Detail : "+book1);
		session.setAttribute("myModel", bookService.myBookName(book.getbId()));
		
		return "booking";
		
	}
	
	@RequestMapping(value = "/booking" , method= RequestMethod.POST)
	public String addBookDetails(Book book , Model model , BindingResult res ,HttpServletRequest req) {
		if(res.hasErrors())
			return "booksearch";
		System.out.println("Add Book Details controller "+ model);
		
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user == null)
			return "redirect:/user/login";
		
		
		Book book1 = bookService.myBookName(book.getbId());
		
		session.setAttribute("myModel", bookService.saveBookDetail(book1, user));
		
		return "myList";
		
	}
	
	
	@RequestMapping(value = "/logout" , method= RequestMethod.GET)
	public String logout( Model model ,HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		session.removeAttribute("user");
		
		System.out.println(user.getFirstName());
		
		return "redirect:/user/login";
		
	}
	
	
	
	@RequestMapping(value = "/myCurrentList")
	public String showMyCurrentList(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user == null)
			return "redirect:/user/login";
		System.out.println("User name in myList form : " + user.getFirstName() + "  " + user.getLastName());
		session.setAttribute("myModel", service.myBookList(user.getuId()));
		return "myCurrentList";
	}


	
		
	
	
}
