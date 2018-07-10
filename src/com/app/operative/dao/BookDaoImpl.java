package com.app.operative.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.operative.pojo.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public int addBook(Book book) {
		int id;
		System.out.println("In Book Dao class  : " +getClass().getName());
		id = (int) sessionfactory.getCurrentSession().save(book);
		
		return id;
	}

}
