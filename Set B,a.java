//Create 3 objects each of Purchase Order and Sales Order and accept and displaydetails.
import java.util.Scanner;

//Create an abstract class “order” having members id,description. DONE

abstract class Order
{
    abstract int id();
    abstract String description();
}

//Create two subclasses “Purchase Order” and “Sales Order” having members customer name 
//and Vendor name respectively. DONE 

 class Purchase
{ 
    String c_name;
    Purchase(String c_name)
    {
        this.c_name = c_name;
    } 
}
class Sales
{
    String v_name;
    Sales(String v_name)
    {
        this.v_name = v_name;
    }     
}
public class Assn2
{
    public static void main(String[] args)
    {
        //Define methods accept and display in all cases.
        Scanner scanner = new Scanner(System.in);
        
        Sales[] od = new Sales[3];
        Purchase[] pc = new Purchase[3];
        
        for(int i = 0;i<3;i++)
        {
        System.out.print("Enter " +(i+1)+ " no. detail PURCHASE :");
        String pur = scanner.next();
        
        System.out.print("Enter " + (i+1) +" no. detail SALES :");
        String sal = scanner.next();
        
        od[i] = new Sales(sal);
        pc[i] = new Purchase(pur);
        }

        for(int i = 0;i<3;i++)
        {
            System.out.println("Purchase :" + od[i].v_name + " Sell :" + pc[i].c_name);
        }
        
    }
}
