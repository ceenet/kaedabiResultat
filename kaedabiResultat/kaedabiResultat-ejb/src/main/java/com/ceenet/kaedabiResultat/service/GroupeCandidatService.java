/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.service;

import com.ceenet.kaedabiResultat.dao.GroupeCandidatDao;
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
public class GroupeCandidatService {

    @EJB
    private GroupeCandidatDao GroupeCandidatDao;

    public GroupeCandidat CreateGroupeCandidat(String code, String libelle) {
        GroupeCandidat gc = new GroupeCandidat();
        gc.setCode(code);
        gc.setLibelle(libelle);

        return gc = GroupeCandidatDao.create(gc);
    }

    public List<GroupeCandidat> listGroupeCandidat() {
        return GroupeCandidatDao.findAll();
    }

    public void deleteGroupeCandidat(Long selectGroupeCandidat) {
        GroupeCandidat gc = new GroupeCandidat();
        gc = GroupeCandidatDao.findById(selectGroupeCandidat);
        GroupeCandidatDao.delete(gc);

    }

    public GroupeCandidat findGroupeCandidatID(Long selectGroupeCandidat) {
        GroupeCandidat gc = new GroupeCandidat();
        gc = GroupeCandidatDao.findById(selectGroupeCandidat);
        return gc;
    }

    public void updateGroupeCandidat(Long selectGroupeCandidat, String code, String libelle) {
        GroupeCandidat gc = new GroupeCandidat();
        gc = GroupeCandidatDao.findById(selectGroupeCandidat);
        gc.setCode(code);
        gc.setLibelle(libelle);

        GroupeCandidatDao.update(gc);

    }
}
