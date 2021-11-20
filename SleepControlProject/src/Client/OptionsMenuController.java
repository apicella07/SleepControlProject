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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class OptionsMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML private Button Back;
    @FXML private Button ReportHistory;
    @FXML private Button DailyReport;
    @FXML private Button ModifyInfo;
    @FXML
    private Label clientmenu;
    
    
       public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("CLIENT MENU");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReportHistory(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("ReportHistory.fxml"));
        
        Scene reportHistory = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(reportHistory);
        window.show();
    }

    @FXML
    private void TodaysReport(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("DailyReport.fxml"));
        
        Scene dailyRep = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(dailyRep);
        window.show();
    }

    @FXML
    private void ModifyInformation(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("ModifyInformation.fxml"));
        
        Scene modifyInfor = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(modifyInfor);
        window.show();
    }

    @FXML
    private void goBackLogin(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene login = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(login);
        window.show();
    }
    
       @FXML
    private void viewEEG(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("viewEEG.fxml"));
        
        Scene vieweeg = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(vieweeg);
        window.show();
    }
    
    
           @FXML
    private void EEGhistory(javafx.event.ActionEvent event) throws IOException {
               
        Parent root = FXMLLoader.load(getClass().getResource("EEGhistory.fxml"));
        
        Scene historyeeg = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(historyeeg);
        window.show();
    }
    

    @FXML
    private void start(MouseEvent event) {
    }
    
}
