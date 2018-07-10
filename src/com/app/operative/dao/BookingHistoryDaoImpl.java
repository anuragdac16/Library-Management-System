package com.app.operative.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.operative.pojo.BookingHistory;


@Repository
public class BookingHistoryDaoImpl implements BookingHistoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<BookingHistory> myBookList(int uId) {
		
		
		System.out.println(uId);

		@SuppressWarnings("unchecked")
		List<BookingHistory> list  = sessionFactory.getCurrentSession()
		.createQuery(" select b from Book a ,BookingHistory b where b.book.bId = a.bId and  b.user.uId = :uId ")
		.setParameter("uId", uId).list();
		
	
		
		return list;
	}

	
	
	
	
}
