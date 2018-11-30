/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.serviceImpl;

import java.util.List;
import com.agritech.dao.IProduitDao;
import com.agritech.daoImpl.ProduitDao;
import com.agritech.domaine.Produit;
import com.agritech.service.IProduitService;


/**
 *
 * @author jhipster
 */
public class ProduitService implements IProduitService {
    
    	
    IProduitDao produitDao = new ProduitDao();

    @Override
    public boolean ajouter(Produit t) {
	if ( (!"".equals(t.getDesignation())) && (!"".equals(t.getPrix())) ) {
            produitDao.save(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean modifier(Produit t) {
	if (produitDao.readOne(t.getId()) != null) {
            produitDao.update(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean supprimer(Integer pk) {
	if (produitDao.readOne(pk) != null) {
            produitDao.delete(pk);
            return true;
	}
	return false;
	
    }

    @Override
    public Produit lireUn(Integer pk) {
	Produit produit = produitDao.readOne(pk);
	return produit;
	
    }

    @Override
    public List<Produit> liretout() {
	// TODO Auto-generated method stub
	return produitDao.readAll();
	
    }


    
}
