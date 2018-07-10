package com.app.operative.dao;

import com.app.operative.pojo.User;

public interface UserDao {
	
	public int registerUser(User user);
	
	public User loginUser(String email , String password);
	
	public String futureAvailaility();

}
