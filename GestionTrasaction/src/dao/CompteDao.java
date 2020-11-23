/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Compte;

/**
 *
 * @author DELL
 */
public class CompteDao implements IDao<Compte>
{
    
    private static int nbreCompte;

    public List<Compte> comptes;

    public CompteDao() 
    {
        this.comptes = new ArrayList<>(
                Arrays.asList(
                        new Compte(0000,1),
                        new Compte(1111,1),
                        new Compte(1,"SN001",2222,2),
                        new Compte(2,"SN002",3333,2)
                )
        );
    }
    

    @Override
    public List<Compte> selectAll() {
        return this.comptes;
    }

    @Override
    public Compte add(Compte compte) {
        compte.setNumero("SN00"+ ++nbreCompte);
        this.comptes.add(compte);
        return compte;
    }
}