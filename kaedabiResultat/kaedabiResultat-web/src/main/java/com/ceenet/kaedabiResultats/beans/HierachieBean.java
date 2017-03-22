/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.Hierachie;
import com.ceenet.kaedabiResultat.service.HierachieService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author marfu
 */

@Named(value = "hierachieBean")
@SessionScoped
public class HierachieBean implements Serializable{
    @EJB
    private HierachieService hierachieService;
    
    private List<Hierachie> listHierachie;

    private String description;
    
    private int niveau;
   
    private long hierachieParent;

    public HierachieService getHierachieService() {
        return hierachieService;
    }

    public void setHierachieService(HierachieService hierachieService) {
        this.hierachieService = hierachieService;
    }

    public List<Hierachie> getListHierachie() {
        listHierachie=hierachieService.listHierachie();
        return listHierachie;
    }

    public void setListHierachie(List<Hierachie> listHierachie) {
        this.listHierachie = listHierachie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public long getHierachieParent() {
        return hierachieParent;
    }

    public void setHierachieParent(long hierachieParent) {
        this.hierachieParent = hierachieParent;
    }
    
    
    
    
    
    
    public String creerHierachie() {
        //  System.out.print("xxxx");
        Hierachie hierachiePar=hierachieService.findHierachieById(hierachieParent);
        hierachieService.createHierachie(niveau ,description,hierachiePar);
          
        return "success";
    }
    
    
     public void deleteHierachie() {
         
         
       
    }
    
    
    public void onRowEdit(RowEditEvent event) {
       
    }

    public void onRowCancel(RowEditEvent event) {
       
    }

    
    public void addMessage() {
       // String summary = value2 ? "Checked" : "Unchecked";
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("test"));
    }

}
