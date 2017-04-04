/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.TypeElectionDao;

import com.ceenet.kaedabiResultat.model.TypeElection;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */

@Stateless
public class TypeElectionService {
    
      
     @EJB
    private TypeElectionDao typeElectionDao;
     
     
     public TypeElection createTypeElection(String code,String description){
        TypeElection t= new TypeElection();
      t.setCode(code);
      // t.setHierachie(hierachieParent);
       t.setLibelle(description);
        
         return t = typeElectionDao.create(t);
    }
    
    public List<TypeElection> listTypeElection() {
        return typeElectionDao.findAll();
    }
    
    public TypeElection findHierachieById(Long id) {
        return typeElectionDao.findById(id);
    }
    
    public void deleteTypeElection(Long selectMagasin){
    TypeElection t=new TypeElection();
    t=typeElectionDao.findById(selectMagasin);
    typeElectionDao.delete(t);
    
    }
    
    public void updateTypeElection(Long selectMagasin,String code,String libelle){
    TypeElection t=new TypeElection();
    t=typeElectionDao.findById(selectMagasin);
    
    typeElectionDao.update(t);
   
    
    }
}
