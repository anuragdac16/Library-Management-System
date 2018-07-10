/**
 * 
 */
package com.app.operative.pojo;

import java.util.List;

/**
 * @author anuraggupta
 *
 */
public class DashBoardModel {
	private User user;
	private Book book;
	private List<Book> bList;
	private List<BookingHistory> bookList;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
		
	public List<Book> getbList() {
		return bList;
	}
	public void setbList(List<Book> bList) {
		this.bList = bList;
	}
	public List<BookingHistory> getBookList() {
		return bookList;
	}
	public void setBookList(List<BookingHistory> bookList) {
		this.bookList = bookList;
	}
	@Override
	public String toString() {
		return "DashBoardModel [user=" + user + ", book=" + book + ", bList=" + bList + ", bookList=" + bookList + "]";
	}
	
	

	
}
