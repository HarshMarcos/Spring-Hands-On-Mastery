package com.learning.spring.day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.day6.entity.Book;
import com.learning.spring.day6.repository.BookStoreRepository;

@Service
public class BookStoreService {
	@Autowired
	private BookStoreRepository bookStoreRepository;
	
	public BookStoreService(BookStoreRepository bookStoreRepository) {
		this.bookStoreRepository = bookStoreRepository;
	}
	
	public Book addBook(Book book) {
		return bookStoreRepository.save(book);
	}
	
	public Book updateBook(Long id, Book bookDetails) {
		Optional<Book> existingBookOptional = bookStoreRepository.findById(id);
		if(existingBookOptional.isPresent()) {
			Book existingBook = existingBookOptional.get();
			existingBook.setTitle(bookDetails.getTitle());
            existingBook.setAuthor(bookDetails.getAuthor());
            existingBook.setIsbn(bookDetails.getIsbn());
            existingBook.setNumberOfPages(bookDetails.getNumberOfPages());
            existingBook.setYear(bookDetails.getYear());
            return bookStoreRepository.save(existingBook);
		}
		return null;
	}
	
	public List<Book> getAllBooks(){
		return bookStoreRepository.findAll();
	}
	
	public Optional<Book> getBookById(Long id) {
        return bookStoreRepository.findById(id);
    }

    public void deleteBook(Long id) {
        bookStoreRepository.deleteById(id);
    }

    public List<Book> getBooksByTitle(String title) {
        return bookStoreRepository.findByTitle(title);
    }
    
    public List<Book> getBooksByAuthor(String author) {
        return bookStoreRepository.findByAuthorLike("%" + author + "%");
    }
	
    public List<Book> getBooksByYear(int year) {
        return bookStoreRepository.findByYear(year);
    }
}
