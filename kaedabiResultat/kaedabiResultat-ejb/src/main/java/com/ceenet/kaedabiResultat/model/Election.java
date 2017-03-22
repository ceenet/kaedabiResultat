/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author manukey
 */
@Entity
public class Election implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateElection;
    private String codeElection;
    private String libelleElection;
    private int tourElection;
    private int nbcandidat;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date heureouverture;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date heurefermetture;
    
    private int simulation;
    private boolean clotureElection;
    private int nbinscrit;
    private int nbvotant;
    private int nbblanc;
    private int nbnul;
    private int nbexprime;
    private String commentaire;
     @ManyToOne(fetch = FetchType.LAZY)
    private TypeElection typeElection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateElection() {
        return dateElection;
    }

    public void setDateElection(Date dateElection) {
        this.dateElection = dateElection;
    }

    public String getLibelleElection() {
        return libelleElection;
    }

    public void setLibelleElection(String libelleElection) {
        this.libelleElection = libelleElection;
    }

    public int getTourElection() {
        return tourElection;
    }

    public void setTourElection(int tourElection) {
        this.tourElection = tourElection;
    }

    public int getNbcandidat() {
        return nbcandidat;
    }

    public void setNbcandidat(int nbcandidat) {
        this.nbcandidat = nbcandidat;
    }

    public Date getHeureouverture() {
        return heureouverture;
    }

    public void setHeureouverture(Date heureouverture) {
        this.heureouverture = heureouverture;
    }

    public Date getHeurefermetture() {
        return heurefermetture;
    }

    public void setHeurefermetture(Date heurefermetture) {
        this.heurefermetture = heurefermetture;
    }

    public int getSimulation() {
        return simulation;
    }

    public void setSimulation(int simulation) {
        this.simulation = simulation;
    }

    public boolean isClotureelection() {
        return clotureElection;
    }

    public void setClotureelection(boolean clotureelection) {
        this.clotureElection = clotureelection;
    }

    public int getNbinscrit() {
        return nbinscrit;
    }

    public void setNbinscrit(int nbinscrit) {
        this.nbinscrit = nbinscrit;
    }

    public int getNbvotant() {
        return nbvotant;
    }

    public void setNbvotant(int nbvotant) {
        this.nbvotant = nbvotant;
    }

    public int getNbblanc() {
        return nbblanc;
    }

    public void setNbblanc(int nbblanc) {
        this.nbblanc = nbblanc;
    }

    public int getNbnul() {
        return nbnul;
    }

    public void setNbnul(int nbnul) {
        this.nbnul = nbnul;
    }

    public int getNbexprime() {
        return nbexprime;
    }

    public void setNbexprime(int nbexprime) {
        this.nbexprime = nbexprime;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public TypeElection getTypeElection() {
        return typeElection;
    }

    public void setTypeElection(TypeElection typeElection) {
        this.typeElection = typeElection;
    }

    public String getCodeElection() {
        return codeElection;
    }

    public void setCodeElection(String codeElection) {
        this.codeElection = codeElection;
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
        if (!(object instanceof Election)) {
            return false;
        }
        Election other = (Election) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.kaedabiResultat.model.Election[ id=" + id + " ]";
    }

}
