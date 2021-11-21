/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterfaceClient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import BITalino.BITalino;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import BITalino.BitalinoDemo;
import Client.Patient;
import Client.Users;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author mariaceleste
 */
public class BitalinoRecordedDataController implements Initializable {

    private Socket socket;
    private ObjectOutputStream toServer;
    private ObjectInputStream fromServer;
    
    private ObservableList list = FXCollections.observableArrayList();
    private BitalinoDemo bitalinodemo = new BitalinoDemo();
    
    @FXML private Label label1;
    @FXML private Button next;
    @FXML private Button startrecording;
    
    private BITalino bitalino = null;
    private ArrayList<Integer> eegValues = new ArrayList();
    private Patient patient = new Patient();
    private Stage window;
    private ArrayList<Users> users = new ArrayList<Users>();
    

    public void init(Patient patient, Socket socket, Stage stage, ObjectInputStream IN, ObjectOutputStream OUT,  ArrayList<Users> users)  {
      this.patient = patient;
      this.socket = socket;
      this.fromServer=IN;
      this.toServer=OUT;
      this.patient.setEEG(new ArrayList());
      this.window=stage;
      this.users=users;
        window.setOnCloseRequest((event) -> {
            releaseResources();
        });
    } 
    
        @FXML
    private void displayValue(ActionEvent event){

            label1.setText("         RECORDING SIGNALS...");
           
            BitalinoDemo.startEEGvalues();
            this.eegValues = BitalinoDemo.eegValues;
            bitalinoSetting();
        
    }
    


    public void bitalinoSetting(){
        patient.setEEGToZero();
        
        patient.setEEG(eegValues);
        label1.setText("     DONE");
        next.setDisable(false);
    }
     @FXML
    public void changeSceneToECG(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("EEG.fxml"));
        Parent ecgLoad = loader.load();
        
        Scene ecgScene = new Scene(ecgLoad);  
        
       // EEGController controller = loader.getController();
        //controller.initData(lead, patient, socket, window, fromServer, toServer, users);
        
            
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(ecgScene);
        window.show();
        
    }
    
    @FXML
    public void changeSceneToShowPatient(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowPatient.fxml"));
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);             
       // ShowPatientController controller = loader.getController();
        //controller.initData(patient, socket, window, fromServer, toServer, users);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
        
    private void releaseResources()  {
        try {
            toServer.writeObject("logout");
        } catch (IOException ex) { 
            Logger.getLogger(BitalinoRecordedDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            toServer.close();
        } catch (IOException ex) { 
            Logger.getLogger(BitalinoRecordedDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fromServer.close();
        } catch (IOException ex) {
            Logger.getLogger(BitalinoRecordedDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(BitalinoRecordedDataController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
