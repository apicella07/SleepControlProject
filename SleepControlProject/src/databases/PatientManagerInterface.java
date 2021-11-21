/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import Client.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public interface PatientManagerInterface {
    public Report viewReport(String dni, Date dat);
    public void addpatientbyRegister(Patient pat);
    public Patient getPatientByDNI(String dni);
    public Patient getPatient(int pat_id);
    public ArrayList<Patient> showPatients();
    public Patient selectPatientByID(int id);
    public ArrayList<EEG> viewEEGHistory(String dni);
    public EEG viewEEG(String dni, Date date);
    public List<Report> viewReportHistory(String dni);
    
   
    

}
