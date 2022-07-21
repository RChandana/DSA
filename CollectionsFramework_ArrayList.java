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


----------------------------------------------------------------------------------------------------------------------------------------------------------



/*RollNo    Name     Age    Marks
   101    Chandana   18      90
    .         .       .       .
    .         .       .       .
    .         .       .       .
    .         .       .       .
    .         .       .       .
    .         .       .       .
    
    Write the above data in a text file, write a Java Program to read from the text file and create a Student Object from each line.
    Now use an ArrayList to add Student Objects created above which means add each Stdent Object(which corresponds to a line) into the ArrayList.*/

    
 // Using Student Object
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class StudentObject{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new FileReader("File Path"));
        StringBuffer sb = new StringBuffer();
        String line;
        while((line = br.readLine()) != null){
            sb.append(line);
            sb.append("\n");
            
            String[] elements = line.split(", ");
            
            int rollNo = Integer.parseInt(elements[0].trim());
            String name = elements[1];
            int age = Integer.parseInt(elements[2].trim());
            Double marks = Double.parseDouble(elements[3].trim());
            
            Student stu = new Student(rollNo, name, age, marks);
            studentList.add(stu);
        }
        br.close();
        for(Student info : studentList){
            System.out.println(info);
        }
    }
}

// Student Class
public class Student{
    int rollNumber;
    String name;
    int age;
    double marks;
    
    Student(int rollNumber, String name, int age, double marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String toString(){ 
        return "Roll Number : " + rollnumber + "Name : " + name + "Age : " + age + "Marks : " + marks;
    }
}
