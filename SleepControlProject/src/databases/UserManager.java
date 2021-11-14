/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import databases.*;
import Client.*;
import java.sql.Connection;
//import ui.InputFlow;
/**
 *
 * @author marin
 */
public class UserManager implements UserManagerInterface {

	private EntityManager em;
        private Connection c;
	
	@Override
	public void connect() {
		em = Persistence.createEntityManagerFactory("Prosthetic-provider").createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("PRAGMA foreign_keys=ON").executeUpdate();
		em.getTransaction().commit();
	}

	@Override
	public void disconnect() {
		em.close();
	}

	@Override
	public void createUser(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}
        @Override
	public User getUserByDNI(String dni) {
		Query q = em.createNativeQuery("SELECT username, password, from patients WHERE username =?", User.class);
		q.setParameter(1,dni);   
		User user = (User) q.getSingleResult();
		return user;	
	}
	
	@Override
	public void updateUser(String username, byte[] password, int num) {
		try {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Query q = em.createNativeQuery("SELECT * FROM patients WHERE username = ?", User.class);
		q.setParameter(1,username);
		User user = (User) q.getSingleResult();
				switch(num){
					case 1: 
						byte[] newPassword = (reader, "Introduce the new password:");
						em.getTransaction().begin();
						user.setPassword(newPassword);
						em.getTransaction().commit();
						break;
					}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		em.close();
	}

	public void deleteUser(User user) {
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		
	}
	
	@Override
	public User checkPassword(User userps) {
		User user = null;
		try {
			String sql="SELECT * FROM Patients WHERE dni = ? AND password = ?";
                        
			PreparedStatement prep = c.prepareStatement(sql);
                        ResultSet rs = prep.executeQuery();
                        rs.setString(1, userps.getUsername());
			rs.setString(2, userps.getPassword());
			user = new User(username,byte[] password);
                        
		} catch (NoResultException nre) {
			// This is what happens when no result is retrieved
			return null;
		}
		return user;
	}

}
