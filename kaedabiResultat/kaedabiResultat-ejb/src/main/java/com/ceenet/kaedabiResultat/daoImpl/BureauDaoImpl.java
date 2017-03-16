/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;


import com.ceenet.kaedabiResultat.dao.BureauDao;
import com.ceenet.kaedabiResultat.model.Bureau;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class BureauDaoImpl extends GenericDaoImpl<Bureau> implements BureauDao{
    
    public BureauDaoImpl() {
    }
    public BureauDaoImpl(Class<Bureau> entityClass) {
        super(entityClass);
    }
}
