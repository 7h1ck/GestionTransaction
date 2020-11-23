/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Partenaire;

/**
 *
 * @author DELL
 */
public class PartenaireDao implements IDao<Partenaire>{
    public List<Partenaire> partenaires;
    //private UserDao ud ;

    public PartenaireDao() {
        this.partenaires = new ArrayList<Partenaire>(Arrays.asList(
                new Partenaire(1,"2018HV3","BARA Diop","Mbacké", "775436767", "bara@", "nvbfhfjf",true),
                new Partenaire(2,"nci","YADE","Mbacké", "775436767", "bara@yade", "nvbfhfjf",true)
        ));
    }

    @Override
    public Partenaire add(Partenaire partenaire) {
        //this.ud.add(partenaire);
        this.partenaires.add(partenaire);
        return partenaire;
    }

    @Override
    public List<Partenaire> selectAll() {
        return this.partenaires;
    }
    
}
