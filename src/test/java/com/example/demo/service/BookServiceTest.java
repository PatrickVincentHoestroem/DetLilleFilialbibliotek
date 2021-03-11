package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookRepository bookRepository;
    Book book;


    @BeforeEach
    void setUp() {
    }


    @Test
    void add() {
    }

    @Test
    void getBook(){
        Book book1 = new Book("Ringenes Herre", "Tolkien", "434566-334533", "20", 423, 12);
        bookRepository.add(book);
        assertEquals(bookRepository.getBookByName("Ringenes Herre"), book1);
    }

}

