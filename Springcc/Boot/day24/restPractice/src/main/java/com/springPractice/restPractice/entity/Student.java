package com.springPractice.restPractice.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private String name;
    @Id
    private int id;
    private int calssName;
    @Autowired
    @Embedded
    private Address address;
    public Student() {
    }

    public Student(String name, int id, int calssName) {
        this.name = name;
        this.id = id;
        this.calssName = calssName;

    }

    public int getCalssName() {
        return calssName;
    }

    public void setCalssName(int calssName) {
        this.calssName = calssName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", calssName=" + calssName +
                '}';
    }
}
