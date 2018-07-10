package com.app.operative.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.operative.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public int registerUser(User user) {
		System.out.println("Dao "+getClass().getName());
		int id = (int) sessionFactory.getCurrentSession().save(user);
		
		return id;
	}

	@Override
	public User loginUser(String emailId, String password) {
		
		return (User) sessionFactory.getCurrentSession()
				.createQuery("select a from User a where a.emailId= :emailId and a.password= :password ")
		.setParameter("emailId", emailId).setParameter("password", password).uniqueResult();
	

	}

	@Override
	public String futureAvailaility(Book book ) {
		int bid = book.getBId();
		String selctQuery="select min(b.returnDate) from BookingHistory b where b.bid= :bid";
		return null;
	}

}
