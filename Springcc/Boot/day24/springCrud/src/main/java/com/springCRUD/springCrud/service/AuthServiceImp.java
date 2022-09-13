package com.springCRUD.springCrud.service;


import com.springCRUD.springCrud.dao.AuthDao;
import com.springCRUD.springCrud.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthServiceImp implements AuthService{
    @Autowired
    private AuthDao authDao;


    @Override
    public Author saveAuthor(Author author) {
       if(author!=null){
           authDao.save(author);
       }
       return author;
    }

    @Override
    public List<Author> getAllAuthors() {

        return (List<Author>) authDao.findAll();
    }

    @Override
    public Author getAuthor(int authorId) {
        Optional<Author>optional=authDao.findById(authorId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public String deleteAuthor(int authorId) {
        Author author=getAuthor(authorId);
        if(author!=null){
            authDao.delete(author);
            return "author deleted";
        }
        return "Author cannot be deleted";
    }

    @Override
    public Author updateAuthor(Author author) {

        if(author!=null){
            authDao.save(author);
            return author;
        }
        return null;

    }
}
