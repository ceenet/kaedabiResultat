/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.ElectionDao;
import com.ceenet.kaedabiResultat.model.Election;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */

@Stateless
public class ElectionService {
    
     
     @EJB
    private ElectionDao electionDao;
    
    
    public Election createElection(int niveau ,String description){
        Election h= new Election();
       
         return h = electionDao.create(h);
    }
    
    public List<Election> listElection() {
        return electionDao.findAll();
    }
    
    
}
