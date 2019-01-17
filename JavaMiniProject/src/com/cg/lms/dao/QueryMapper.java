package com.cg.lms.dao;

public interface QueryMapper {
	
	public static final String createTable1="create table users(user_id varchar2(4) primary key,user_name varchar2(15),password varchar2(7),email_id varchar2(25),librarian varchar2(5),check (librarian in ('true','false')))";
	
	public static final String createTable2="create table books_inventory(book_id varchar2(4) primary key,book_name varchar2(20),author1 varchar2(15),author2 varchar2(15),publisher varchar2(20),yearofpublication varchar2(4))";
	
	public static final String createTable3="create table books_registration(registration_id varchar2(4) primary key,book_id varchar2(4),user_id varchar2(4),registration_date date,foreign key(book_id) references books_inventory(book_id),foreign key(user_id) references users(user_id))";

	public static final String createTable4="create table books_transaction(transaction_id varchar2(4),registration_id varchar2(4),issue_date date,return_date date,foreign key(registration_id) references books_registration(registration_id))";

    public static final String loginDetails="select user_name,password from users";
    
    public static final String insertBookInto="insert into books_inventory values(?,?,?,?,?,?)";

    public static final String deleteBookfrom="delete from books_inventory where book_id=?";
}
