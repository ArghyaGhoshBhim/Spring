package com.mycompany.app;

import java.util.Arrays;

public class Book {

    int isbn;
    String name;
    String[] volumes;

    public String[] getVolumes() {
        return volumes;
    }

    public void setVolumes(String[] volumes) {
        this.volumes = volumes;
    }

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

    public Book(int isbn, String name, String[] volumes) {
        this.isbn = isbn;
        this.name = name;
        this.volumes = volumes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", volumes=" + Arrays.toString(volumes) +
                '}';
    }
}
