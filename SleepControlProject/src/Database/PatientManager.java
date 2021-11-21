/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Client.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;



public class PatientManager implements PatientManagerInterface  {

   
    private Connection c;
	
	public PatientManager(Connection connection) {
		this.c=connection;
	}
	
	
	public Report viewReport(String dni, java.util.Date dateRep) {
            Report rep = new Report();
            
            try {
			String sql = "SELECT patient_id FROM Patients WHERE DNI = ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, "%"+dni+"%");
                        ResultSet rs = prep.executeQuery();
                        int id = rs.getInt("patient_id");
                        
                        String sql1= "SELECT REPORT FROM Reports WHERE patient_id =? AND DATE_REPORT LIKE =?";
                        PreparedStatement prep2 = c.prepareStatement(sql);
			prep.setString(1, "%"+id+"%");
                        prep.setString(2, "%"+dateRep+"%");
			ResultSet rs2 = prep.executeQuery();
                        while (rs.next()) {
                            java.sql.Date datesql= (java.sql.Date) rs.getDate("report_date");
                            java.util.Date  dat = new java.util.Date(datesql.getTime());
                            String quality=rs.getString("quality");
                            String exhaust=rs.getString("exhaustion");
                            String averageHours=rs.getString("hours");
                            String movem=rs.getString("movement");
                            String timeToFall=rs.getString("time");
                            String res=rs.getString("rest");
                            String awake=rs.getString("awake");
                            String timAwake=rs.getString("times awake");
                            String dreams=rs.getString("dreams");
                            String worr=rs.getString("worries");
                            String mood=rs.getString("mood");
                            String doubts=rs.getString("doubts");
                            rep=new Report(dat,quality,exhaust,averageHours,movem,timeToFall,res,awake,timAwake,dreams,worr,mood,doubts);
                        }
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
            return rep;
	}
	
	public ArrayList<Patient> showPatients() {
		ArrayList<Patient> patList = new ArrayList<Patient>();
		try {
			String sql = "SELECT * FROM Patients";
			PreparedStatement prep = c.prepareStatement(sql);
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				int patId = rs.getInt("patient_id");
				String patName = rs.getString("name");
				String patAddress = rs.getString("lastname");
				String patTele = rs.getString("telephone");
				
				Patient newPatient = new Patient(patId, patName, patAddress, patTele);
				patList.add(newPatient);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return patList;
	}


	public Patient selectPatientByID(int id) {
		Patient patSelected=new Patient();
		try {
			String sql = "SELECT * FROM Patients WHERE patient_id LIKE ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setInt(1, id);
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				String telephone = rs.getString("telephone");
                                patSelected = new Patient(name, lastname,telephone);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return patSelected;
		
	}
	
	public void addpatientbyRegister(Patient pat) {
		try {
     
			String sql = "INSERT INTO Patients (name, lastname, telephone, address,dateBirth,dni,gender)"
					+ " VALUES (?,?,?,?,?,?,?);";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, pat.getName());
			prep.setString(2, pat.getLastname());
			prep.setString(3, pat.getTelephone());
                        prep.setString(4, pat.getAddress());
                        prep.setDate(5, (java.sql.Date) pat.getDateOfBirth());
                        prep.setString(6, pat.getDni());
                        prep.setString(7, pat.getGender());
			prep.executeUpdate();
			prep.close();
			}
		catch(Exception e) {
			e.printStackTrace();
			}
	}
    @Override
         public Patient searchSpecificPatientByDNI(String dni){
             Patient patientfound=new Patient();
		try {
			String sql = "SELECT * FROM Patients WHERE dni LIKE ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, dni);
			ResultSet rs = prep.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("patient_id");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				java.sql.Date dobsql = rs.getDate("dob");
                                java.util.Date  dob = new java.util.Date(dobsql.getTime());
				String address = rs.getString("address");
				String tele = rs.getString("telephone");
				String gender = rs.getString("gender");
				patientfound = new Patient(id,name,lastname,tele,address,dob,dni,gender);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return patientfound;
         }
	
    @Override
	public Patient getPatient(int pat_id) {
                Patient pat = new Patient();
                
		try {
			String sql = "SELECT * FROM Patients WHERE patient_id LIKE ?;";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setInt(1, pat_id);
			ResultSet rs = prep.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("patient_id");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
                                String telephone = rs.getString("lastname");
                                pat.setName(name);
                                pat.setLastname(lastname);
                                pat.setTelephone(telephone);
                                
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return pat;
		
	}

   
	
	
	
	
	
}
