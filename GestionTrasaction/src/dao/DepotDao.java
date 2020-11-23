/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Depot;

/**
 *
 * @author DELL
 */
public class DepotDao implements IDao<Depot>{
    
    public List<Depot>  depots;
    private static int nbreDepot;

    
    public DepotDao() {
        this.depots = new ArrayList<>(
                Arrays.asList(
                        new Depot(2,4555),
                        new Depot(2,778),
                        new Depot(1,9878)
                )
                
        );
    }
    

    @Override
    public Depot add(Depot dp) {
        dp.setId(++nbreDepot);
        this.depots.add(dp);
        return dp;
    }

    @Override
    public List<Depot> selectAll() {
        return this.depots;
    }
    
}
