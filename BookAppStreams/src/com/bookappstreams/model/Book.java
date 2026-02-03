package com.bookappstreams.model;

import java.time.LocalDate;

public class Book {
	private String title;
	private String authorName;
	private Integer bookId;
	private double price;
	private String category;
	private LocalDate datePublished;
	
	public Book() {
		super();
	}

	public Book(String title, String authorName, Integer bookId, double price, String category,
			LocalDate datePublished) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.bookId = bookId;
		this.price = price;
		this.category = category;
		this.datePublished = datePublished;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authorName=" + authorName + ", bookId=" + bookId + ", price=" + price
				+ ", category=" + category + ", datePublished=" + datePublished + "]";
	}
}
