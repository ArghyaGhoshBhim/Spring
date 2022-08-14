package com.mycompany.app.model;

public class Student {
    private int rollNumber;
    private String name;


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
