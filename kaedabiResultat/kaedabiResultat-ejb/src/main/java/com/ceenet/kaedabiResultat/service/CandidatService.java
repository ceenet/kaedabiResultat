/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.CandidatDao;
import com.ceenet.kaedabiResultat.dao.GroupeCandidatDao;
import com.ceenet.kaedabiResultat.dao.PartiDao;
import com.ceenet.kaedabiResultat.model.Candidat;
import com.ceenet.kaedabiResultat.model.GroupeCandidat;
import com.ceenet.kaedabiResultat.model.Parti;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author manukey
 */
@Stateless
public class CandidatService {
     @EJB
    private CandidatDao CandidatDao;
     
      @EJB
    private GroupeCandidatDao GroupeCandidatDao;
      
        @EJB
    private PartiDao PartiDao;
    
    public Candidat CreateCandidat(String codeCandidat,String codegenere,String nom,String prenom,String commentaire,String photo,Long parti,Long groupeCandidat){
        Candidat c= new Candidat();
        GroupeCandidat gc= new GroupeCandidat();
        Parti p= new Parti();
        p=PartiDao.findById(parti);
        gc=GroupeCandidatDao.findById(groupeCandidat);
        
        c.setCodeCandidat(codeCandidat);
        c.setCodegenere(codeCandidat);
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setCommentaire(commentaire);
        c.setPhoto(photo);
        c.setParti(p);
        c.setGroupeCandidat(gc);
        
        return c = CandidatDao.create(c);
    }
    
    public List<Candidat> listCandidat() {
        return CandidatDao.findAll();
    }
    
    public void deleteCandidat(Long selectCandidat){
    Candidat c=new Candidat();
    c=CandidatDao.findById(selectCandidat);
    CandidatDao.delete(c);
    
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
