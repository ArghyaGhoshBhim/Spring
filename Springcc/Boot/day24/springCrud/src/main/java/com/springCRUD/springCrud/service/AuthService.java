package com.springCRUD.springCrud.service;


import com.springCRUD.springCrud.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthService {
    public Author saveAuthor(Author author);
    public List<Author> getAllAuthors();
    public Author getAuthor(int authorId);
    public String deleteAuthor(int authorId);
    public Author updateAuthor(Author author);
}
