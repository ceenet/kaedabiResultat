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
public class ParticipationBureau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nbvotant;
    private double taux;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Election election;

    @ManyToOne(fetch = FetchType.LAZY)
    private Bureau bureau;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Tranche tranche;
    
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNbvotant() {
        return nbvotant;
    }

    public void setNbvotant(int nbvotant) {
        this.nbvotant = nbvotant;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public Election getElection() {
        return election;
    }

    public void setElection(Election election) {
        this.election = election;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public Tranche getTranche() {
        return tranche;
    }

    public void setTranche(Tranche tranche) {
        this.tranche = tranche;
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
        if (!(object instanceof ParticipationBureau)) {
            return false;
        }
        ParticipationBureau other = (ParticipationBureau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.kaedabiResultat.model.ParticipationBureau[ id=" + id + " ]";
    }
    
}
