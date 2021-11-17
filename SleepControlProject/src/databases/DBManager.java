/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import java.sql.*;
import Client.User;

/**
 *
 * @author marin
 */
public class DBManager implements DBManagerInterface {

	private Connection c;
	private PatientManager patient;

	public DBManager() {
		super();
	}

	public void connect() {
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:./db/Prosthetic_DB.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			
			// create PatientManager
			patient = new PatientManager(c);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setC(Connection c) {
		this.c = c;
	}

	public void disconnect() {
		try {
			// Close database connection
			c.close();
			// System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createTables() {
		try {
			// Open database connection
			// Class.forName("org.sqlite.JDBC");
			// Connection c =
			// DriverManager.getConnection("jdbc:sqlite:./db/SleepControlDB.db");
			// c.createStatement().execute("PRAGMA foreign_keys=ON");
			// System.out.println("Database connection opened.");
			// connect();

			// Create tables: begin
			Statement stmt1 = c.createStatement();
			String sql1 = "CREATE TABLE Patients " 
					+ " (patient_id	INTEGER PRIMARY KEY AUTOINCREMENT," 
					+ "NAME TEXT,"
					+ "LASTNAME TEXT,"
					+ "TELEPHONE TEXT," 
					+ "ADDRESS TEXT," 
                                        + "DOB DATE,"
                                        + "DNI TEXT,"
                                        + "GENDER TEXT";

			stmt1.executeUpdate(sql1);
			stmt1.close();

			Statement stmt2 = c.createStatement();
			String sql2 = "CREATE TABLE Reports " 
					+ "(patient_id	INTEGER PRIMARY KEY AUTOINCREMENT," 
					+ "PATIENT_DNI TEXT,"
					+ "REPORT_DATE DATE," 
					+ "QUALITY TEXT,"+ "EXHAUSTION TEXT," 
                                        + "HOURS TEXT,"
                                        +"MOVEMENT TEXT,"+"TIME TEXT,"
                                        +"REST TEXT,"+"AWAKE TEXT,"+"TIMES AWAKE"+"DREAMS TEXT,"+"WORRIES TEXT,"+"MOOD TEXT,"+"DOUBTS TEXT)";
  
			stmt2.executeUpdate(sql2);
			stmt2.close();


			Statement stmt3 = c.createStatement();
			String sql3 = "CREATE TABLE EEGs " 
					+ "(patient_id INTEGER PRIMARY KEY AUTOINCREMENT," 
					+ "PATIENT_DNI TEXT,"
					+ "EEG_DATE DATE," 
					+ "EEG TEXT)";

			stmt3.executeUpdate(sql3);
			stmt3.close();
                        Statement stmt4 = c.createStatement();
			String sql4 = "CREATE TABLE Users " 
					+ "(patient_id INTEGER PRIMARY KEY AUTOINCREMENT," 
					+ "PATIENT_DNI TEXT,"
                                        + "Password";

			stmt3.executeUpdate(sql4);
			stmt3.close();

			System.out.println("Tables created.");
			// Create table: end
			//
			// - Set initial values for the Primary Keys
			// - Don't try to understand this until JPA is explained
			// This is usually not needed, since the initial values
			// are set when the first row is inserted, but since we
			// are using JPA and JDBC in the same project, and JPA
			// needs an initial value, we do this.
			
			Statement stmtSeq = c.createStatement();
			String sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES('Patients', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('Reports', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('EEGs', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			stmtSeq.close();
			
		

			// Close database connection
			// c.close();
			// System.out.println("Database connection closed.");
	
			
			
			
		} catch (SQLException e) {
			if (e.getMessage().contains("already exists")) {
			}else{
				e.printStackTrace();
			}
		}
	}

	
        @Override
	public PatientManager getPatientManager() {
		return patient;
	}
	

	@Override
	public int getLastId() {
		int result = 0;
		try {
			String query = "SELECT last_insert_rowid() AS lastId";
			PreparedStatement p = c.prepareStatement(query);
			ResultSet rs = p.executeQuery();
			result = rs.getInt("lastId");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	

	public void deleteTables() {
		try {

			// Drop tables: begin
			
			Statement stmt2 = c.createStatement();
			String sql2 = "DROP TABLE Patients";
			stmt2.executeUpdate(sql2);
			stmt2.close();
			Statement stmt3 = c.createStatement();
			String sql3 = "DROP TABLE Reports";
			stmt3.executeUpdate(sql3);
			stmt3.close();
			Statement stmt4 = c.createStatement();
			String sql4 = "DROP TABLE EEGs";
			stmt4.executeUpdate(sql4);
			stmt4.close();
			System.out.println("Tables removed.");
			// Drop tables: end

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


}

