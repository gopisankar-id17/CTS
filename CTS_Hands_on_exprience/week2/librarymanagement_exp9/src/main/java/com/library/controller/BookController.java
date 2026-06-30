package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return repository.findAll();
    }
}