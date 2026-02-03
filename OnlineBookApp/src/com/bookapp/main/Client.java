package com.bookapp.main;

import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.*;

public class Client {
	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to OP BookApp.\nPlease select your option from the Menu");
		System.out.println("1. Get the list of Books Available");
		System.out.println("2. Search Books by Author");
		System.out.println("3. Search Books by Category");
		System.out.println("4. Search Books comparing to Price");
		System.out.println("5. Search Books by Author and Category");
		System.out.println("6. Search a Book by it's ID");
		System.out.println("7. Exit from App");

		System.out.println();
		System.out.print("Your Choice: ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Books Available with us:");
			bookService.getAll().forEach(System.out::println);
			break;
		case 2:
			System.out.println("Which Author's book are you searching for: ");
			sc.nextLine();
			String authorName = sc.nextLine();
			try {
				bookService.getByAuthorContains(authorName).forEach(System.out::println);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Which Category book are you searching for: ");
			sc.nextLine();
			String category = sc.nextLine();
			try {
				bookService.getByCategory(category).forEach(System.out::println);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case 4:
			System.out.println("Enter the price below which you are searching for books: ");
			int price = sc.nextInt();
			try {
				bookService.getByPriceLessThan(price).forEach(System.out::println);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case 5:
			System.out.println("Which Author and Category book are you searching for: ");
			sc.nextLine();
			String author = sc.nextLine();
			String bookCategory = sc.nextLine();
			try {
				bookService.getByAuthorContainsAndCategory(author, bookCategory).forEach(System.out::println);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case 6:
			System.out.println("Enter ID of Book you are searching for: ");
			int bookId = sc.nextInt();
			try {
				Book book = bookService.getById(bookId);
				System.out.println(book);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case 7:
			System.out.println("Exiting BookApp. Please visit Again.\nThank you!!");
			System.exit(0);
		default:
			System.out.println("Invalid option. Try again later!!");
			break;
		}
			
	}
}
