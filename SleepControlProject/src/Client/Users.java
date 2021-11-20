/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Objects;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;



public class Users implements Serializable{
    private static final long serialVersionUID=-123;
    private String user;
    byte[] encriptPassword;
    private byte[] salt;
    public Users(String user){
        this.user=user;
    }
    public Users(String u, String pas) throws NoSuchAlgorithmException, InvalidKeySpecException{
        this.user=u;
        setSalt();
        this.encriptPassword=getEncriptPassword(pas, this.salt);
    }

    @Override
    public String toString() {
        return "Users{" + "user=" + user + ", password=" + encriptPassword + ", salt=" + salt + '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public byte[] getPassword() {
        return encriptPassword;
    }

    public void setPassword(byte[] pas) {
        this.encriptPassword = pas;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt() throws NoSuchAlgorithmException {
        this.salt = generateSalt();
    }
    
    public byte[] getEncriptPassword(String password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {

        String algorithm = "PBKDF2WithHmacSHA1";
        int derivedKeyLength = 160;

        int iterations = 1000;

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, derivedKeyLength);

        SecretKeyFactory f = SecretKeyFactory.getInstance(algorithm);

        return f.generateSecret(spec).getEncoded();
    }
    
    public byte[] generateSalt() throws NoSuchAlgorithmException{
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt =new byte[8];
        random.nextBytes(salt);
        
        return salt;
    }
    
    public byte[] authenticate(String password,byte[] encriptPassword,byte[] salt) throws InvalidKeySpecException, NoSuchAlgorithmException{
        String algorithm = "PBKDF2WithHmacSHA1";
        int derivedKeyLength = 160;

        int iterations = 1000;

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, derivedKeyLength);

        SecretKeyFactory f = SecretKeyFactory.getInstance(algorithm);

        return f.generateSecret(spec).getEncoded();
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
        final Users other = (Users) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }
}
