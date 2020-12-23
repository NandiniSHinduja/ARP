package TCPARP;
import java.io.*;
import java.util.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("localhost", 6666);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the IP address:");
        String str=sc.nextLine();
        dout.writeUTF(str);
        String rec=din.readUTF().trim();
        System.out.println("The MAC address is" + rec);
        

        
    }
    
}
