/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mariaceleste
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userName;
    @FXML
    private TextField password;
   /* 
    public void next(ActionEvent event) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String passIntroduced = password.getText();
       // User us = new User(userName.getText(), passIntroduced);
        
        
        //ESTE IF GENERARLO CUANDO TENGAMOS LA BASE DE DATOS
        //POR AHORA TODOS LOS USERS Y PASSWORDS SEAN TRUE, ESTEN BIEN DE POR SI
        /*
        if (!checkUser(us, passIntroduced)) {
            error.setText("Wrong user or password");
        } else {

            System.out.println("Hello" + userName);

            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(getClass().getResource("ClientMenu.fxml"));
            Parent parent = loader.load();

            Scene scene = new Scene(parent);

            //NextWindowController controller = loader.getController();
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


            window.setScene(scene);
            window.show();
      //  }
    }
    */
    
        public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("LOGIN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
   /* @FXML
    public void ContinueButton(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ClientMenu.fxml"));
        
        Scene loginScene = new Scene(root);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(loginScene);
        window.show();
    }
    */
    
    @FXML
    public void GoBack (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("WelcomeWindowApp.fxml"));
        
        Scene loginScene = new Scene(root);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(loginScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ContinueButton(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("OptionsMenu.fxml"));
        
        Scene loginScene = new Scene(root);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(loginScene);
        window.show();
    }
    
}
