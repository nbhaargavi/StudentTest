package org.example;

public class Student {
    String name;
    int age;
    protected int gpa;

    Student(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    public int getgpa() {
        return gpa;
    }
}

