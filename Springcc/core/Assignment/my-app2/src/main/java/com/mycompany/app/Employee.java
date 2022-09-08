package com.mycompany.app;


import java.util.Arrays;

public class Employee {
    private String name;
    private Address address[];
    private Departmet departmet;

    public Employee() {
    }

    public Employee(String name, Address[] address, Departmet departmet) {
        this.name = name;
        this.address = address;
        this.departmet = departmet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public Departmet getDepartmet() {
        return departmet;
    }

    public void setDepartmet(Departmet departmet) {
        this.departmet = departmet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + Arrays.toString(address) +
                ", departmet=" + departmet +
                '}';
    }
}
