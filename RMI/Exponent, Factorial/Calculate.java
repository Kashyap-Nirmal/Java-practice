package lab2;
//Java program to implement the interface 
import java.rmi.*; 
import java.rmi.server.*; 
import java.lang.Math;

public class Calculate extends UnicastRemoteObject implements IntfName
{
    // Default constructor to throw RemoteException 
    // from its parent constructor 
    Calculate() throws RemoteException 
    { 
        super(); 
    } 
    // Implementation of the query interface 
    public double power(double a, double b) throws RemoteException 
    { 
        return Math.pow(a,b);
    }
    public int factorial(int a) throws RemoteException 
    { 
        int g;
        g=a;
        while(a>1)
        {
            g*=(a-1);
            a--;
        }                    
        return g;
    }		
}