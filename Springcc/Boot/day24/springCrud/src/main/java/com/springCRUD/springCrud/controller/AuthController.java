package com.springCRUD.springCrud.controller;


import com.springCRUD.springCrud.model.Author;
import com.springCRUD.springCrud.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping
    public ResponseEntity<Author>saveAuthor(@RequestBody Author author){
       Author response= authService.saveAuthor(author);
       return new ResponseEntity<Author>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Author>>getAllAuthor(){
        return new ResponseEntity<List<Author>>(authService.getAllAuthors(),HttpStatus.FOUND);
    }
    @GetMapping("{id}")
    public ResponseEntity<Object>getAuthor(@PathVariable int id){
        Author response=authService.getAuthor(id);
        if(response!=null){

            return new ResponseEntity<Object>(response,HttpStatus.FOUND);
        }
        return  new ResponseEntity<Object>("Not found",HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteById(@PathVariable int id){
        String response=authService.deleteAuthor(id);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }



    @PutMapping
    public ResponseEntity<Object>updateAuthor(@RequestBody Author author){
        Author response=authService.updateAuthor(author);
        return new ResponseEntity<Object>(response, HttpStatus.CREATED);
    }

}
