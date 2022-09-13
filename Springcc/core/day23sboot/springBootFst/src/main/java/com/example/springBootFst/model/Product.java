package com.example.springBootFst.model;


import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id;
    private long price;
    private int qty;
    private String name;

    public Product() {
    }

    public Product(int id, long price, int qty, String name) {
        this.id = id;
        this.price = price;
        this.qty = qty;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
