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
import javafx.scene.chart.LineChart;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 */
public class ViewEEGController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private LineChart eegtablevalues;
    @FXML private Button goBack;
    
    
    
       public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ViewEEG.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("EEG RECORDING");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     
       
        @FXML
    private void goBackOptionsMenu(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
        
        Scene optionsmenu = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(optionsmenu);
        window.show();
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
