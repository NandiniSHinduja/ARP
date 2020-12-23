package TCPARP;
import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
    public static void main (String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        Socket s= ss.accept();
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout= new DataOutputStream(s.getOutputStream());
        String ip[]={"165.165.80.80", "165.165.79.1"};
        String mac[]={"AA:08:76:0F","56:89:0A:0F"};  
        String str=din.readUTF().trim();
        for(int i=0;i<=ip.length;i++){
            if(str.equals(ip[i])){
                dout.writeUTF(mac[i]);
                break;
            }
            else{
                dout.writeUTF("no such ip address");
                break;
            }
        }
    }
    
}
