/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import models.User;
import services.Security;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ConnexionController implements Initializable {

    @FXML
    private TextField txtLogin;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Text txtAnonce;
    
    private User user;

    
    private Security connexion;

    /**
     * Initializes the controller class.
     * 
     * 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.connexion = new Security();
    }    

    @FXML
    public User hundleConnexion(ActionEvent event) {
        //this.user = new User(txtLogin.getText(),txtPassword.getText());
        
        this.user = connexion.logOn(txtLogin.getText(),txtPassword.getText());
        if(this.user==null){
            this.txtAnonce.setText("L'utilisateur ou le mot de passe est incorrect");
            return this.user;

        }
        else
        {
            this.txtAnonce.setText("Connexion valide");
            return this.user;
        }
    }
    
    public User getUser() {
        return user;
    }
    
}
