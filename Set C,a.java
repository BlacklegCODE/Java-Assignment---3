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
    int noom;
    //The class contains method printing the attributes. 
    Hostel()
    {
        this.noom = 0;
        this.hostelName = "NA";
        this.hostelLocation = "NA";
        this.numberOfRooms = 0;
    }
    Hostel(int noom, String hostelName, String hostelLocation, int numberOfRooms)
    {
        this.noom = noom;
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }
    
    void hostelPrinter()
    {
        System.out.println(noom);
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
        return this.deptName;
    }
    public String deptHead()
    {
        return this.deptHead;
    }
    Student()
    {
        super();
        this.studentName = "NA";
        this.regNo = 0;
        this.electiveSubject = "NA";
        this.deptName = "NA";
        this.deptHead = "NA";
        this.avgMarks = 0;
        this.hostelName = "NA";
        this.hostelLocation = "NA";
        this.numberOfRooms = 0;
    }
    
    Student(String studentName,int regNo,String electiveSubject,String deptName,String deptHead,int avgMarks,String hostelName,String hostelLocation,int numberOfRooms, int noom)
    {
        super(noom,hostelName,hostelLocation,numberOfRooms);
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
        System.out.println( studentName + " " + regNo + " "+ electiveSubject + " " + avgMarks + " "+ hostelLocation + " " + hostelName + " " +numberOfRooms + " " + deptHead +" "+deptName);
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
        
        Student[] stud = new Student[100];
        int studCount = 0;
        
        switch(ch)
        {
            case 1:
                {
                    System.out.print("Enter how many students to be admitted :");
                    int n = scanner.nextInt();

                    

                    for(int i = 0;i<n;i++)
                    {
                        System.out.print("\nEnter student Exact number :");
                        int stu_num = scanner.nextInt();
                        
                        scanner.nextLine();
                        
                        System.out.print("\nEnter student name here :");
                        String name = scanner.next();

                        System.out.print("\nEnter registration number :");
                        int reg_nu = scanner.nextInt();

                        scanner.nextLine();
                        
                        System.out.print("\nEnter elective subject :");
                        String el_su = scanner.next();

                        System.out.print("\nEnter average marks :");
                        int avg_m = scanner.nextInt();

                        scanner.nextLine();
                        
                        System.out.print("\nEnter department name :");
                        String dpt = scanner.next();

                        scanner.nextLine();
                        
                        System.out.print("\nEnter department head :");
                        String dpt_h = scanner.next();

                        scanner.nextLine();
                        
                        System.out.println("------Hostel details below------");
                        System.out.print("\nEnter hostel location :");
                        String loc = scanner.next();

                        scanner.nextLine();
                        
                        System.out.print("\nEnter hostel name ;");
                        String h_name = scanner.next();

                        System.out.print("\nEnter number of rooms in " + h_name + " :");
                        int r_num = scanner.nextInt();

                        //(String studentName,int regNo,String electiveSubject,String deptName,String deptHead,int avgMarks,String hostelName,String hostelLocation,String numberOfRooms

                        stud[studCount] = new Student(name,reg_nu,el_su,dpt,dpt_h,avg_m,h_name,loc,r_num,stu_num);
                        
                       studCount++;
                    }
                }
                break;
                
            case 2:
            {
                System.out.print("Enter student number to migrate: ");
                int noom = scanner.nextInt();

                boolean found = false;

                for (int i = 0; i < studCount; i++)
                {
                    if (stud[i] != null && stud[i].noom == noom) // match student by number
                    {
                        found = true;

                        scanner.nextLine(); // clear input buffer

                        System.out.print("\nEnter new hostel location : ");
                        String loc = scanner.nextLine();

                        System.out.print("\nEnter new hostel name : ");
                        String h_name = scanner.nextLine();

                        System.out.print("\nEnter number of rooms in " + h_name + " : ");
                        int r_num = scanner.nextInt();

                        // Update this student's hostel info
                        stud[i].hostelLocation = loc;
                        stud[i].hostelName = h_name;
                        stud[i].numberOfRooms = r_num;

                        System.out.println("\n✅ Student " + stud[i].studentName + " migrated successfully!");
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("❌ No student found with number " + noom);
                }
            }
            break;


            case 3:
            {
                System.out.println("You want the details ? I got you 👍");
                int noom = scanner.nextInt();
                
                boolean found = false;
                
                for(int i = 0;i<studCount;i++)
                {
                    if(stud[i].noom == noom)
                    {
                        stud[i].printData();
                        found = true;
                    }
                }
                if(!found)
                {
                    System.out.println("Data not found !");
                }
            }
            break;
        }
        
    //The program should be menu driven containing the options:
    
    //For the third option, a search is to be made on the basis of the entered registration Number.
        
    }
}

