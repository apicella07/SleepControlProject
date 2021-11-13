
package Client;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EEG {
     InputStream inputStream=null;
     PrintWriter printWriter=null;
     BufferedReader bufferedReader=null;
     Socket socket=null;
     ArrayList<Integer> eegValues = new ArrayList<Integer>();
    //esto es donde el bitalino va a guardar los resulrados 
    // En el report poner como id la fecha y así la persona puede decidir que hemograma ver y coger el que quiere 
 //Lo que escribo sería cómo el paciente envía los EEG:    //esto es donde el bitalino va a guardar los resulrados 
    // En el report poner como id la fecha y así la persona puede decidir que hemograma ver y coger el que quiere 
 //Lo que escribo sería cómo el paciente envía los EEG:
/*
        try {
            socket=new Socket("localhost",9000);
            inputStream = socket.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(EEG.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
  
    try {

    } catch(IOException ex) {
        System.out.println("Unable to send the EEG values.");
        Logger.getLogger(EEG.class.getName().log(level.SEVERE,null,ex));
    } finally {
        releaseResources(inputStream, socket);
    }
    */
}
