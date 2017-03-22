/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.Tranche;
import com.ceenet.kaedabiResultat.service.TrancheService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author marfu
 */

@Named(value = "trancheHoraireBean")
@SessionScoped
public class TrancheHoraireBean implements Serializable {
    
     @EJB
    private TrancheService trancheService;
    
    private List<Tranche> listTranche;

    private Date trancheHoraire;
    
    private String code;

    public TrancheService getTrancheService() {
        return trancheService;
    }

    public void setTrancheService(TrancheService trancheService) {
        this.trancheService = trancheService;
    }

    public List<Tranche> getListTranche() {
          listTranche=trancheService.listTranche();
        return listTranche;
    }

    public void setListTranche(List<Tranche> listTranche) {
      
        this.listTranche = listTranche;
    }

    public Date getTrancheHoraire() {
        return trancheHoraire;
    }

    public void setTrancheHoraire(Date trancheHoraire) {
        this.trancheHoraire = trancheHoraire;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
   
    
     public String creerTranche() {
        //  System.out.print("xxxx");
        trancheService.createTrancheHoraire(code,trancheHoraire);
          
        return "success";
    }
    
   
    
}
