import java.util.Scanner;
//Define an abstract class Staff with protected members id and name. Define a
//parameterized constructor. Define one subclass OfficeStaff with member
//department. Create n objects of OfficeStaff and display all details.


abstract class Staff
{
    protected int id;
    protected String name;
    
    Staff(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
class OfficeStaff extends Staff
    {
    String department;
    
    OfficeStaff(int id, String name, String department)
    {
        super(id,name);
        this.department = department;
    }        
}
public class Assn2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many members you want :");
        int n = scanner.nextInt();
       
        OfficeStaff[] os = new OfficeStaff[n];
        
        
        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter member Id :");
            int id = scanner.nextInt();
            
            System.out.print("\nEnter name of member :");
            String name = scanner.next();
            
            System.out.print("\nEnter department name :");
            String dept = scanner.next();
            
            os[i] = new OfficeStaff(id,name,dept);
        }
        
        for(int i = 0;i<n;i++)
        {
            System.out.println("id :" + os[i].id + " Name :" + os[i].name + " Department :" + os[i].department);
        }   
    }
}
