/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import Client.User;
import Client.Patient;
import Client.Patient;
import Client.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javafx.scene.control.*;
import java.util.Date;
import static javafx.application.Application.launch;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author gabri
 */
public class ModifyInfoController extends User {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Label modifyinformation; //i dont know if its necessary to add here the labels 
    @FXML private TextField Name;
    @FXML private TextField Lastname;
    @FXML private TextField DNI;
    @FXML private TextField Telephone;
    @FXML private TextField Address;
    @FXML private ChoiceBox Gender;
    @FXML private DatePicker DOB;
    @FXML private Button saveModifiedinfo;
    @FXML private Button Back; 
    

    

    
    @FXML void actionSave (ActionEvent evento) throws ParseException {
        Patient.name=Name.getText();
        Patient.lastname=Lastname.getText();
        Patient.dni=DNI.getText();
        Patient.telephone=Telephone.getText();
        Patient.address=Address.getText();
        Patient.gender=Gender.getValue().toString();
        String datestring=DOB.getValue().toString(); //Hay que elegir que lo hagan en un formato concreto (dd/mm/yyy)
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Patient.dateOfBirth= format.parse(datestring);
        User.username=DNI.getText();
        //La contraseña no se
       
    }
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("modifyInfo.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Modify Information");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
