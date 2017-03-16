/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;



import com.ceenet.kaedabiResultat.dao.TypeElectionDao;

import com.ceenet.kaedabiResultat.model.TypeElection;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class TypeElectionDaoImpl extends GenericDaoImpl<TypeElection> implements TypeElectionDao{
    
    public TypeElectionDaoImpl() {
    }
    public TypeElectionDaoImpl(Class<TypeElection> entityClass) {
        super(entityClass);
    }
}
