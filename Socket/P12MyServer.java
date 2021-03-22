package javaapplication1;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;

public class P12MyServer {
    public static void main(String[] args){
        try{
            System.out.println("Server started");
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//establishes connection
            System.out.println("Connection established.");
            String ans="";
            java.util.Date date=new java.util.Date(); 
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss zzzz");  
            String strDate = formatter.format(date);  
            ans=String.valueOf(strDate);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF(ans);            
            dout.flush();                     
            ss.close();   
            System.out.println("Thank you..");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}