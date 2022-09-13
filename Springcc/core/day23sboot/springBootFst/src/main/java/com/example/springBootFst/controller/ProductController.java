package com.example.springBootFst.controller;


import com.example.springBootFst.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {



    @GetMapping
    public ResponseEntity<String> msg1(){
        return new ResponseEntity<String>("Get Mapping",HttpStatus.FOUND);
    }


    @GetMapping("/abc")
    public ResponseEntity<Product>msg2(){
        Product product=new Product();
        product.setId(1);
        product.setPrice(1000);
        product.setQty(100);
        product.setName("Pen");
        return new ResponseEntity<Product>(product,HttpStatus.FOUND);
    }










}
