package com.bank.employees;

public class Teller extends Employee {
    private int tellerID;

    public Teller(String name, String department, int tellerID) {
        super(name, department);
        this.tellerID = tellerID;
    }
}