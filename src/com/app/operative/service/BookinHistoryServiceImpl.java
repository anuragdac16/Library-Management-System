package com.app.operative.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.operative.dao.BookingHistoryDao;
import com.app.operative.pojo.BookingHistory;


@Service
@Transactional
public class BookinHistoryServiceImpl implements BookingHistoryService {

	@Autowired
	private BookingHistoryDao dao;
	@Override
	public List<BookingHistory> myBookList(int uId) {
		List<BookingHistory> list =  dao.myBookList(uId);
		if(list!= null)
			return  list;
		return null;
	}
	

}
