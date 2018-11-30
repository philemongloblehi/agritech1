/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.serviceImpl;

import java.util.List;
import com.agritech.dao.IRendementDao;
import com.agritech.daoImpl.RendementDao;
import com.agritech.domaine.Rendement;
import com.agritech.service.IRendementService;

/**
 *
 * @author jhipster
 */
public class RendementService implements IRendementService {
    
    	
    IRendementDao rendementDao = new RendementDao();

    @Override
    public boolean ajouter(Rendement t) {
	if ( (!"".equals(t.getDesignation())) && (!"".equals(t.getAnnee())) && (!"".equals(t.getQuantiteRecolte())) ) {
            rendementDao.save(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean modifier(Rendement t) {
	if (rendementDao.readOne(t.getId()) != null) {
            rendementDao.update(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean supprimer(Integer pk) {
	if (rendementDao.readOne(pk) != null) {
            rendementDao.delete(pk);
            return true;
	}
	return false;
	
    }

    @Override
    public Rendement lireUn(Integer pk) {
	// TODO Auto-generated method stub
	return rendementDao.readOne(pk);
	
    }

    @Override
    public List<Rendement> liretout() {
	// TODO Auto-generated method stub
	return rendementDao.readAll();
	
    }



}
