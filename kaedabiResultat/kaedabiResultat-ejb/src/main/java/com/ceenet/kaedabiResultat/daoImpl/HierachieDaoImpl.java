/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.HierachieDao;
import com.ceenet.kaedabiResultat.model.Hierachie;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class HierachieDaoImpl extends GenericDaoImpl<Hierachie> implements HierachieDao{
    
    public HierachieDaoImpl() {
    }
    public HierachieDaoImpl(Class<Hierachie> entityClass) {
        super(entityClass);
    }
}
