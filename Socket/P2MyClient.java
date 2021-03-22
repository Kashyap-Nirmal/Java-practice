package javaapplication1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class P2MyClient {
    public static void main(String[] args){
       try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            System.out.println("Please enter your name:\n");
            Scanner scan=new Scanner(System.in);
            String name =scan.nextLine();
            dout.writeUTF(name);
            dout.flush();            
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("\nThe answer for your choice = \n"+str);          
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
