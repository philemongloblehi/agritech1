/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.serviceImpl;

import java.util.List;
import com.agritech.dao.IEnginDao;
import com.agritech.daoImpl.EnginDao;
import com.agritech.domaine.Engin;
import com.agritech.service.IEnginService;

/**
 *
 * @author jhipster
 */
public class EnginService implements IEnginService {
    
    IEnginDao enginDao = new EnginDao();

    @Override
    public boolean ajouter(Engin t) {
	if ( (!"".equals(t.getImmatriculation())) && (!"".equals(t.getMarque())) ) {
            enginDao.save(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean modifier(Engin t) {
	if (enginDao.readOne(t.getId()) != null) {
            enginDao.update(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean supprimer(Integer pk) {
	if (enginDao.readOne(pk) != null) {
            enginDao.delete(pk);
            return true;
	}
	return false;
	
    }

    @Override
    public Engin lireUn(Integer pk) {
	Engin engin = enginDao.readOne(pk);
	return engin;
    }

    @Override
    public List<Engin> liretout() {
	// TODO Auto-generated method stub
	return enginDao.readAll();
    }


    
}
