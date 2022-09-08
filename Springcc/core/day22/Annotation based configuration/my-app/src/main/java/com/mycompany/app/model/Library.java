package com.mycompany.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {

    String libraryName;

//    @Qualifier("book1")
    @Autowired
    Book book;

    public Library() {
        // TODO Auto-generated constructor stub
        System.out.println("library const def");

    }

    public Library(String libraryName, Book book) {
        super();
        System.out.println("library const args");

        this.libraryName = libraryName;
        this.book = book;
    }


    public Library( Book book) {
        super();
        System.out.println("library const args book");


        this.book = book;
    }


    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {

        this.libraryName = libraryName;
    }

    public Book getBook() {
        return book;
    }


    public void setBook(Book book) {
        System.out.println("set Book setter called");
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library [libraryName=" + libraryName + ", book=" + book + "]";
    }

}
