package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student st = new Student(33, "Rumpa", 3.68);
        studentList.add(st);
        Student st2 = new Student(85, "Ashis", 3.85);
        studentList.add(st2);
        Student st3 = new Student(56, "Samiha", 3.75);
        studentList.add(st3);
        Student st4 = new Student(19, "Samara", 3.75);
        studentList.add(st4);
        Student st5 = new Student(22, "Fahim", 3.76);
        studentList.add(st5);

        studentList.sort(Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId));

        for (Student stu : studentList) {
            System.out.println(stu.getFname());
        }
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}