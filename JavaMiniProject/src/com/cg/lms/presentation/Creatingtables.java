package com.cg.lms.presentation;

import com.cg.lms.exceptions.LMSException;
import com.cg.lms.service.LibraryService;
import com.cg.lms.service.LibraryServiceImpl;

public class Creatingtables {

	public static void main(String[] args) {
		
		
		LibraryService service=new LibraryServiceImpl();
		try {
			service.createTables();
		} catch (LMSException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
