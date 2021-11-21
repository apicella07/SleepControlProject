/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterfaceClient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
public class ConnectToServerController implements Initializable {


    private Socket socket;
    private InetAddress serverAddress;
    private int serverPort;
    
    
    @FXML private TextField address;
    @FXML private TextField port;
    @FXML private Label label;
    
      public void connectServer(InetAddress addressServer, int portServer, ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        LoginController controller = loader.getController();
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        try {
            socket = new Socket(addressServer, portServer);
            ObjectInputStream fromServer= new ObjectInputStream(this.socket.getInputStream());
            ObjectOutputStream toServer= new ObjectOutputStream(this.socket.getOutputStream());

            try{
                controller.initData(socket, window, fromServer, toServer);
            }catch(Exception e){
                e.printStackTrace();
            }
           
            window.setScene(scene);
            window.show();

        } catch (Exception e) {
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(getClass().getResource("ErrorConnection.fxml"));
            Parent tableViewParent = loader3.load();

            Scene secondScene = new Scene(tableViewParent);

            Stage secondStage = new Stage();
            secondStage.setTitle("Error");
            secondStage.setScene(secondScene);

            secondStage.show();
        }
    
    }
    
    private boolean checkAddress(String s) {
        try{
            InetAddress.getByName(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    private boolean checkPort(String s) {
        try{
            Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    @FXML
    public void connect(ActionEvent event) throws IOException{
        label.setText("");
        if(!checkAddress(address.getText()) ){
            label.setText("Not a valid address");  
        } else if(!checkPort(port.getText())){ 
            label.setText("Not a valid port");
        }else{
            serverAddress= InetAddress.getByName(address.getText());
            serverPort= Integer.parseInt(port.getText());
            
            connectServer(serverAddress, serverPort, event);
        } 
    }
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText("");
        
    }
    
}
