package com.learning.spring.day6.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.day6.entity.Book;

@Repository
public interface BookStoreRepository extends MongoRepository<Book, String>{
	List<Book> findByTitle(String title);
    List<Book> findByAuthorLike(String author);
    List<Book> findByYear(int year);
}
