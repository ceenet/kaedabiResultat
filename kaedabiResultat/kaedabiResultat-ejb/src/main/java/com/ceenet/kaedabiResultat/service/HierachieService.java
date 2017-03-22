/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.HierachieDao;
import com.ceenet.kaedabiResultat.model.Hierachie;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author marfu
 */
@Stateless
public class HierachieService {
    
     @EJB
    private HierachieDao hierachieDao;
    
    
    public Hierachie createHierachie(int niveau ,String description,Hierachie hierachieParent){
        Hierachie h= new Hierachie();
        h.setNiveau(0);
        h.setDescription(description);
        if(hierachieParent!=null){
        h.setHierachieparent(hierachieParent);
       
        }
         return h = hierachieDao.create(h);
    }
    
    public List<Hierachie> listHierachie() {
        return hierachieDao.findAll();
    }
    
    public Hierachie findHierachieById(Long id) {
        return hierachieDao.findById(id);
    }
    
    public void deleteMagasin(Long selectMagasin){
    Hierachie h=new Hierachie();
    h=hierachieDao.findById(selectMagasin);
    hierachieDao.delete(h);
    
    }
    
    public void updateMagasin(Long selectMagasin,String code,String libelle){
    Hierachie h=new Hierachie();
    h=hierachieDao.findById(selectMagasin);
    
    hierachieDao.update(h);
   
    
    }
    
    
}
