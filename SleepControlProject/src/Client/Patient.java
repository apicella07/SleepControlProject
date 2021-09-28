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

/**
 *
 * @author gabri
 */
public class Patient {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    private  String name;
    private String lastname;
    private String telephone;
    private String address;
    private Date dateOfBirth;
    private String dni; 
    private String gender; 
    
    public Patient (){
        super();
    }
    
    public Patient(String name, String lastname, String telephone, String address, Date dateOfBirth, String dni, String gender ){
        super();
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dni = dni;
        this.gender = gender;
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

    
    
       
}
