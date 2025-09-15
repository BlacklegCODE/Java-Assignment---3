import java.util.Scanner;

//Create an interface Department containing attributes deptName and deptHead. 
interface Department
{
    String deptName();
    String deptHead();
    //It also has abstract methods for printing the attributes. // ima skip it real quick
}

//Create a class hostel containing hostelName, hostelLocation and numberOfRooms.
class Hostel
{
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    //The class contains method printing the attributes. 
    Hostel(String hostelName, String hostelLocation, int numberOfRooms)
    {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }
    
    void hostelPrinter()
    {
        System.out.println(hostelName);
        System.out.println(hostelLocation);
        System.out.println(numberOfRooms);
    }
}

//Then write Student class extending the Hostel class and implementing the Department interface

class Student extends Hostel implements Department
{
    //This class contains attributes studentName, regNo, electiveSubject and avgMarks. 
    
    String studentName;
    int regNo;
    String electiveSubject;
    int avgMarks;
    String deptName;
    String deptHead;
    
    //Also implement the abstract methods of the Department interface. 
    
    public String deptName()
    {
        return deptName;
    }
    public String deptHead()
    {
        return deptHead;
    }
    Student()
    {
        
    }
    
    
    Student(String studentName,int regNo,String electiveSubject,String deptName,String deptHead,int avgMarks,String hostelName,String hostelLocation,int numberOfRooms)
    {
        super(hostelName,hostelLocation,numberOfRooms);
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks; 
        this.deptHead = deptHead;
        this.deptName = deptName;
    }
    
    //Write suitable printData method for this class.
    
    void printData()
    {
        System.out.println( studentName + " " + regNo + " "+ electiveSubject + " " + avgMarks + " "+ hostelLocation + " " + hostelName + " " +numberOfRooms);
    }
    
    
}

//Write a driver class to test the Student class. 

public class Assn2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Admit new student\n2. Migrate a student\n3. Display details of a student");
        int ch = scanner.nextInt();
        
        switch(ch)
        {
            case 1:
                {
                             System.out.print("Enter how many students to be admitted :");
                    int n = scanner.nextInt();

                    Student[] stud = new Student[n];

                    for(int i = 0;i<n;i++)
                    {
                        System.out.print("\nEnter student name here :");
                        String name = scanner.next();

                        System.out.print("\nEnter registration number :");
                        int reg_nu = scanner.nextInt();

                        System.out.print("\nEnter elective subject :");
                        String el_su = scanner.next();

                        System.out.print("\nEnter average marks :");
                        int avg_m = scanner.nextInt();

                        System.out.print("\nEnter department name :");
                        String dpt = scanner.next();

                        System.out.print("\nEnter department head :");
                        String dpt_h = scanner.next();

                        System.out.println("------Hostel details below------");
                        System.out.print("\nEnter hostel location :");
                        String loc = scanner.next();

                        System.out.print("\nEnter hostel name ;");
                        String h_name = scanner.next();

                        System.out.print("\nEnter number of rooms in " + h_name + " :");
                        int r_num = scanner.nextInt();

                        //(String studentName,int regNo,String electiveSubject,String deptName,String deptHead,int avgMarks,String hostelName,String hostelLocation,String numberOfRooms

                        stud[i] = new Student(name,reg_nu,el_su,dpt,dpt_h,avg_m,h_name,loc,r_num);
                    }
                }
                
            case 2:
            {
                System.out.print("Enter a student registration number to migrate :");
                int dude = scanner.nextInt();
                
                        Hostel[] stu = new Hostel[1];
                        
                        System.out.print("\nEnter hostel location :");
                        String loc = scanner.next();

                        System.out.print("\nEnter hostel name ;");
                        String h_name = scanner.next();

                        System.out.print("\nEnter number of rooms in " + h_name + " :");
                        int r_num = scanner.nextInt();
                        
                        stu[dude] = new Hostel(h_name,loc,r_num);
            }
            
            case 3:
            {
                System.out.println("You want the details ? I got you 👍");
                Student h = new Student();
                h.printData();  
            }
        }
        
    //The program should be menu driven containing the options:
    
    //For the third option, a search is to be made on the basis of the entered registration Number.
        
    }
}

