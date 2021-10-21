


package Client;
import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import Client.User;
import Client.Patient;
import Client.Patient;
import Client.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javafx.scene.control.*;
import java.util.Date;
import static javafx.application.Application.launch;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Lore
 */
public class ClientMenuController extends User {
    
    @FXML 
    private Label clientmenu;
    @FXML 
    private Button ReportHistory;
    @FXML 
    private Button DailyReport;
    @FXML 
    private Button ModifyInfo;
    @FXML
    private Button Back; 

    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ClientMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("CLIENT MENU");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void click(javafx.event.ActionEvent event) {
    }

    @FXML
    private void start(MouseEvent event) {
    }

}
