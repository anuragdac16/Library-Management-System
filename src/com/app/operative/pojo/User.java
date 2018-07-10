package com.app.operative.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="USER")
public class User {

	private int uId ;
	
	@NotEmpty(message="Please enter first name")
	private String firstName ;
	
	@NotEmpty(message="Please enter last name")
	private String lastName ;
	
	@NotEmpty(message="Please enter valid Email ID")
	private String emailId ;
	
	@NotEmpty(message="Please enter password")
	private String password ;
	
	@NotEmpty(message="Please enter Phone Number")
	private String phoneNumber ;
	
	public User() {
		super();
		System.out.println("In User Class Construtor" +getClass().getName() );
	}


	public User(int uId, String firstName, String lastName, String emailId, String password, String phoneNumber ) {
		super();
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
		
	}


	@Id
	@GeneratedValue
	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}

	@Column(length=15)
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(length=15)
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(length=30)
	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(length=15)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length=15)
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "User [uId=" + uId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}


	


	
}
