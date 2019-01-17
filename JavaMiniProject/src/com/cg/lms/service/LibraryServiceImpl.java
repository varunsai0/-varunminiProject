package com.cg.lms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.lms.dao.LibraryDao;
import com.cg.lms.dao.LibraryDaoImpl;
import com.cg.lms.exceptions.LMSException;
import com.cg.lms.model.BooksInventory;

public class LibraryServiceImpl implements LibraryService {

	LibraryDao libraryDao=new LibraryDaoImpl();
	
	@Override
	public void createTables() throws LMSException {
	
		
		libraryDao.createTables();
		
	}

	@Override
	public boolean userLogin(String username, String password) throws LMSException {
		
		return libraryDao.userLogin(username,password);
	}

	@Override
	public boolean validateFields(String username, String password) {
		
		List<String> list=new ArrayList<>();
		boolean flag=false;
		
		if(!validateUsername(username)) {
		list.add("Username in either lower case or upper case letters and should be of length between 4 and 15");
			}
		if(!validatePassword(password)) {
			list.add("Password should contain either characters or digits and should be of length between 5 and 7");
		}
		
		if(!list.isEmpty()) {
			
			System.out.println(list+"");
			
		}else {
			flag=true;
		}
		
		
		return flag;
	}
	public boolean validateUsername(String username)
	{
		String regEx="[a-zA-Z]{4,15}$";
		
	   return Pattern.matches(regEx, username);
	}
	
	public boolean validatePassword(String password) {
		String regEx="[a-zA-Z0-9]{5,7}";
		
		return Pattern.matches(regEx, password);
		
	}

	@Override
	public int insertNewBook(BooksInventory inventory) throws LMSException {
		
		return libraryDao.insertNewBook(inventory);
	}

	@Override
	public int deleteBook(String book_id) throws LMSException {
		
		return libraryDao.deleteBook(book_id);
	}

}
