/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.io.Serializable;
import java.util.Objects;
import javafx.stage.Stage;


public class User implements Serializable { 
    
    private String username;
    private byte[] password;
    
    private static final long serialVersionUID = -1;
   
  
    public User(){
        super();
    }
    
    public User(String username, byte[] password){
        super();
        this.username = username;
        this.password = password;
    }
    
    
    /*
    public boolean checkUser(Users u, String pas) {
        /* NECESITAMOS QUE users SEA LA LISTA DE USERS EN NUESTRA DATABASE 
        users=getUser();
        for (Users user: users) {
            if(user.authenticate(pas, user.getPassword(), user.getSalt())){
                return true;
            }
        }
        return false;
    }
    */
    
    
    
    /* ESTO NO AUNNNN
    public void initData(Socket socket, Stage stage, ObjectInputStream oi, ObjectOutputStream oo) throws IOException {
        this.socket = socket;
        this.window = stage;
        this.fromServer = oi;
        this.toServer = oo;
        try {
            users = (ArrayList<Users>) fromServer.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        window.setOnCloseRequest((event) -> {
            releaseResources();
        });
    }
    
    public void initDataBack(Socket socket, Stage stage, ObjectInputStream oi, ObjectOutputStream oo, ArrayList<Users> users) throws IOException {
        this.socket = socket;
        this.window = stage;
        this.fromServer = oi;
        this.toServer = oo;
        this.users=users;
        
        window.setOnCloseRequest((event) -> {
            releaseResources();
        });
    }

    ESTO DE ARRIBA NO SABEMOS AÚN Y TIENE QUE VER CON LOS SOCKETS PERO SI NO DA EL ERROR LO DE LA CONTRASEÑAA!!
    */
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    
}
