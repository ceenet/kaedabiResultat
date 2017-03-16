/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.ElectionCandidatDao;
import com.ceenet.kaedabiResultat.model.ElectionCandidat;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class ElectionCandidatDaoImpl extends GenericDaoImpl<ElectionCandidat> implements ElectionCandidatDao{
    
    public ElectionCandidatDaoImpl() {
    }
    public ElectionCandidatDaoImpl(Class<ElectionCandidat> entityClass) {
        super(entityClass);
    }
}
