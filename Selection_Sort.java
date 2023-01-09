// Write a program that takes the details of Students (name, roll number, address, CGPA) and sort it in a non-decreasing order using Selection sort based on CGPA.  

import java.util.*;
class student_record {
    String name;
    int roll_number;
    String address;
    double CGPA;

    student_record(String name, int roll_number, String address, double CGPA){
        super();
        this.name = name;
        this.roll_number = roll_number;
        this.address = address;
        this.CGPA = CGPA;
    }
