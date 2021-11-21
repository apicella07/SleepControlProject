/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterfaceClient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class ReportHistoryController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TableView reportTable;
    @FXML private Button goBack;
    //@FXML private Button viewReport;
    
    
     public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ReportHistory.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("REPORT HISTORY");
        primaryStage.setScene(scene);
        primaryStage.show();
    }      
    
     public void goBackClientMenu (ActionEvent event) throws IOException{
           Parent root = FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
        
        Scene clientMenu = new Scene(root);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(clientMenu);
        window.show();
     }
     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
