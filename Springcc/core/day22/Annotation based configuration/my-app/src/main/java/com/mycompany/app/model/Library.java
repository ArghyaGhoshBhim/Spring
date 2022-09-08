package com.mycompany.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Library {


    @Value("${james.library.id}")
    String libraryName;

//    @Qualifier("book1")

    @Autowired
    Book book;

    @Qualifier("address1")
    @Autowired
    private Address homeAddress;
    @Autowired
    private Address officeAddress;


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

    @Required
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

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", book=" + book +
                ", homeAddress=" + homeAddress +
                ", officeAddress=" + officeAddress +
                '}';
    }
}
