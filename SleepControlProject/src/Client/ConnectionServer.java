/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import Client.Patient;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class ConnectionServer {
    
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        OutputStream os = null;
        Socket socket = null;
        
        //InetAddress addressServer = null;
        //System.out.println("Type the Address to the server you want to connect" +addressServer);
        //int portNumber = 0;
        int portNumber = 9000;
        System.out.println("Type the port of the server you want to connect" +portNumber);
        
        Patient[] patient = new Patient[3];
        patient[0] = new Patient("Keyla", "Montoya","657762874");
        patient[1] =new Patient ("Gianluca", "Libera", "687230916");
        patient[2] = new Patient("Isaias", "Aarons", "677102379");
        
        try{
            socket = new Socket("localhost", portNumber);
            os = socket.getOutputStream();
        }catch(IOException ex){
            System.out.println("Impossible to connect to the server...");
            System.exit(-1);
            Logger.getLogger(ConnectionServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            oos = new ObjectOutputStream(os);
            oos.writeObject(patient[0]);
            oos.writeObject(patient[1]);
            oos.writeObject(patient[2]);
            oos.flush();
        }catch(IOException ex){
            Logger.getLogger(ConnectionServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            releaseResources(oos, socket);
        }
        
    }
     
    private static void releaseResources(ObjectOutputStream oos, Socket socket){
        
        try{
            oos.close();
        }catch(IOException ex){
             Logger.getLogger(ConnectionServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            socket.close();
        }catch(IOException ex){
             Logger.getLogger(ConnectionServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
}
