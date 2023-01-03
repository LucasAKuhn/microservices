package com.LKSmartTech.repository;

import com.LKSmartTech.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
