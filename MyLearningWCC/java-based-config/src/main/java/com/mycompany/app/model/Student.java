package com.mycompany.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private int rollNumber;
    private String name;


//    If we have two beans of same type then we can tell spring what bean have to inject
//    @Qualifier("getAdressBean")
    @Qualifier("adr1")
//    Use to inject the Address bean into the Student.
    @Autowired
    private Address address;





    public Student(int rollNumber, String name, Address address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }



    public Student(){

    }

    public Student(int rollNumber, String name) {
        System.out.println("int, string");
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public Student(String name, int rollNumber) {
        System.out.println("str, int");
        this.rollNumber = rollNumber;
        this.name = name;
    }


    public void myInit(){
        System.out.println("This is my init method");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
