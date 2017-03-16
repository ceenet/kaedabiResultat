/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.ParticipationBureauDao;
import com.ceenet.kaedabiResultat.dao.TrancheDao;
import com.ceenet.kaedabiResultat.model.ParticipationBureau;
import com.ceenet.kaedabiResultat.model.Tranche;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class TrancheDaoImpl extends GenericDaoImpl<Tranche> implements TrancheDao{
    
    public TrancheDaoImpl() {
    }
    public TrancheDaoImpl(Class<Tranche> entityClass) {
        super(entityClass);
    }
}
