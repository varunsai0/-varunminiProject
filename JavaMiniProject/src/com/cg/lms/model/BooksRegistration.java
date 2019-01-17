package com.cg.lms.model;

import java.time.LocalDate;

public class BooksRegistration {
 
	private String registration_id;
	private String book_id;
	private String user_id;
	private LocalDate registrationDate;
	
	public BooksRegistration() {
		// TODO Auto-generated constructor stub
	}

	public BooksRegistration(String registration_id, String book_id, String user_id, LocalDate registrationDate) {
		super();
		this.registration_id = registration_id;
		this.book_id = book_id;
		this.user_id = user_id;
		this.registrationDate = registrationDate;
	}

	public String getRegistration_id() {
		return registration_id;
	}

	public void setRegistration_id(String registration_id) {
		this.registration_id = registration_id;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
	
	
}
