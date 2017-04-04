/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;


import com.ceenet.kaedabiResultat.model.Bureau;
import com.ceenet.kaedabiResultat.model.Hierachie;
import com.ceenet.kaedabiResultat.service.BureauService;


import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author manukey
 */
@Named(value = "bureauBean")
@SessionScoped
public class BureauBean implements Serializable {

    @EJB
    private BureauService bureauService;
   
   
    private String codeBureau;
    private String codegenere;
    private String libelle;
    private int positionx;
    private int positiony;
    private Bureau bureauparent;
    private Hierachie hierachie;
     private List<Bureau> listBureau;
     private List<Bureau> listparent;

    public List<Bureau> getListparent() {
        listparent=bureauService.listBureauParent(hierachie);
        
        return listparent;
    }

    public void setListparent(List<Bureau> listparent) {
        this.listparent = listparent;
    }

    public String getCodeBureau() {
        return codeBureau;
    }

    public void setCodeBureau(String codeBureau) {
        this.codeBureau = codeBureau;
    }

    public String getCodegenere() {
        return codegenere;
    }

    public void setCodegenere(String codegenere) {
        this.codegenere = codegenere;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPositionx() {
        return positionx;
    }

    public void setPositionx(int positionx) {
        this.positionx = positionx;
    }

    public int getPositiony() {
        return positiony;
    }

    public void setPositiony(int positiony) {
        this.positiony = positiony;
    }

    public Bureau getBureauparent() {
        return bureauparent;
    }

    public void setBureauparent(Bureau bureauparent) {
        this.bureauparent = bureauparent;
    }

    public Hierachie getHierachie() {
        return hierachie;
    }

    public void setHierachie(Hierachie hierachie) {
        this.hierachie = hierachie;
    }



    public List<Bureau> getListBureau() {
        listBureau=bureauService.listBureau();
        return listBureau;
    }

    public void setListBureau(List<Bureau> listBureau) {
        this.listBureau = listBureau;
    }

    
    
    
    
    
    
    
    
    
    // fonction et methode
    public String creerBureau() {

        bureauService.CreateBureau(codeBureau, codegenere, libelle, positionx, positiony, hierachie, bureauparent);
        return "success";
    }
    

    public void supprimerBureau() {

    }

    public String modifierBureau() {

        //
        return "success";
    }

}
