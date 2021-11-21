/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterfaceClient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
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
 * @author gabri
 */
public class DailyReportController implements Initializable {

      public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("DailyReport.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("DAILY REPORT");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackClientMenu(javafx.event.ActionEvent event) throws IOException {
                    
        Parent root = FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
        
        Scene reportHistory = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(reportHistory);
        window.show();
    }
    /*
        String sleepQuality, exhaustion, averageHours, movement, timeToFallAsleep, rest, stayAwake, timesAwake, dreams, worries, todaysMood, doubtsForDoctor;
    Date date;//no lleva a nada, preguntar alberto
    
    @FXML void saveReport (ActionEvent evento) throws ParseException {
        
        date = new Date();
        
        // new label for date
        // Casting de date a String
        // dateLabel.setText("STRING QUE TENGO EN LA VARIABLE ANTERIOR");
        sleepQuality=answer1.getText();
        exhaustion=answer2.getText();
        averageHours=answer3.getText();
        movement=answer4.getText();
        timeToFallAsleep=answer5.getText();
        rest=answer6.getText();
        stayAwake=answer7.getText();
        timesAwake=answer8.getText();
        dreams=answer9.getText();
        worries=answer10.getText();
        todaysMood=answer11.getText();
        doubtsForDoctor=doughts.getText();
        
        
        Report report1 = new Report (date,sleepQuality, exhaustion, averageHours, movement, timeToFallAsleep, rest, stayAwake, timesAwake, dreams, worries, todaysMood, doubtsForDoctor);
        
    }
    */
}
