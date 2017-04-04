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
public class Bureau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codeBureau;
    private String codegenere;
    private String libelle;
    private int positionx;
    private int positiony;
    private int nbinscrit;
    private int nbvotant;
    private int nbblanc;
    private int nbnul;
    private int nbexprime;
    private double txexprime;
    private String message;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Bureau bureauparent;
    @ManyToOne(fetch = FetchType.LAZY)
    private Hierachie hierachie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Election election;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getTxexprime() {
        return txexprime;
    }

    public void setTxexprime(double txexprime) {
        this.txexprime = txexprime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        if (!(object instanceof Bureau)) {
            return false;
        }
        Bureau other = (Bureau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.kaedabiResultat.model.Bureau[ id=" + id + " ]";
    }
    
}
