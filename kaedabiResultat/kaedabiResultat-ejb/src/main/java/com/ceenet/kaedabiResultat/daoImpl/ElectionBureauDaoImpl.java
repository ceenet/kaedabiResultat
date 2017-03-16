/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.ElectionBureauDao;
import com.ceenet.kaedabiResultat.model.ElectionBureau;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class ElectionBureauDaoImpl extends GenericDaoImpl<ElectionBureau> implements ElectionBureauDao{
    
    public ElectionBureauDaoImpl() {
    }
    public ElectionBureauDaoImpl(Class<ElectionBureau> entityClass) {
        super(entityClass);
    }
}
