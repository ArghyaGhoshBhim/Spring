package com.mycompany.app.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private String name;
    private int isbn;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Book() {
        // TODO Auto-generated constructor stub
    }
    public Book(String name, int isbn) {
        super();
        this.name = name;
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        return "Book [name=" + name + ", isbn=" + isbn + "]";
    }
}
