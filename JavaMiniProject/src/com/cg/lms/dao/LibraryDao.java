package com.cg.lms.dao;

import com.cg.lms.exceptions.LMSException;
import com.cg.lms.model.BooksInventory;

public interface LibraryDao {

	void createTables() throws LMSException;

	boolean userLogin(String username, String password) throws LMSException;

	int insertNewBook(BooksInventory inventory) throws LMSException;

	int deleteBook(String book_id) throws LMSException;

}
