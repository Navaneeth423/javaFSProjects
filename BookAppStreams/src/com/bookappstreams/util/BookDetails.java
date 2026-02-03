package com.bookappstreams.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookappstreams.model.Book;

public class BookDetails {
	public static List<Book> getBooks() {
		List<Book> books = Arrays.asList(
				new Book("White Nights", "Fyodor Dostoevsky", 1011, 99, "Philosophy", LocalDate.of(1889, 1, 1)),
				new Book("Shoe Dog", "Phil Knight", 5241, 499, "Biography", LocalDate.of(2000, 1, 1)),
				new Book("The Magic of Thinking Big", "David Schwartz", 7623, 299, "Non-Fiction", LocalDate.of(2005, 1, 1)),
				new Book("Inferno", "Dan Brown", 9742, 699, "Fiction", LocalDate.of(2010, 1, 1)),
				new Book("Letters from a Stoic", "Seneca", 2633, 199, "Philosophy", LocalDate.of(1565, 1, 1)),
				new Book("Atomic Habits", "James Clear", 1424, 299, "Non-Fiction", LocalDate.of(2003, 1, 1))
								);
		
		return books;
	}
}
