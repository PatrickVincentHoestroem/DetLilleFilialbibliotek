package com.example.demo.repository;

import com.example.demo.model.Book;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> list;

    public BookRepository(ArrayList<Book> list) {
        this.list = list;
    }

    public Book getBookByName(String name) {

    }
}
