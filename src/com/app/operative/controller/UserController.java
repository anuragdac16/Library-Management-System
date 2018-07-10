package com.app.operative.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.operative.pojo.User;
import com.app.operative.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	
	public UserController() {
		System.out.println("In User Controller "+getClass().getName());
	}

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/registration")
	public String showRegForm(User user) {
		System.out.println("in show reg form");
		return "registration";
	}
	
	
	@RequestMapping(value = "/registration" ,method = RequestMethod.POST)
	public String ProcessRegisterStudent(HttpSession hs,@Valid  User user , BindingResult res)
	{
		System.out.println("qwerty");
		if(res.hasErrors())
		{
			System.out.println("unsuccess........"+res);
			return "registration";
		}
		System.out.println("Before register Student");
		hs.setAttribute("status", service.registerStudent(user));
		System.out.println("status");
			return "login";

	}
	
	
	@RequestMapping(value = "/login")
	public String showLoginForm(User user, Model map) {
		System.out.println("in show login form " + map);
		return "login";
	}

	// process login form
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processLoginForm(@Valid User user, BindingResult res) {
		System.out.println("In process registration Form"+user.getFirstName()+user.getLastName());
		if (res.hasFieldErrors("email") || res.hasFieldErrors("password")) {
			System.out.println("Errors in process login");
			return "login";
		}
		System.out.println("in process login form " + user);
		String sts = service.loginStudent(user.getEmailId(), user.getPassword());
		if (sts.contains("Fail"))
			return "Studentlogin";
		System.out.println("Success..........");
		return "inventory";
	}
}
