package com.cg.lms.presentation;

import java.util.Scanner;

import com.cg.lms.exceptions.LMSException;
import com.cg.lms.model.BooksInventory;
import com.cg.lms.service.LibraryService;
import com.cg.lms.service.LibraryServiceImpl;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the username to login");
		String username = scanner.nextLine();
		System.out.println("Enter the password of the user to login");
		String password = scanner.nextLine();

		LibraryService service = new LibraryServiceImpl();

		boolean validateFlag = service.validateFields(username, password);
		System.out.println(validateFlag);
		if (validateFlag) {
			try {
				boolean loginRequest = service.userLogin(username, password);
				System.out.println(loginRequest);

				if (loginRequest) {

					System.out.println("********Library Management System********");
					System.out.println("1.Insert new book");
					System.out.println("2.Delete book from the database");
					System.out.println("3.Issue book to user");
					System.out.println("Enter your choice:");
					int choice = scanner.nextInt();

					switch (choice) {

					case 1:

						scanner.nextLine();
						System.out.println("Enter the book id to insert:");
						String bookId = scanner.next();
						scanner.nextLine();
						System.out.println("Enter the book name:");
						String bookName = scanner.nextLine();
						System.out.println("Enter name of the first author:");
						String authorName1 = scanner.nextLine();
						System.out.println("Enter name of the second author:");
						String authorName2 = scanner.nextLine();
						System.out.println("Enter the name of the publisher:");
						String publisher = scanner.nextLine();
						System.out.println("Enter year of publication:");
						String year = scanner.next();

						BooksInventory inventory = new BooksInventory();
						inventory.setBook_id(bookId);
						inventory.setBook_name(bookName);
						inventory.setAuthor1(authorName1);
						inventory.setAuthor2(authorName2);
						inventory.setPublisher(publisher);
						inventory.setYearofpublication(year);

						int result = service.insertNewBook(inventory);
						System.out.println(result + "inserted");
						break;

					case 2:
						scanner.nextLine();
						System.out.println("Enter book id to delete from the database:");
						String book_id = scanner.next();
						int result1=service.deleteBook(book_id);
                                System.out.println(result1+"deleted");
						break;

					default:

						break;

					}

				}

			} catch (LMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
