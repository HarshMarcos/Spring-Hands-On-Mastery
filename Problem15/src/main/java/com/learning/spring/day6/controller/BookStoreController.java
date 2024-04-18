package com.learning.spring.day6.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.day6.entity.Book;
import com.learning.spring.day6.service.BookStoreService;

@RestController
@RequestMapping("/books")
public class BookStoreController {
	@Autowired
	 private BookStoreService bookStoreService;
	
	 public ResponseEntity<Book> addBook(@RequestBody Book book){
		 Book addedBook = bookStoreService.addBook(book);
		 return new ResponseEntity<Book>(addedBook, HttpStatus.CREATED);
	 }
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
	        Book updatedBook = bookStoreService.updateBook(id, book);
	        if (updatedBook != null) {
	            return new ResponseEntity<>(updatedBook, HttpStatus.OK);
	        }
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    @GetMapping
	    public ResponseEntity<List<Book>> getAllBooks() {
	        List<Book> books = bookStoreService.getAllBooks();
	        return new ResponseEntity<>(books, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
	        Optional<Book> book = bookStoreService.getBookById(id);
	        return book.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                   .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
	        bookStoreService.deleteBook(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    @GetMapping("/title/{title}")
	    public ResponseEntity<List<Book>> getBooksByTitle(@PathVariable String title) {
	        List<Book> books = bookStoreService.getBooksByTitle(title);
	        return new ResponseEntity<>(books, HttpStatus.OK);
	    }

	    @GetMapping("/author/{author}")
	    public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable String author) {
	        List<Book> books = bookStoreService.getBooksByAuthor(author);
	        return new ResponseEntity<>(books, HttpStatus.OK);
	    }

	    @GetMapping(params = "year")
	    public ResponseEntity<List<Book>> getBooksByYear(@RequestParam int year) {
	        List<Book> books = bookStoreService.getBooksByYear(year);
	        return new ResponseEntity<>(books, HttpStatus.OK);
	    }
	 
	 
}
