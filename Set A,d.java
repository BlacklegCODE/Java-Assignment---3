//Write a program to find the cube of given number using function interface.
import java.util.Scanner;

interface Cuber
{
    public int cuber();
}

class calc
{
    int value;
    calc(int value)
    {
        this.value = value;
    }
    
    double cube()
    {
        return (double) value * value * value;
    }
}
public class Assn2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a value to cube :");
        int a = scanner.nextInt();
        
        calc c = new calc(a);
        System.out.println(c.cube());
    }
}
