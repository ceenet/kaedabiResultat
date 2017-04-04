/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;



import com.ceenet.kaedabiResultat.dao.DecoupageHierachieTypeDao;

import com.ceenet.kaedabiResultat.model.DecoupageHierachieType;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class DecoupageHierachieTypeDaoImpl extends GenericDaoImpl<DecoupageHierachieType> implements DecoupageHierachieTypeDao{
    
    public DecoupageHierachieTypeDaoImpl() {
    }
    public DecoupageHierachieTypeDaoImpl(Class<DecoupageHierachieType> entityClass) {
        super(entityClass);
    }
}
