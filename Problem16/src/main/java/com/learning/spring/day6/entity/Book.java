package com.learning.spring.day6.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collation = "book_details")
public class Book {
	
	 	@Id
	    private String id;

	    private String title;
	    private String author;
	    private String isbn;
	    private int numberOfPages;
	    private int year;
	    
	    public Book() {
			// TODO Auto-generated constructor stub
		}

		public Book(String id, String title, String author, String isbn, int numberOfPages, int year) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.numberOfPages = numberOfPages;
			this.year = year;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public int getNumberOfPages() {
			return numberOfPages;
		}

		public void setNumberOfPages(int numberOfPages) {
			this.numberOfPages = numberOfPages;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
	    
	    
	
}
