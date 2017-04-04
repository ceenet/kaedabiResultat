/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.PartiDao;
import com.ceenet.kaedabiResultat.model.Parti;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class PartiService {
     @EJB
    private PartiDao PartiDao;
    
    
    public Parti CreateParti(String code,String libelle,String logo){
        Parti p= new Parti();
        p.setCode(code);
        p.setLibelle(libelle);
        p.setLogo(logo);
        return p = PartiDao.create(p);
    }
    
    public List<Parti> listParti() {
        return PartiDao.findAll();
    }
    
    public void deleteParti(Long selectParti){
    Parti p=new Parti();
    p=PartiDao.findById(selectParti);
    PartiDao.delete(p);
    
    }
    
    public Parti findPartiID(Long selectParti){
         Parti p=new Parti();
         p=PartiDao.findById(selectParti);
         return p;
    }
    
    public void updateParti(Long selectParti,String code,String libelle,String logo){
    Parti p=new Parti();
    p=PartiDao.findById(selectParti);
    p.setCode(code);
    p.setLibelle(libelle); 
    p.setLogo(logo); 
    PartiDao.update(p);
   
    
    }
}
