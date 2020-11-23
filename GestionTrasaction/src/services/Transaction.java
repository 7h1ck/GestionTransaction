/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CompteDao;
import dao.DepotDao;
import dao.PartenaireDao;
import dao.TransactionDao;
import dao.UserDao;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import models.Compte;
import models.Depot;
import models.Partenaire;
import models.User;

/**
 *
 * @author DELL
 */
public class Transaction {
    private PartenaireDao partenaireDao;
    private CompteDao compteDao;
    private DepotDao depotDao;    
    private UserDao userDao;
    private TransactionDao transactionDao;
    //public static ObservableList<Compte> comptesObl;
    
    //private List<Partenaire> partenaires;
    private List<Compte> comptes;
    //private List<Depot> depots;
    private List<Depot> depots;
    private List<models.Transaction> transactions;
    

    public Transaction() {
        this.partenaireDao = new PartenaireDao();
        this.compteDao = new CompteDao();
        this.depotDao = new DepotDao();
        this.userDao = new UserDao();
        this.transactionDao = new TransactionDao();
        //Transaction.comptesObl = FXCollections.observableArrayList();
        
       // this.partenaires = this.partenaireDao.selectAll();
        //this.comptes = this.compteDao.selectAll();
        //this.depots = this.depotDao.selectAll();
                
    }
    
    
    public void addCompteTransactionion(Partenaire part,Compte compte){
        //Lien entre cpt et part
        User user = this.userDao.add(part);
        compte.setIdPartenaire(user.getId());
        this.compteDao.add(compte);

        this.partenaireDao.add(part);
        //this.partenaires.add(part);
         //Alert ak = new Alert(Alert.AlertType.INFORMATION,"After: "+String.valueOf(this.compteDao.selectAll().size()));
        //ak.showAndWait();
        //Transaction.comptesObl.add(compte);
        
        //Alert a = new Alert(Alert.AlertType.INFORMATION,"After add: "+String.valueOf(this.compteDao.selectAll().size()));
        //a.showAndWait();
    }
    
    
    public Compte setDepot(Compte compte,Depot depot){
        compte.getDepot(depot);
        depot.setIdCompte(compte.getId());
        this.depotDao.add(depot);
        return compte;
    }
    
    public Partenaire getPartenaireByNci(String nci){
        for (Partenaire p : this.partenaireDao.selectAll()) {
            if (p.getNci().equals(nci)){
                return p;
            }
        }
        return null;
    }
    
    public List<Compte>  getComptesByPartenaire(Partenaire part){
        //Transaction.comptesObl = FXCollections.observableArrayList();
        //this.comptes.addAll(this.compteDao.selectAll());
        this.comptes = new ArrayList();
        //ObservableList<Compte> comptesPart = FXCollections.observableArrayList();
        this.compteDao.selectAll().stream().filter((c) -> (c.getIdPartenaire() == part.getId())).forEachOrdered((c) -> {
            this.comptes.add(c);
        });
        Alert a = new Alert(Alert.AlertType.INFORMATION,"After add: "+String.valueOf(this.comptes.size()));
        a.showAndWait();
        return this.comptes;//comptes.Stream cpt.getPartenaire().getId()==part.getId().collect(Collectors);
    }
    
    public List<Depot>  getDepotsByCompte(Compte cpt){
        //Transaction.comptesObl = FXCollections.observableArrayList();
        //this.comptes.addAll(this.compteDao.selectAll());
        this.depots = new ArrayList();
        //ObservableList<Compte> comptesPart = FXCollections.observableArrayList();
        this.depotDao.selectAll().stream().filter((d) -> (d.getIdCompte() == cpt.getId())).forEachOrdered((c) -> {
            this.depots.add(c);
        });
        //Alert a = new Alert(Alert.AlertType.INFORMATION,"After add: "+String.valueOf(this.comptes.size()));
        //a.showAndWait();
        return this.depots;//comptes.Stream cpt.getPartenaire().getId()==part.getId().collect(Collectors);
    }
    
    public List<models.Transaction>  getTransactionsByCompte(Compte cpt){
        this.transactions = new ArrayList();
        this.transactionDao.selectAll().stream().filter((t) -> (t.getIdCompte() == cpt.getId())).forEachOrdered((t) -> {
            this.transactions.add(t);
        });
        //Alert a = new Alert(Alert.AlertType.INFORMATION,"After add: "+String.valueOf(this.comptes.size()));
        //a.showAndWait();
        return this.transactions;//comptes.Stream cpt.getPartenaire().getId()==part.getId().collect(Collectors);
    }
    
}