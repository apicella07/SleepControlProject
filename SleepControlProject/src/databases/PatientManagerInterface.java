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
    
    

}
