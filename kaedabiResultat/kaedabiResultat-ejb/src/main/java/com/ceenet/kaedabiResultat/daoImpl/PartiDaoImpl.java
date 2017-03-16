/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.PartiDao;
import com.ceenet.kaedabiResultat.model.Parti;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class PartiDaoImpl extends GenericDaoImpl<Parti> implements PartiDao{
    
    public PartiDaoImpl() {
    }
    public PartiDaoImpl(Class<Parti> entityClass) {
        super(entityClass);
    }
}
