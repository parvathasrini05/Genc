package com.library.LibraryManagementBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.LibraryManagementBoot.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}