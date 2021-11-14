/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import Client.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marin
 */
public interface PatientManagerInterface {
    public void viewReport(String dni, Date dat);
    public void addpatientbyRegister(Patient pat);
    public Patient searchSpecificPatientByDNI(String dni);
    public Patient getPatient(int pat_id);
    public ArrayList<Patient> showPatients();
    public Patient selectPatientByID(int id);
    
    

}
