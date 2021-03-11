package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Ringenes Herre", "Tolkien", "434566-334533", "20", 423, 12));
    }

    @Test
    void add() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Ringenes Herre", "Tolkien", "434566-334533", "20", 423, 12));
        System.out.println(books.get(0));
    }

}

