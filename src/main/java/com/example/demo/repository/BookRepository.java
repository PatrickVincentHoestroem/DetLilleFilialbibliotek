package com.example.demo.repository;

import com.example.demo.model.Book;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> list;

    public BookRepository(ArrayList<Book> list) {
        this.list = list;
    }

    public Book getBookByName(String name) {
        for (Book b:list) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }
    public Book getBookByIsbn(String isbn) {
        for (Book b:list) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }
}
