package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.Election;
import com.ceenet.kaedabiResultat.service.ElectionService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marfu
 */

@Named(value = "electionBean")
@SessionScoped
public class ElectionBean  implements Serializable {
     @EJB
    private ElectionService electionService;
    
    private List<Election> listElection;

    public List<Election> getListElection() {
        listElection=electionService.listElection();
        return listElection;
    }

    public void setListElection(List<Election> listElection) {
        this.listElection = listElection;
    }
    
    
    

  
}
