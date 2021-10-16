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
    
        @FXML
    public void next(ActionEvent event) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String passIntroduced = password.getText();
        User us = new User(userName.getText(), password.getText());
        
        if (!checkUser(us, passIntroduced)) {
            error.setText("Wrong user or password");
        } else {
            System.out.println("Hello" + userName);

            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(getClass().getResource(".fxml"));
            Parent parent = loader.load();

            Scene scene = new Scene(parent);

            NextWindowController controller = loader.getController();
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


            window.setScene(scene);
            window.show();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
