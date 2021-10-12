/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
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
 *
 * @author marin
 */
public class WelcomeWindowController extends User {
    @FXML private TextField Name;
    @FXML private TextField Lastname;
    @FXML private TextField DNI;
    @FXML private TextField Telephone;
    @FXML private TextField Address;
    @FXML private TextField Password;
    @FXML private TextField ConfirmPassword;
    @FXML private ChoiceBox Gender;
    @FXML private ChoiceBox Dob;
    
    
    @FXML void actionSave (ActionEvent evento) throws ParseException {
        Patient.name=Name.getText();
        Patient.lastname=Lastname.getText();
        Patient.dni=DNI.getText();
        Patient.telephone=Telephone.getText();
        Patient.address=Address.getText();
        Patient.gender=Gender.getValue().toString();
        String datestring=Dob.getValue().toString(); //Hay que elegir que lo hagan en un formato concreto (dd/mm/yyy)
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Patient.dateOfBirth= format.parse(datestring);
        User.username=DNI.getText();
        //La contraseña no se
       
    }
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeWindow.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("WELCOME");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
