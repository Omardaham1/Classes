package com.bank.employees;

public abstract class Employee implements Teachable {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void teach(Course course) {
        System.out.println(name + " is teaching " + course.getName());
    }
}