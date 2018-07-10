package com.app.operative.service;

import com.app.operative.pojo.User;

public interface UserService {

	
	public String registerStudent(User user);

	public String loginStudent(String email , String password);
	
}
