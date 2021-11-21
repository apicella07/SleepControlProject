/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;



public interface DBManagerInterface {
        public void connect();
	public void disconnect();
	public void createTables();
	public void deleteTables();
	
	public PatientManagerInterface getPatientManager();
	public int getLastId();
}
