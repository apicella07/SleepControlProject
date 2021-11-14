/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class GetStartedController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
        @FXML private Button btnGETSTARTEDClicked;

    
    
     public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("GetStarted.fxml"));
        
        //will load a different xml when the button is pressed 
        //what we are looking forward is when clicking the button of the getstarted scene changes into the following one
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("SLEEP CONTROL");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
     
        public void changeScreenButtonWhenPushed(ActionEvent event) throws IOException{
             
           Parent welcomeWindow = FXMLLoader.load(getClass().getResource("WelcomeWindowApp.fxml"));
           Scene welcomeScene = new Scene(welcomeWindow);
           
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow(); //node object you can get the scene and the windowand cast it as a scene
           
           window.setScene(welcomeScene);
           window.show();
        }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
