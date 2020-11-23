/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DELL
 */
public class AdminSystem extends User {
    private String fonction;

    public AdminSystem() {
    }

    public AdminSystem(String fonction, String login, String password) {
        super(login, password);
        this.fonction = fonction;
    }


    public AdminSystem(String fonction, int id, String login, String password, Boolean etat) {
        super(id, login, password, etat);
        this.fonction = fonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    
    
    
    
}
