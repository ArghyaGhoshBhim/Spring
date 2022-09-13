package com.springCRUD.springCrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Author{
    private String authorName;
    @Id
    private int authorId;
    private String book;

    public Author() {
    }

    public Author(String authorName, int authorId, String book) {
        this.authorName = authorName;
        this.authorId = authorId;
        this.book = book;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorId=" + authorId +
                ", book='" + book + '\'' +
                '}';
    }
}
