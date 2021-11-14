/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;
import java.util.List;
import Client.User;

/**
 *
 * @author marin
 */
public interface UserManagerInterface {
    
	public void connect();

	public void disconnect();

	public void createUser(User user);

	public User checkPassword(User user);
        
        public User getUserByDNI(String dni);

	public void updateUser(String username, byte[] password, int num);
        
	public void deleteUser(User user);

}
