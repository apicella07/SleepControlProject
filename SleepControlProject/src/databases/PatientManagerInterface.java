/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import Client.*;
import java.util.ArrayList;
import java.util.Date;



public interface PatientManagerInterface {
    public Report viewReport(String dni, Date dat);
    public void addpatientbyRegister(Patient pat);
    public Patient searchSpecificPatientByDNI(String dni);
    public Patient getPatient(int pat_id);
    public ArrayList<Patient> showPatients();
    public Patient selectPatientByID(int id);
    
    //AÑADIR UN VER EEG SEGUN DATE Y DNI
    //public EEG viewEEG(String dni, Date dat);
    
    public EEG vieEEG(String dni, Date date);
    
    //OTRO GETPATIENT CON UN DNI, NO CON ID!!!!
    // getPatientByDNI(dni)
    
    public Patient getPatientByDNI(String dni);
    
    //Y UN HISTORY DE EEGS Y HISTORY DE REPORTS: Sería una tabla que incluya una columna con fechas y al lado el nombre del report o del EEG
    //--> Si queremos un nombre tendríamos que añadir a todas las funciones y en las clases REPORT e EEG un atributo nombre para así darlo!!
    // ESq lo de la tabla es como lo hacía adri --> 
    //YO SUPONGO QUE SEA DEVOLVER UN ARRAY DE LAS FECHAS EN UN MÉTODO Y OTRO DE LOS NOMBRES EN OTRO 
    //Y LUEGO UN  MÉTODO QUE CREE UNA TABLA CON AMBOS!
    
    //viewEEGHistory(dni)
    
    public EEG viewEEGHistory( String dni);
    
    //viewReportHistory(dni)
    public Report viewReportHistory(String dni);
    
    

}
