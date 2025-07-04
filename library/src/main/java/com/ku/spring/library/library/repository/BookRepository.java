package com.ku.spring.library.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ku.spring.library.library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findIsAvailable (boolean isAvailable);
    List<Book> findByTitleContainingIgnoreCase(String title);
}
