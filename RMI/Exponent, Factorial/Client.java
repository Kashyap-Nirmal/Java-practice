package lab2;
import java.rmi.*;
import java.util.*;

public class Client
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
	try
	{ 
            // lookup method to find reference of remote object 
            IntfName intf1=(IntfName)Naming.lookup("rmi://localhost:9999/ABC"); 
            System.out.println("Enter the 1st value i.e. base"); 
            double c = s.nextDouble();
            System.out.println("Enter the 2nd value i.e. exponent"); 
            double d = s.nextDouble();
            double r1 = intf1.power(c,d);			
            System.out.println("Enter the value for factorial: "); 
            int a=s.nextInt();
            System.out.println("Power of "+c+" raise to "+d+" is "+r1);
            int b=intf1.factorial(a);			
            System.out.println(a+"! = "+b);
	} 
	catch(Exception e) 
	{ 
            System.out.println(e); 
	} 
    }
}