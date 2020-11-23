/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dao.PartenaireDao;



/**
 *
 * @author DELL
 */
public class Partenaire extends User{
    private String nci;
    private String nomComplet;
    private String address;
    private String tel;

    //PartenaireDao manager = new PartenaireDao();
   
    public Partenaire() {
    }

    public Partenaire(String nci, String nomComplet, String address, String tel, String login, String password) {
        super(login, password);
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.address = address;
        this.tel = tel;
       // manager.add(this);
    }
    //SERIALISATION
    public Partenaire(String nci, String nomComplet, String address, String tel) {
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.address = address;
        this.tel = tel;
       // manager.add(this);
    }

    public Partenaire(int id, String nci, String nomComplet, String address, String tel, String login, String password, Boolean etat) {
        super(id, login, password, etat);
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.address = address;
        this.tel = tel;
        
    }

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
    
}
