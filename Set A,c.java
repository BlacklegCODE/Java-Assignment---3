import java.util.Scanner;
//Define an interface “Operation” which has methods area(),volume().
 interface Operation
{
    //Define a constant PI having a value 3.142.
    double PI = 3.142;
    double area();
    double volume();
}

//Create a class cylinder which implements this interface (members – radius, height) 

class Cylinder implements Operation
{
    int radius;
    int height;
    
    Cylinder(int radius, int height)
    {
        this.radius = radius;
        this.height = height;
    }
    
    public double area()
    {
        //Cylinder area: 2 * PI * r * (r + h)
        return (double) 2 * PI * radius * ( radius * height);
    }
    
    public double volume()
    {
        //Cylinder volume: PI * r^2 * h
        return (double ) PI * height * (radius*radius);
        
    }
}

public class Assn2
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first digit :");
        int a = scanner.nextInt();
        
        System.out.print("\nEnter second :");
        int b = scanner.nextInt();
        
        //Create one object and calculate the area and volume.
        Cylinder cy = new Cylinder(a,b);
        System.out.println(cy.PI * a * b);
    }
}
