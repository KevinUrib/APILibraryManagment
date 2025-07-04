package com.ku.spring.library.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ku.spring.library.library.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

    List<Author> findIfIsAlive(boolean isAlive);

}
