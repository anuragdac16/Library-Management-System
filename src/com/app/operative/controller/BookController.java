package com.app.operative.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.operative.pojo.Book;
import com.app.operative.service.BookService;

@Controller
@RequestMapping(value="/book")
public class BookController {

	
	
	public BookController() {
		super();
		System.out.println("Inside Book controller : "+getClass().getName());
	}

	@Autowired
	private BookService service;
	
	@RequestMapping(value="/addbook")
	public String showAddForm(Book book) 
	{
		System.out.println("In Add Book Form "+getClass().getName());
		return "addbook";
	}
	
	@RequestMapping(value="/addbook" , method= RequestMethod.POST)
	public String processAddBook(HttpSession hs  , @Valid Book book , BindingResult res )
	{
		System.out.println("In process Book Form :"+getClass().getName());
		
		if(res.hasErrors()) {
			System.out.println("In Add Book process got an error");
			return "addBook";
		}
		
		System.out.println("Before process add Book");
		hs.setAttribute("status", service.addBook(book));
		System.out.println("completed");
		
		return "inventory";
	}
	
}
