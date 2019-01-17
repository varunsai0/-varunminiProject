package com.cg.lms.model;

public class BooksInventory {
	
	private String book_id;
	private String book_name;
	private String author1;
	private String author2;
	private String publisher;
	private String yearofpublication;
	public BooksInventory() {
		// TODO Auto-generated constructor stub
	}
	public BooksInventory(String book_id, String book_name, String author1, String author2, String publisher,
			String yearofpublication) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author1 = author1;
		this.author2 = author2;
		this.publisher = publisher;
		this.yearofpublication = yearofpublication;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor1() {
		return author1;
	}
	public void setAuthor1(String author1) {
		this.author1 = author1;
	}
	public String getAuthor2() {
		return author2;
	}
	public void setAuthor2(String author2) {
		this.author2 = author2;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYearofpublication() {
		return yearofpublication;
	}
	public void setYearofpublication(String yearofpublication) {
		this.yearofpublication = yearofpublication;
	}
	
	
	
	

}
