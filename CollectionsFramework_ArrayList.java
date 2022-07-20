// Java Program to create an ArrayList with multiple Object Types.
import java.util.ArrayList;
public class ArrayObject{
    public static void main(String[] args){
        ArrayList <Student> studentInfo = new ArrayList<>();
        studentInfo.add(new Student(101, "Chandana", "XYZ"));
        studentInfo.add(new Student(102, "Tina", "ABC"));
        studentInfo.add(new Student(103, "Jaggu", "PQR"));
        studentInfo.add(new Student(104, "Aakash", "RST"));
        
        for(Student student : studentInfo){
            System.out.println("Roll Number : " + student.stuRollNum + ", Name : " + student.stuName + ", Address : " + student.stuAddress);
        }
    }
}
class Student{
    int stuRollNum;
    String stuName;
    String stuAddress;
    
    Student(int stuRollNum, String stuName, String stuAddress){
        this.stuRollNum = stuRollNum;
        this.stuName = stuName;
        this.stuAddress = stuAddress;
    }
}
