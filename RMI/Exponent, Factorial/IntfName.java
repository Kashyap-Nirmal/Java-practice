package lab2;
//Creating a interface 
import java.rmi.*;

public interface IntfName extends Remote 
{
    // Declaring the method prototype 
    public double power(double a,double b) throws RemoteException;
    public int factorial(int a) throws RemoteException; 	
}