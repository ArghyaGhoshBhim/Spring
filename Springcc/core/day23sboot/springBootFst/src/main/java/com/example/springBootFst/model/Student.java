package com.example.springBootFst.model;


import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private byte age;
    private char division;
    private int sem;
    private int marks;
    private char gender;
    private int id;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, byte age, char division, int sem, int marks, char gender, int id) {
        this.name = name;
        this.age = age;
        this.division = division;
        this.sem = sem;
        this.marks = marks;
        this.gender = gender;
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", division=" + division +
                ", sem=" + sem +
                ", marks=" + marks +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}
