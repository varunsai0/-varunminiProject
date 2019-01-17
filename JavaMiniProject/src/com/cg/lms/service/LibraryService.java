package com.cg.lms.service;

import com.cg.lms.exceptions.LMSException;
import com.cg.lms.model.BooksInventory;

public interface LibraryService {

	void createTables() throws LMSException;

	boolean userLogin(String username, String password) throws LMSException;

	boolean validateFields(String username, String password);

	int insertNewBook(BooksInventory inventory) throws LMSException;

	int deleteBook(String book_id) throws LMSException;

}
