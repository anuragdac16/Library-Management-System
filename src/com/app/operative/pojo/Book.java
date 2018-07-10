package com.app.operative.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="BOOK")
public class Book {

	private int bId;
	
	@NotEmpty(message="Please enter Book name")
	private String bookName;
	
	@NotEmpty(message="Please enter Author name")
	private String authorName;
	
	@NotNull(message="Please enter quantity of book")
	private int quantity;
	
	@NotEmpty(message="Please enter category of book")
	private String category;


	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Book(int bId, String bookName, String authorName, int quantity, String category) {
		super();
		this.bId = bId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.quantity = quantity;
		this.category = category;
	}




	@Id
	@GeneratedValue
	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(length=30)
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Column(length=10)
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(length=30)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + ", authorName=" + authorName + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}
	
	
	
}
