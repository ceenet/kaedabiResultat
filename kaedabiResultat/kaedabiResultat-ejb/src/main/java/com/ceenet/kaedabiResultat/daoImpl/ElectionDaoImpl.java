/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.ElectionDao;
import com.ceenet.kaedabiResultat.model.Election;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class ElectionDaoImpl extends GenericDaoImpl<Election> implements ElectionDao{
    
    public ElectionDaoImpl() {
    }
    public ElectionDaoImpl(Class<Election> entityClass) {
        super(entityClass);
    }
}
