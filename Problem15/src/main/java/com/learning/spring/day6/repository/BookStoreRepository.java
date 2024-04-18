package com.learning.spring.day6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.day6.entity.Book;

@Repository
public interface BookStoreRepository extends JpaRepository<Book, Long>{
	List<Book> findByTitle(String title);
    List<Book> findByAuthorLike(String author);
    List<Book> findByYear(int year);
}
