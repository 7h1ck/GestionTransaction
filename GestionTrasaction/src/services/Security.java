/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.PartenaireDao;
import dao.UserDao;
import java.util.List;
import models.Partenaire;
import models.User;

/**
 *
 * @author DELL
 */
public class Security {
    //private List<User> users;
    private UserDao userDao;
    //private List<Partenaire> partenaires;
    //private PartenaireDao partenaireDao;
   
    public Security() {
        this.userDao = new UserDao();
        //this.users = userDao.selectAll();
        //this.PartenaireDao = new PartenaireDao();
        //this.partenaires = partenaireDao.selectAll();
    }
    //public Partenaire addComptePartenaire(String login, String password, String nci, String nomComplet, String address, String tel){
       // Partenaire p = new Partenaire(login, password, nci, nomComplet, address, tel);
        //PartenaireDao.partenaires.add(p);
        //this.partenaires.add(p);
        
       // return p;
    //}
    /*
    public void addCompteConnexion(String login, String password){
        User usr = new User(login,password);
        this.userDao.add(usr);
        this.users.add(usr);
    }
    */
    public User logOn(String login, String password) 
    {
        List <User> users = this.userDao.selectAll();
        for(User user:users)
        {
            if(user.getLogin().equals(login) && user.getPassword().equals(password))
            {
                return user;
            }
        }
        
        return null;
    }
    
    
}