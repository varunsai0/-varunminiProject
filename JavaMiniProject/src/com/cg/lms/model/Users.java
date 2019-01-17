package com.cg.lms.model;

public class Users {

	private String user_id;
	private String user_name;
	private String password;
	private String email_id;
	private boolean librarian;
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(String user_id, String user_name, String password, String email_id, boolean librarian) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.email_id = email_id;
		this.librarian = librarian;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public boolean isLibrarian() {
		return librarian;
	}
	public void setLibrarian(boolean librarian) {
		this.librarian = librarian;
	}
	
	
	
	
}
