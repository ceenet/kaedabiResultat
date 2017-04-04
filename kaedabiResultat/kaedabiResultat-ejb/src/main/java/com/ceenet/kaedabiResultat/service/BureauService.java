/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.BureauDao;
import com.ceenet.kaedabiResultat.dao.CandidatDao;
import com.ceenet.kaedabiResultat.dao.GroupeCandidatDao;
import com.ceenet.kaedabiResultat.dao.HierachieDao;
import com.ceenet.kaedabiResultat.dao.PartiDao;
import com.ceenet.kaedabiResultat.model.Bureau;
import com.ceenet.kaedabiResultat.model.Candidat;
import com.ceenet.kaedabiResultat.model.GroupeCandidat;
import com.ceenet.kaedabiResultat.model.Hierachie;
import com.ceenet.kaedabiResultat.model.Parti;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class BureauService {
     @EJB
    private BureauDao BureauDao;
     
     @EJB
    private HierachieDao HierachieDao;
      
    
    
    public Bureau CreateBureau(String codeBureau,String codegenere, String libelle, int positionx,int positiony,Hierachie hierachie,Bureau bureauparent){
        Bureau b= new Bureau();
//        Hierachie h= new Hierachie();
//    
//        h=HierachieDao.findById(hierachie);
        
        
        b.setCodeBureau(codeBureau);
        b.setCodegenere(codegenere);
        b.setLibelle(libelle);
        b.setHierachie(hierachie);
        if(bureauparent != null){
            b.setBureauparent(bureauparent);
        }
        b.setPositionx(positionx);
        b.setPositiony(positiony);
        return b = BureauDao.create(b);
    }
    
    public List<Bureau> listBureau() {
        return BureauDao.findAll();
    }
    
    public List<Bureau> listBureauParent(Hierachie hierachie) {
        System.out.println(hierachie.getDescription());
        return BureauDao.findbyHierachie(hierachie);
    }
    
    public void deleteBureau(Long selectBureau){
    Bureau b=new Bureau();
    b=BureauDao.findById(selectBureau);
    BureauDao.delete(b);
    
    }
     
//    public void updateBureau(Long selectParti,String code,String libelle,String logo){
//    Parti p=new Parti();
//    p=PartiDao.findById(selectParti);
//    p.setCode(code);
//    p.setLibelle(libelle); 
//    p.setLogo(logo); 
//    PartiDao.update(p);
//   
//    
//    }
}
