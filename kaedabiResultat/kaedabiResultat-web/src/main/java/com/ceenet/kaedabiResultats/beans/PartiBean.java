/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.Parti;
import com.ceenet.kaedabiResultat.service.PartiService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author manukey
 */
@Named(value = "partiBean")
@SessionScoped
public class PartiBean implements Serializable {

    @EJB
    private PartiService partiService;

    private String code;
    private String libelle;
    private String logo;
    private long selectparti;
    private List<Parti> listParti;

    public List<Parti> getListParti() {
        listParti=partiService.listParti();
        return listParti;
    }

    public void setListParti(List<Parti> listParti) {
        this.listParti = listParti;
    }
    

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public long getSelectparti() {
        return selectparti;
    }

    public void setSelectparti(long selectparti) {
        this.selectparti = selectparti;
    }
    
    
    public String creerParti (){
        
        partiService.CreateParti(code, libelle, logo);
        return "success";
    }
    
    public void supprimerParti(){
        
    }
    
    public String modifierParti (){
        
        //
        return "success";
    }

}
