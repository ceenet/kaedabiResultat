/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.TrancheDao;
import com.ceenet.kaedabiResultat.model.Hierachie;
import com.ceenet.kaedabiResultat.model.Tranche;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */
@Stateless
public class TrancheService {

    @EJB
    private TrancheDao trancheDao;

    public Tranche createTrancheHoraire(String code, Date trancheHeure) {
        Tranche t = new Tranche();
        t.setCode(code);
        t.setTrancheHeure(trancheHeure);
       // t.setLibelle(description);

        return t = trancheDao.create(t);
    }

    
 public List<Tranche> listTranche() {
        return trancheDao.findAll();
    }
   

    

}
