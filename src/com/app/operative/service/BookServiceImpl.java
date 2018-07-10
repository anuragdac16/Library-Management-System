package com.app.operative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.operative.dao.BookDao;
import com.app.operative.pojo.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao dao;
	@Override
	public String addBook(Book book) {
		int id = 0;
		System.out.println("In Book Service : "+getClass().getName());
		id = dao.addBook(book);
		if(id != 0 )
			return "Successfully Added " +id;
		
		return null;
	}

}
