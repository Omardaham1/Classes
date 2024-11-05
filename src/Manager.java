package com.bank.employees;

public class Manager extends Employee {
    private String managementRole;

    public Manager(String name, String department, String managementRole) {
        super(name, department);
        this.managementRole = managementRole;
    }
}