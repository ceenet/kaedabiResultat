/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.GroupeCandidat;
import com.ceenet.kaedabiResultat.service.GroupeCandidatService;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author manukey
 */
@Named(value = "groupeCandidatBean")
@SessionScoped
public class GroupeCandidatBean implements Serializable {

    @EJB
    private GroupeCandidatService groupeCandidatService;

    private String libelle;
    private String code;
    private long selectgroupe;
    List<GroupeCandidat> listGroupeCandidat;

    public List<GroupeCandidat> getListGroupeCandidat() {
        listGroupeCandidat=groupeCandidatService.listGroupeCandidat();
        return listGroupeCandidat;
    }

    public void setListGroupeCandidat(List<GroupeCandidat> listGroupeCandidat) {
        this.listGroupeCandidat = listGroupeCandidat;
    }
    

    
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getSelectgroupe() {
        return selectgroupe;
    }

    public void setSelectgroupe(long selectgroupe) {
        this.selectgroupe = selectgroupe;
    }
    
    

    public String creerGroupeCandidat() {

        groupeCandidatService.CreateGroupeCandidat(code, libelle);
        return "success";
    }

    public void supprimerGroupeCandidat() {

    }

    public String modifierGroupeCandidat() {

        //
        return "success";
    }

}
