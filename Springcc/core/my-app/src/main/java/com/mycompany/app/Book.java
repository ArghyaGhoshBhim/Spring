package com.mycompany.app;

public class Book {

    int isbn;
    String name;
    public int getIsbn() {
    	
        return isbn;
    }
    public void setIsbn(int isbn) {
    	System.out.println("isbn setter");
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Book() {
        // TODO Auto-generated constructor stub
    }
    public Book(int isbn, String name) {
        super();
//        System.out.println("isbn constructor");
        System.out.println("int, str");
        this.isbn = isbn;
        this.name = name;
    }
 public Book(String name, int isbn) {
    	
        super();
        System.out.println("str, int");
//        System.out.println("isbn constructor");
        this.isbn = isbn;
        this.name = name;
    }
   
   
    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", name=" + name + "]";
    }

}
