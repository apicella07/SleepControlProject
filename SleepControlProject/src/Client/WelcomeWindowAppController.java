/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gabri
 */
public class WelcomeWindowAppController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML private TextField Name;
    @FXML private TextField Lastname;
    @FXML private TextField  DNI;
    @FXML private TextField Telephone;
    @FXML private TextField Address;
    @FXML private ChoiceBox Gender;
    @FXML private ChoiceBox<?> date;
    @FXML private TextField Password;
    @FXML private TextField ConfirmPassword;
    @FXML private Button Save;
    @FXML private Button LogIn;
    
    
    void actionSave (ActionEvent evento) throws ParseException {
        //Patient.name=Name.getText();
        //Patient.lastname=Lastname.getText();
        //Patient.dni=DNI.getText();
      //  Patient.telephone=Telephone.getText();
        //Patient.address=Address.getText();
    //    Patient.gender=Gender.getValue().toString();
      //  String datestring=Dob.getValue().toString(); //Hay que elegir que lo hagan en un formato concreto (dd/mm/yyy)
        //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    //    Patient.dateOfBirth= format.parse(datestring);
     //   User.username=DNI.getText();
        //La contraseña no se
       
    }
    
        void log(ActionEvent event) {

    }
    
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeWindowApp.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("WELCOME");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void log(javafx.event.ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene Loginscene = new Scene(root);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(Loginscene);
        window.show();
       
    }
    
}
