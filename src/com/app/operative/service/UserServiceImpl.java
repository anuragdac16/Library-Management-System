package com.app.operative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.operative.dao.UserDao;
import com.app.operative.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	@Override
	public String registerStudent(User user) {
		int id = 0;
		id = dao.registerUser(user);
		System.out.println("Register Successfully ");
		if(id!= 0) 
			return "Successfully Registerd "+id;
		
		return null;
	}

	@Override
	public String loginStudent(String email, String password) {
		User s =  dao.loginUser(email, password);
		System.out.println("Login Successfully ");
		if(s!= null)
			return "SuccessFully Login "+s.getFirstName() + "  " + s.getLastName();
		return null;
	}

}
