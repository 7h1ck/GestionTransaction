/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dao.UserDao;

/**
 *
 * @author DELL
 */
public class User {
    protected int id;

   
    protected String login;
    protected String password;
    protected Boolean etat;
    
    public User() {
           // UserDao manager = new UserDao();

        //manager.add(this);
    }

    public User(String login, String password) {
            //UserDao manager = new UserDao();

        //this.id = ++nbreUser;
        this.login = login;
        this.password = password;
        //manager.add(this);
    }

    public User(int id, String login, String password, Boolean etat) {
            //UserDao manager = new UserDao();

        this.id = id;
        this.login = login;
        this.password = password;
        this.etat = etat;
        //manager.add(this);
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
     public void setId(int id) {
        this.id = id;
    }
    
}
