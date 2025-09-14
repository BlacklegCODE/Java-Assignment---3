//Write a program to using marker interface define a default and parameterized
//constructor. Create objects of class product and display the contents of each object
//and Also display the object count.

import java.lang.Cloneable;
import java.util.Scanner;

interface Marker
{
}

//create a class product(product_id,product_name, product_cost, product_quantity) 
class Product implements Marker
{
    int product_id;
    String product_name;
    int product_cost;
    int product_quantity;
    static int count = 0;
    
    Product(int product_id, String product_name, int product_cost,int product_quantity)
    {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        count++;
    }
    Product()
    {
        product_id = 0;
        product_name = "NULL";
        product_cost = 0;
        product_quantity = 0;
        count++;
    }
}

public class Assn2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many records you want :");
        int n = scanner.nextInt();
        
        Product[] pro = new Product[n];
        
        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter the ID :");
            int id = scanner.nextInt();
            System.out.print("\nEnter the Name :");
            String name = scanner.next();
            System.out.print("\nEnter the Cost :");
            int co = scanner.nextInt();
            System.out.print("\nEnter the Quantity :");
            int qt = scanner.nextInt();
            
            pro[i] = new Product(id,name,co,qt);
        }
        
        for(int i = 0;i<n;i++)
        {
            System.out.println(pro[i].product_id + " " + pro[i].product_name + " " + pro[i].product_cost + " " + pro[i].product_quantity);
        }
        System.out.println("Total objects :" + Product.count);
    }
}
