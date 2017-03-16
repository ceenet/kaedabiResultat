/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.GroupeCandidatDao;
import com.ceenet.kaedabiResultat.model.GroupeCandidat;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class GroupeCandidatDaoImpl extends GenericDaoImpl<GroupeCandidat> implements GroupeCandidatDao{
    
    public GroupeCandidatDaoImpl() {
    }
    public GroupeCandidatDaoImpl(Class<GroupeCandidat> entityClass) {
        super(entityClass);
    }
}
