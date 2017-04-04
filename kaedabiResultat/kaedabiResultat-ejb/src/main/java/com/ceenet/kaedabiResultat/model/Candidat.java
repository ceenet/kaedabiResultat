/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author manukey
 */
@Entity
public class Candidat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codegenere;
    private String codeCandidat;
    private String nom;
    private String prenom;
    private String commentaire;
    private String photo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Parti parti;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupeCandidat groupeCandidat;

    
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Election election;
    
//getter et setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodegenere() {
        return codegenere;
    }

    public void setCodegenere(String codegenere) {
        this.codegenere = codegenere;
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

    public Parti getParti() {
        return parti;
    }

    public void setParti(Parti parti) {
        this.parti = parti;
    }

    public GroupeCandidat getGroupeCandidat() {
        return groupeCandidat;
    }

    public void setGroupeCandidat(GroupeCandidat groupeCandidat) {
        this.groupeCandidat = groupeCandidat;
    }

    public String getCodeCandidat() {
        return codeCandidat;
    }

    public void setCodeCandidat(String codeCandidat) {
        this.codeCandidat = codeCandidat;
    }
    public Election getElection() {
        return election;
    }

    public void setElection(Election election) {
        this.election = election;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidat)) {
            return false;
        }
        Candidat other = (Candidat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.kaedabiResultat.model.Candidat[ id=" + id + " ]";
    }

}
