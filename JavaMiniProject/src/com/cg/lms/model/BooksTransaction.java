package com.cg.lms.model;

import java.time.LocalDate;

public class BooksTransaction {
	
	private String transaction_id;
	private String registration_id;
	private LocalDate issue_date;
	private LocalDate return_date;
	private  Integer file;
	
	public BooksTransaction() {
		// TODO Auto-generated constructor stub
	}

	public BooksTransaction(String transaction_id, String registration_id, LocalDate issue_date, LocalDate return_date,
			Integer file) {
		super();
		this.transaction_id = transaction_id;
		this.registration_id = registration_id;
		this.issue_date = issue_date;
		this.return_date = return_date;
		this.file = file;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getRegistration_id() {
		return registration_id;
	}

	public void setRegistration_id(String registration_id) {
		this.registration_id = registration_id;
	}

	public LocalDate getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(LocalDate issue_date) {
		this.issue_date = issue_date;
	}

	public LocalDate getReturn_date() {
		return return_date;
	}

	public void setReturn_date(LocalDate return_date) {
		this.return_date = return_date;
	}

	public Integer getFile() {
		return file;
	}

	public void setFile(Integer file) {
		this.file = file;
	}
	
	
	

}
