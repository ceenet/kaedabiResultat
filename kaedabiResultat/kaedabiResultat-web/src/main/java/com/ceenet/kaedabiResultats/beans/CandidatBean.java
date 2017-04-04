/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultats.beans;

import com.ceenet.kaedabiResultat.model.Candidat;
import com.ceenet.kaedabiResultat.model.GroupeCandidat;
import com.ceenet.kaedabiResultat.model.Parti;
import com.ceenet.kaedabiResultat.service.CandidatService;
import com.ceenet.kaedabiResultat.service.GroupeCandidatService;
import com.ceenet.kaedabiResultat.service.PartiService;


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
@Named(value = "candidatBean")
@SessionScoped
public class CandidatBean implements Serializable {

    @EJB
    private CandidatService candidatService;
    @EJB
    private PartiService partiService;
    @EJB
    private GroupeCandidatService groupecandidatService;

    private String codegenere;
    private String codeCandidat;
    private String nom;
    private String prenom;
    private String commentaire;
    private String photo;
    private long selectCandidat;
    private long parti_id;
    private Parti parti;
    private GroupeCandidat groupeCandidat;
    private long groupecandidat_id;
    private List<Candidat> listcandidat;
    private List<Parti> listParti;
    private List<GroupeCandidat> listGroupeCandidat;
    private UploadedFile uploadedPicture;
    

    public String getCodegenere() {
        return codegenere;
    }

    public void setCodegenere(String codegenere) {
        this.codegenere = codegenere;
    }

    public String getCodeCandidat() {
        return codeCandidat;
    }

    public void setCodeCandidat(String codeCandidat) {
        this.codeCandidat = codeCandidat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public long getParti_id() {
        return parti_id;
    }

    public void setParti_id(long parti_id) {
        this.parti_id = parti_id;
    }

    public Parti getParti() {
        parti=partiService.findPartiID(parti_id);
        return parti;
    }

    public void setParti(Parti parti) {
        this.parti = parti;
    }

    public GroupeCandidat getGroupeCandidat() {
        groupeCandidat=groupecandidatService.findGroupeCandidatID(groupecandidat_id);
        return groupeCandidat;
    }

    public void setGroupeCandidat(GroupeCandidat groupeCandidat) {
        this.groupeCandidat = groupeCandidat;
    }

    public long getGroupecandidat_id() {
        return groupecandidat_id;
    }

    public void setGroupecandidat_id(long groupecandidat_id) {
        this.groupecandidat_id = groupecandidat_id;
    }

   

    public List<Parti> getListParti() {
        return listParti;
    }

    public void setListParti(List<Parti> listParti) {
        this.listParti = listParti;
    }

    public List<GroupeCandidat> getListGroupeCandidat() {
        return listGroupeCandidat;
    }

    public void setListGroupeCandidat(List<GroupeCandidat> listGroupeCandidat) {
        this.listGroupeCandidat = listGroupeCandidat;
    }

    public List<Candidat> getListcandidat() {
        listcandidat=candidatService.listCandidat();
        return listcandidat;
    }

    public void setListcandidat(List<Candidat> listcandidat) {
        this.listcandidat = listcandidat;
    }

    public long getSelectCandidat() {
        return selectCandidat;
    }

    public void setSelectCandidat(long selectCandidat) {
        this.selectCandidat = selectCandidat;
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    
  

    public UploadedFile getUploadedPicture()
    {
        return uploadedPicture;
    }

    public void setUploadedPicture(UploadedFile uploadedPicture)
    {
        this.uploadedPicture = uploadedPicture;
    }

    
    
    
    
    
    
    // fonction et methode
    public String creerCandidat() {

        candidatService.CreateCandidat(codeCandidat, codegenere, nom, prenom, commentaire, photo, parti_id, groupecandidat_id);
        return "success";
    }

    public void supprimerCandidat() {

    }

    public String modifierCandidat() {

        //
        return "success";
    }

}
