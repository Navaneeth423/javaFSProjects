package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		return BookDetails.getBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> authorBooks = new ArrayList<>();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		for(Book book : books) {
			if(book.getAuthorName().equalsIgnoreCase(author))
				authorBooks.add(book);
		}
		if(authorBooks.isEmpty())
			throw new BookNotFoundException("No books of given author present");
		
		return authorBooks;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> categoryBooks = new ArrayList<>();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		for(Book book : books) {
			if(book.getCategory().equalsIgnoreCase(category))
				categoryBooks.add(book);
		}
		if(categoryBooks.isEmpty())
			throw new BookNotFoundException("No books of given category present");
		
		return categoryBooks;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> priceBooks = new ArrayList<>();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		for(Book book : books) {
			if (book.getPrice() < price)
				priceBooks.add(book);
		}
		if(priceBooks.isEmpty())
			throw new BookNotFoundException("No books less than the given price are present");
		
		return priceBooks;
	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> yearPublishedBooks = new ArrayList<>();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		for(Book book : books) {
			if (book.getDatePublished().getYear() == year)
				yearPublishedBooks.add(book);
		}
		if(yearPublishedBooks.isEmpty())
			throw new BookNotFoundException("No books found in the given published year");
		
		return yearPublishedBooks;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = getAll();
		List<Book> authorAndCategoryBooks = new ArrayList<>();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		for(Book book : books) {
			if(book.getAuthorName().equalsIgnoreCase(author) && book.getCategory().equalsIgnoreCase(category))
				authorAndCategoryBooks.add(book);
		}
		if(authorAndCategoryBooks.isEmpty())
			throw new BookNotFoundException("No books of given author and category present");
		
		return authorAndCategoryBooks;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books = getAll();
		
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		for(Book book : books) {
			if(book.getBookId() == bookId)
				return book;
		}

		throw new BookNotFoundException("No books of given Book ID present");
	}

}
