package javaapplication1;

import java.io.*;
import java.net.*;

public class P2MyServer extends Thread{
    Socket s=null;
    static String ans="";
    static int clientCount=0;
    static int stringCount=0;
    P2MyServer(Socket s){
	this.s=s;
        start();
    }
    public void run(){
        try{
            DataInputStream dis=new DataInputStream(s.getInputStream());            
            DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
            System.out.println("Waiting for client "+(clientCount)+" input ...");
            String temp=dis.readUTF()+"\n"; 
            System.out.println("Client "+(stringCount+1)+" input received...");
            stringCount++;
            this.ans+=temp;                        
            System.out.println(this.ans+"\n"+stringCount);            
            while(stringCount<3){
                sleep(1000);
            }   
            dout.writeUTF(this.ans.toString());            
            dout.flush();            
        }
        catch(Exception e){
            System.out.println(e);
        }	
    }
    public static void main(String[] args){
        try{
            System.out.println("Server started");
            ServerSocket ss=new ServerSocket(6666);
            while(clientCount<3){                
                Socket s=ss.accept();//establishes connection 
                System.out.println("Connection "+(clientCount+1)+" established.");
                clientCount++;
                new P2MyServer(s);                
            }
            ss.close();                        
        }catch(Exception e){
            //This exception occurs when client count exceeds 3.
            //ConnectException: Connection refused: connect
            System.out.println(e);
        }
    }
}