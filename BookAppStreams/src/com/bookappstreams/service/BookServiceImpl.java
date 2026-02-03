package com.bookappstreams.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookappstreams.exception.BookNotFoundException;
import com.bookappstreams.model.Book;
import com.bookappstreams.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		return BookDetails.getBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = getAll();
		
		if(author == null || author.trim().isEmpty()) {
			throw new BookNotFoundException("Author name cannot be empty or NULL");
		}
		
		if(books.isEmpty()) {
			throw new BookNotFoundException("No Books Avaialable");
		}
		List<Book> authorBooks = books.stream()
			               .filter(book->book.getAuthorName().equalsIgnoreCase(author))
			               .collect(Collectors.toList());
		
		if(authorBooks.isEmpty())
			throw new BookNotFoundException("No Books of given Author found");
		
		return authorBooks;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = getAll();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		List<Book> categoryBooks = books.stream()
										.filter(book->book.getCategory().equalsIgnoreCase(category))
										.collect(Collectors.toList());
		if(categoryBooks.isEmpty())
			throw new BookNotFoundException("No books of given category present");
		
		return categoryBooks;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = getAll();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		List<Book> priceBooks = books.stream()
									 .filter(book->book.getPrice() < price)
									 .collect(Collectors.toList());
		
		if(priceBooks.isEmpty())
			throw new BookNotFoundException("No books less than the given price are present");
		
		return priceBooks;
	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		List<Book> books = getAll();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		List<Book> yearPublishedBooks = books.stream()
											 .filter(book->book.getDatePublished().getYear() == year)
											 .collect(Collectors.toList());
		if(yearPublishedBooks.isEmpty())
			throw new BookNotFoundException("No books found in the given published year");
		
		return yearPublishedBooks;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = getAll();
		if(books.isEmpty()) {
			throw new BookNotFoundException("Empty books list");
		}
		List<Book> authorAndCategoryBooks = books.stream()
												 .filter(book->book.getAuthorName().equalsIgnoreCase(author) && book.getCategory().equalsIgnoreCase(category))
												 .collect(Collectors.toList());
		
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
		return books.stream()
					.filter(book->book.getBookId()==bookId)
					.findAny()
					.orElseThrow(()-> new BookNotFoundException("No books of given Book ID present"));
	}

}
