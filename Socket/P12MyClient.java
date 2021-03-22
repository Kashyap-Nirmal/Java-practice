package javaapplication1;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class P12MyClient {
    public static void main(String[] args)  throws IOException{
        try{
            Socket s=new Socket("localhost",6666);
            s.setSoTimeout(1000);
            DataInputStream dis=new DataInputStream(s.getInputStream());            
            String str=(String)dis.readUTF();
            System.out.println("\nThe date time received from server is : "+str);                      
            s.close();

        }catch(Exception e){System.out.println(e);}
    }
}