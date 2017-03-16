/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.ParticipationBureauDao;
import com.ceenet.kaedabiResultat.model.ParticipationBureau;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class ParticipationBureauDaoImpl extends GenericDaoImpl<ParticipationBureau> implements ParticipationBureauDao{
    
    public ParticipationBureauDaoImpl() {
    }
    public ParticipationBureauDaoImpl(Class<ParticipationBureau> entityClass) {
        super(entityClass);
    }
}
