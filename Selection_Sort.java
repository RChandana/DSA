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
    
    String name(){
        return name;
    }
    int roll_number(){
        return roll_number;
    }
    String address(){
        return address;
    }
    double CGPA(){
        return CGPA;
    }
}

class Selection_Sort_CGPA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of students in the class : \n");
        int no_of_students = Integer.parseInt(sc.nextLine());
        List<student_record > Studentlist = new ArrayList<student_record>();
        while (no_of_students > 0) {
            System.out.println("Enter the Name of the student : \n");
            String name = sc.next();
            System.out.println("Enter the student Roll Number : \n");
            int roll_number = sc.nextInt();
            System.out.println("Enter the Address of the student : \n");
            String address = sc.next();
            System.out.println("Enter the CGPA of the student : \n");
            double CGPA = sc.nextDouble();
            student_record st = new student_record(name, roll_number, address, CGPA);
            Studentlist.add(st);
            no_of_students--;
        }
        
        Collections.sort(Studentlist, new Comparator<student_record>() {
            public int compare(student_record s1, student_record s2){
                if(s1.CGPA() > s2.CGPA()){
                    return 1;
                }
                return -1;
            }
        }
        );
        
        System.out.println("The Sorted Array of the student's CGPA is : \n");
        for(student_record s: Studentlist){
            System.out.println(s.name());
        }
    }
}
