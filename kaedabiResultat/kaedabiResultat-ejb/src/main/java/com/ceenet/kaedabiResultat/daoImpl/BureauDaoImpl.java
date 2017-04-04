/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.daoImpl;

import com.ceenet.kaedabiResultat.dao.BureauDao;
import com.ceenet.kaedabiResultat.model.Bureau;
import com.ceenet.kaedabiResultat.model.Hierachie;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author manukey
 */
@Stateless
public class BureauDaoImpl extends GenericDaoImpl<Bureau> implements BureauDao {

    public BureauDaoImpl() {
    }

    public BureauDaoImpl(Class<Bureau> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Bureau> findbyHierachie(Hierachie hierachie) {
        List result = null;
        Hierachie idresult;
        int niveau=hierachie.getNiveau();

        int var = niveau - 1;
        if (var >= 0) {
            try {
                Query q1 = em.createQuery("SELECT h FROM Hierachie h Where h.niveau= ?1 LIMIT 0,1");
                q1.setParameter(1, var);
                idresult = (Hierachie) q1.getSingleResult();

                Query q = em.createQuery("SELECT b FROM Bureau b Where b.hierachie_id= ?2");
                q.setParameter(2, idresult.getId());
                result = q.getResultList();
            } catch (NoResultException e) {
                // log.debug("No result forund for... ");        }        return result;    }
            }
        }

        return result;
    }
}
