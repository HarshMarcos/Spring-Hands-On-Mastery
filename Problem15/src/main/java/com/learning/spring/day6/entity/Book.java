package com.learning.spring.day6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String author;
	    private String isbn;
	    private int numberOfPages;
	    private int year;
	    
	    public Book() {
			// TODO Auto-generated constructor stub
		}
	    
	    
		public Book(Long id, String title, String author, String isbn, int numberOfPages, int year) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.numberOfPages = numberOfPages;
			this.year = year;
		}


		public Long getId() {
			return id;
		}
		public void setId(Long id) {
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
