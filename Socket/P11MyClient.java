package javaapplication1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class P11MyClient {
    public static void main(String[] args){
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            System.out.println("Please enter appropriate choice:\n");
            System.out.println("1. For addition of two numbers");
            System.out.println("2. For factorial of a number");
            System.out.println("3. Finding binary of a decimal input");
            Scanner scan=new Scanner(System.in);
            int choice =scan.nextInt();
            int a=scan.nextInt();
            int b=0;
            if(choice==1)
                b=scan.nextInt();
            String ss1=String.valueOf(choice)+" ";
            ss1+=String.valueOf(a)+" ";
            ss1+=String.valueOf(b);
            dout.writeUTF(ss1);
            dout.flush();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("\nThe response from server is \n"+str);          
            s.close();

        }catch(Exception e){System.out.println(e);}
    }
}
