/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;
import Client.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marin
 */
public class PatientManager implements PatientManagerInterface  {
    private Connection c;
	
	public PatientManager(Connection connection) {
		this.c=connection;
	}
	
	
	public void viewReport(String dni, Date date) {
		try {
			String sql = "SELECT patient_id FROM Patients WHERE DNI = ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, "%"+dni+"%");
                        ResultSet rs = prep.executeQuery();
                        int id = rs.getInt("patient_id");
                        
                        String sql1= "SELECT REPORT FROM Reports WHERE patient_id =? AND DATE_REPORT LIKE =?";
                        PreparedStatement prep2 = c.prepareStatement(sql);
			prep.setString(1, "%"+id+"%");
                        prep.setString(2, "%"+date+"%");
			ResultSet rs2 = prep.executeQuery();
                        // COMO GUARDEMOS EL REPORT PONEMOS ESE TIPO DE DATO Y LUEGO rs.getBlob("REPORT");

			while (rs.next()) {
				//
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Patient> showPatients() {
		// To show all Hospitals in our data base
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
		Patient patSelected;
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
                        prep.setDate(5, pat.getDateOfBirth());
                        prep.setString(6, pat.getDni());
                        prep.setString(7, pat.getGender());
			prep.executeUpdate();
			prep.close();
			}
		catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	public Patient getPatient(int pat_id) {
                Patient pat;
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
				pat = new Patient(id, name, lastname, telephone);
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return pat;
		
	}
	
	
	
	
	
	
}