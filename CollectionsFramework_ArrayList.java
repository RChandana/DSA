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

    
// 1st : Using the normal String Data type
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
public class StudentObject_1{
    class Student{
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
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("File Path"));
        StringBuffer sb = new StringBuffer();
        String line;
        while((line = br.readLine()) != null){
            sb.append(line);
            sb.append("\n");
            
            String comma = ", ";
            int Start = 0, end;
            end = line.indexOf(comma, Start);
            while(end != -1){
                String split = line.substring(Start, end);
                Start = end + 1;
                end = line.indexOf(comma, Start);
                String Split = line.substring(Start);
            }
            String[] elements = line.split(", ");
            List<String> list = Arrays.asList(elemnets);
            ArrayList<String> listOfString = new ArrayList<String>(list);
            System.out.println(listOfString);
    }
    br.close();
    }
}






    
 // 2nd : Using Student Object
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class StudentObject_2 {
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

// Student Class for StudentObject_2 Class
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
