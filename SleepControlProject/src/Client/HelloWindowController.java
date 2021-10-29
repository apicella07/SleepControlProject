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
import java.io.IOException;
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
public class HelloWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
        @FXML private Button getStartedButton;
        
        @FXML
        private void buttonGetStarted(ActionEvent event){
            
        }
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("HelloWindow.fxml"));
            Scene scene= new Scene(root);
            primaryStage.setTitle("SLEEP CONTROL");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        
        public void changeScreenWelcome(ActionEvent event) throws IOException{
            Parent welcomeWindow = FXMLLoader.load(getClass().getResource("WelcomeWindow.fxml"));
            Scene welcomeScene = new Scene(welcomeWindow);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(welcomeScene);
            window.show();
            
            
        }
        
        
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
             

    }
    
}