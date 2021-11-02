/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.util.Date;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author gabri
 */
public class Patient {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    private Integer id; 
    private String name;
    private String lastname;
    private String telephone;
    private String address;
    private Date dateOfBirth;
    private String dni; 
    private String gender; 
    
    public Patient(Integer id) {
		super();
		this.id = id;
	}


	public Patient(Integer id, String name, String lastname, String telephone, String addres, Date dob, String dni, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.telephone = telephone;
		this.dateOfBirth=dob;
		this.gender = gender;
		this.address = addres;
	}
    public Patient(String name, String lastname, String telephone, String address, Date dateOfBirth, String dni, String gender){
        super();
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dni = dni;
        this.gender = gender;
    }
    
    public Patient(Integer id,String name, String lastname, String telephone){
        super();
        this.id=id;
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
    }
    public Patient(String name, String lastname, String telephone){
        super();
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
    }
    
    
  public void modifyInformation() throws IOException{
        int option=0;
        Boolean correctOption = false;
        do{
            System.out.println("What do you want to modify 1 or 2?:\n1.Telephone.\n2.Address.");
        
        try{
            option = Integer.parseInt(reader.readLine());
            correctOption = true;
          
        }catch(NumberFormatException e){
            System.out.println("Insert an integer please: ");
        }
        }
        while(correctOption == false);
        
        switch(option){
            case 1: 
                System.out.println("Write your new telephone: ");
                String tele = reader.readLine();
                setTelephone(tele);
                System.out.println("Your new telephone is: ");
                this.telephone=getTelephone();   
                
               case 2: 
                System.out.println("Write your new address: ");
                String addr = reader.readLine();
                 setAddress(addr);
                 System.out.println("Your new address is: ");
                this.address=getAddress();  
                
        }
    }
  
    public static Report todaysReport(){
        Report newreport=null;
        try{
            
        System.out.println("Today's Report: \n");
        System.out.println("1.Have you slept well during the night? Yes or no");
        String sleepQuality = reader.readLine();
        System.out.println("2.Do you feel exhausted like you didn’t sleep through the night? yes or no");
        String exhaustion = reader.readLine();
        System.out.println("3. What is the average of hours you sleep daily? ");
        String averageHours = reader.readLine();
        System.out.println("4.Did you stir a lot during the night?");
        String movement = reader.readLine();
        System.out.println("5. How long until you fall asleep? Does it take too long or a few minutes?");
        String timeToFallAsleep = reader.readLine();
        System.out.println("6. Have you rested? Yes or no");
        String rest = reader.readLine();
        System.out.println("7. Are you able to stay awake during the day? yes or no");
        String stayAwake = reader.readLine();
        System.out.println("8. How many times did you wake up during the night?");
        String timesAwake = reader.readLine();
        System.out.println("9. Do you remember the dream? yes or no");
        String dreams = reader.readLine();
        System.out.println("10. Do you feel nervous or have any worries? yes or no");
        String worries = reader.readLine();
        System.out.println("11. How do you feel today? Symptons?");
        String todaysMood = reader.readLine();
        System.out.println("Do you have any doubts for the Doctor?");
        String doubtsForTheDoctor = reader.readLine();
        
        System.out.println("Report completed!");
        
        Date today = Calendar.getInstance().getTime();
       // SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy"); // ver si podemos al cambiarlo a Date sirve 
        //String date = sdf.format(new Date()); 
         newreport = new Report(today, sleepQuality, exhaustion,averageHours, movement, timeToFallAsleep, rest, stayAwake, timesAwake, dreams, worries, todaysMood, doubtsForTheDoctor);
        System.out.println("Your report has been saved correctly");
         
    }catch(Exception e){
            e.printStackTrace();
            }
    return newreport;
    }
    
    public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
  
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void viewEEG(){
          
    }
    
  
    
    
    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", lastname=" + lastname + ", telephone=" + telephone + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", dni=" + dni + ", gender=" + gender + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

public static  void main(String[] args){
        Report report = todaysReport();
        //report = ;
        System.out.println(report);
        
        System.out.println(report.getTodaysDate());
    
}
}
    
    
       

