/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;



import com.ceenet.kaedabiResultat.dao.DecoupageDao;

import com.ceenet.kaedabiResultat.model.Decoupage;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class DecoupageDaoImpl extends GenericDaoImpl<Decoupage> implements DecoupageDao{
    
    public DecoupageDaoImpl() {
    }
    public DecoupageDaoImpl(Class<Decoupage> entityClass) {
        super(entityClass);
    }
}
