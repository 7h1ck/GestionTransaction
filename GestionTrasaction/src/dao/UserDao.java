/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.User;

/**
 *
 * @author DELL
 */
public class UserDao implements IDao<User> {
    
    protected static int nbreUser;


    private  List<User> users;

    public UserDao() {
        this.users = new ArrayList<>
        (
                Arrays.asList
            (
                new User("admin","admin"),
                new User("partenaire","partenaire"),
                new User("adminSys","adminSys")
            )
        );
    }

    @Override
    public User add(User user) {
        user.setId(++nbreUser);
        this.users.add(user);
        return user;
    }

    @Override
    public List<User> selectAll() {
        return this.users;
    }
    
}
