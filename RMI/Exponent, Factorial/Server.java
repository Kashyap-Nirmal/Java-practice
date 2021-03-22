package lab2;
import java.rmi.*; 
import java.rmi.registry.*; 

public class Server
{
    public static void main(String[] args)
    {
        try
	{ 
            // Create an object of the interface implementation class 
            Calculate obj = new Calculate();

            // rmiregistry within the server JVM with port number 9999
            LocateRegistry.createRegistry(9999); 
            
            // Binds the remote object by the name 
            Naming.rebind("rmi://localhost:9999/ABC",obj); 
	} 
	catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    }
}