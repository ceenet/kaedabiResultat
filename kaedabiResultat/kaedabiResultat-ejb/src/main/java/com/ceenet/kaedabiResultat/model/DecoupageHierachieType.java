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
public class DecoupageHierachieType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Decoupage decoupage;
    @ManyToOne(fetch = FetchType.LAZY)
    private Hierachie hierachie;

    @ManyToOne(fetch = FetchType.LAZY)
    private TypeElection typeElection;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Decoupage getDecoupage() {
        return decoupage;
    }

    public void setDecoupage(Decoupage decoupage) {
        this.decoupage = decoupage;
    }

    public Hierachie getHierachie() {
        return hierachie;
    }

    public void setHierachie(Hierachie hierachie) {
        this.hierachie = hierachie;
    }

    public TypeElection getTypeElection() {
        return typeElection;
    }

    public void setTypeElection(TypeElection typeElection) {
        this.typeElection = typeElection;
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
        if (!(object instanceof DecoupageHierachieType)) {
            return false;
        }
        DecoupageHierachieType other = (DecoupageHierachieType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceenet.kaedabiResultat.model.Hierachie[ id=" + id + " ]";
    }

}
