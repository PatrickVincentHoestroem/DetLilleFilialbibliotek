package com.example.demo.model;

public class Book {

    private String name, author, isbn, pageSize;
    private int pageAmount, textSize;

    public Book(String name, String author, String isbn, String pageSize, int pageAmount, int textSize) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.pageSize = pageSize;
        this.pageAmount = pageAmount;
        this.textSize = textSize;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPageSize() {
        return pageSize;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public int getTextSize() {
        return textSize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", pageAmount=" + pageAmount +
                ", textSize=" + textSize +
                '}';
    }
}
