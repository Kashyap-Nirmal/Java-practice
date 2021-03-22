package javaapplication1;

import java.io.*;
import java.net.*;

public class P11MyServer {
    public static void main(String[] args){
        try{
            System.out.println("Server started.");
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//establishes connection
            System.out.println("Connection established.");
            System.out.println("Waiting for client inputs ...");
            DataInputStream dis=new DataInputStream(s.getInputStream());            
            String str=(String)dis.readUTF();
            System.out.println("Inputs received...");
            String choice[]=str.split(" ");            
            String ans="";
            String msg="";
            switch(choice[0]){
                case "1":
                    msg="a = "+choice[1]+",b = "+choice[2]+" and a+b = "+(Integer.parseInt(choice[1])+Integer.parseInt(choice[2]));
                    ans=msg;
                    //ans=String.valueOf(Integer.parseInt(choice[1])+Integer.parseInt(choice[2]));
                    break;
                case "2":
                    int g;
                    int m=Integer.parseInt(choice[1]);
                    g=m;
                    while(m>1)
                    {
                        g*=(m-1);
                        m--;
                    }
                    msg="The answer for "+choice[1]+"! = ";
                    ans=msg+" "+String.valueOf(g);
                    break;
                case "3":
                    msg="The binary for the given decimal number "+choice[1]+" = ";
                    ans=msg+" "+Integer.toBinaryString(Integer.parseInt(choice[1]));                   
                    break;
                default:
                    ans="!! Invalid choice. !!";
                    break;
            }
            System.out.println("Output processed..");
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