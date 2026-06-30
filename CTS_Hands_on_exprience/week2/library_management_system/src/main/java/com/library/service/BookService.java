package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Setter Method
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void service() {

        System.out.println("Book Service Working");

        repository.displayBook();

    }

}