/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.Hierachie;
import com.ceenet.kaedabiResultat.model.TypeElection;
import com.ceenet.kaedabiResultat.service.HierachieService;
import com.ceenet.kaedabiResultat.service.TypeElectionService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author marfu
 */
@Named(value = "typeElectionBean")
@SessionScoped
public class TypeElectionBean implements Serializable {

    @EJB
    private TypeElectionService typeElectionService;

    @EJB
    private HierachieService hierachieService;

    private List<TypeElection> listTypeElection;

    private String description;
    private String code;
    private long hierachieParent;

    public List<TypeElection> getListTypeElection() {
        listTypeElection = typeElectionService.listTypeElection();
        return listTypeElection;
    }

    public void setListTypeElection(List<TypeElection> listTypeElection) {
        this.listTypeElection = listTypeElection;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getHierachieParent() {
        return hierachieParent;
    }

    public void setHierachieParent(long hierachieParent) {
        this.hierachieParent = hierachieParent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
    
    
    public String creerTypeElection() {
        //  System.out.print("xxxx");
        Hierachie hierachiePar = hierachieService.findHierachieById(hierachieParent);
        typeElectionService.createTypeElection(code,description, hierachiePar);

        return "success";
    }

}
