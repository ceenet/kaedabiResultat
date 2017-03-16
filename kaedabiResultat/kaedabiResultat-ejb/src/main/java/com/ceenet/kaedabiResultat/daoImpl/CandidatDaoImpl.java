/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;



import com.ceenet.kaedabiResultat.dao.CandidatDao;

import com.ceenet.kaedabiResultat.model.Candidat;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class CandidatDaoImpl extends GenericDaoImpl<Candidat> implements CandidatDao{
    
    public CandidatDaoImpl() {
    }
    public CandidatDaoImpl(Class<Candidat> entityClass) {
        super(entityClass);
    }
}
