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


public class ConnectionServer {
    
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        OutputStream os = null;
        Socket socket = null;
        
        
        /*/*public class ServerConnection implements Runnable {
    
    private ArrayList<Patient>  patients;
    private ArrayList<Users> users;
    private ArrayList<Report> reports;
    private ArrayList<EEG> eegs;
    InputStream is = null;
    ObjectInputStream ois = null;
    ServerSocket serversocket = null;
    Socket socketReceiver = null;
    Socket socketSender=null;
    PrintWriter print = null;
    BufferedReader buf=null;
   
    public void receiveClientandReport(){
    //EL PROBLEMA ESTÁ EN QUE UTILIZO COSAS DE LA DATABASE PARA SACAR LOS OBJETOS!!!!! 
        try{
            serversocket = new ServerSocket(9000); //podría poner socketReceiver.getPort();
            socketReceiver = serversocket.accept();
            is = socketReceiver.getInputStream();
            
            System.out.println("The connection established from the address" + socketReceiver.getInetAddress()); 
            socketSender=new Socket(socketReceiver.getInetAddress(),9009);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        try{
            ois = new ObjectInputStream(is);
            Object newpat;
            ObjectOutputStream objectOut=null;

            while((newpat= ois.readObject())!= null){
                Patient patientconnected = (Patient) newpat;
                Integer dni = patientconnected.getId();
                print=new PrintWriter(socketSender.getOutputStream(),true);
                //System.out.println("The patient you are going to send is:\n" + patientconnected.toString()); 
                Patient pat = getPatient(dni);
                objectOut=new ObjectOutputStream(socketSender.getOutputStream());
                objectOut.writeObject(pat);
                //ESCRIBIR AL CLIENTE QUÉ FECHA DE REPORT QUIERE DE ESTE PACIENTE
                //HAY QUE CREAR EN EL CLIENTE QUE SE CORTE EN EL MOMENTO EN EL QUE ESCRIBA UNA FECHA, NO MAS Y DEBERIA HABER TBB UNA EXCEPCION DE QUE NO SON VALIDAS ETC.
                
                print.println("Choose the report's date you want to see: (DD/MM/YY)\n");
                //RECIBIR RESPUESTA Y MOSTRARLE EL REPORT
                buf=new BufferedReader(new InputStreamReader(socketReceiver.getInputStream()));
                String dateString=buf.readLine();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date dateUtil=formato.parse(dateString);
                java.sql.Date dateSql= new java.sql.Date(dateUtil.getTime());
                Report rep = PatientManager.viewReport(dni,dateSql);
                objectOut.writeObject(rep);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        finally{
            releaseResources(ois,serversocket,socketReceiver);
        }
    }
r   public void sendClientandEEG(){
//EL PROBLEMA ESTÁ EN QUE UTILIZO COSAS DE LA DATABASE PARA SACAR LOS OBJETOS!!!!! 
        try{
            serversocket = new ServerSocket(9000); //podría poner socketReceiver.getPort();
            socketReceiver = serversocket.accept();
            is = socketReceiver.getInputStream();
            
            System.out.println("The connection established from the address" + socketReceiver.getInetAddress()); 
            socketSender=new Socket(socketReceiver.getInetAddress(),9009);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        try{
            ois = new ObjectInputStream(is);
            Object newpat;
            ObjectOutputStream objectOut=null;

            while((newpat= ois.readObject())!= null){
                Patient patientconnected = (Patient) newpat;
                Integer dni = patientconnected.getId();
                print=new PrintWriter(socketSender.getOutputStream(),true);
                System.out.println("The patient you are going to send is:\n" + patientconnected.toString()); 
                Patient pat = getPatient(dni);
                objectOut=new ObjectOutputStream(socketSender.getOutputStream());
                objectOut.writeObject(pat);
                //ESCRIBIR AL CLIENTE QUÉ FECHA DE EEG QUIERE DE ESTE PACIENTE
                //HAY QUE CREAR EN EL CLIENTE QUE SE CORTE EN EL MOMENTO EN EL QUE ESCRIBA UNA FECHA, NO MAS Y DEBERIA HABER TBB UNA EXCEPCION DE QUE NO SON VALIDAS ETC.
                
                print.println("Choose the report's date you want to see: (DD/MM/YY)\n");
                //RECIBIR RESPUESTA Y MOSTRARLE EL REPORT
                buf=new BufferedReader(new InputStreamReader(socketReceiver.getInputStream()));
                String dateString=buf.readLine();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date dateUtil=formato.parse(dateString);
                java.sql.Date dateSql= new java.sql.Date(dateUtil.getTime());
                Report rep = PatientManager.viewEEG(dni,dateSql);
                objectOut.writeObject(rep);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        finally{
            releaseResources(ois,serversocket,socketReceiver);
        }
}
    public static void main(String[] args) throws ClassNotFoundException, ParseException {
        
        try {
            print=new PrintWriter(socketSender.getOutputStream(),true);
            
print.println("What do you want to do?:\n1.See a patient / Report o EEG o history.");

            buf=new BufferedReader(new InputStreamReader(socketReceiver.getInputStream()));
            Integer num=buf.readNumber(); //No se si existe esto no puedo mirar ahora
        //Hacer esto de q solo se pueda un num del 1 al 2
            switch(num){
                case 1:  receiveClientandReport()
                    break;
                case 2:  receiveClientandEEG()
                    break;
                case 0:
                    break;

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }*/
        
        
        
        
        
        
     /*
        try{
            ois = new ObjectInputStream(is);
            Object newpat;
            ObjectOutputStream objectOut=null;

            while((newpat= ois.readObject())!= null){
                Patient patientconnected = (Patient) newpat;
                Integer dni = patientconnected.getId();
                print=new PrintWriter(socketSender.getOutputStream(),true);
                System.out.println("The patient you are going to send is:\n" + patientconnected.toString()); 
                Patient pat = getPatient(dni);
                objectOut=new ObjectOutputStream(socketSender.getOutputStream());
                objectOut.writeObject(pat);
                //ESCRIBIR AL CLIENTE QUÉ FECHA DE REPORT QUIERE DE ESTE PACIENTE
                //HAY QUE CREAR EN EL CLIENTE QUE SE CORTE EN EL MOMENTO EN EL QUE ESCRIBA UNA FECHA, NO MAS Y DEBERIA HABER TBB UNA EXCEPCION DE QUE NO SON VALIDAS ETC.
                
                print.println("Choose the report's date you want to see: (DD/MM/YY)\n");
                //RECIBIR RESPUESTA Y MOSTRARLE EL REPORT
                buf=new BufferedReader(new InputStreamReader(socketReceiver.getInputStream()));
                String dateString=buf.readLine();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date dateUtil=formato.parse(dateString);
                java.sql.Date dateSql= new java.sql.Date(dateUtil.getTime());
                EEG eeg = PatientManager.viewEEG(dni,dateSql);
                objectOut.writeObject(eeg);
        */
      
        //InetAddress addressServer = null;
        //System.out.println("Type the Address to the server you want to connect" +addressServer);
        //int portNumber = 0;
       /* int portNumber = 9000;
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
        }*/
        
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
