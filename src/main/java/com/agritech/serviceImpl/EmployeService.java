/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.serviceImpl;

import java.util.List;
import com.agritech.dao.IEmployeDao;
import com.agritech.daoImpl.EmployeDao;
import com.agritech.domaine.Employe;
import com.agritech.service.IEmployeService;

/**
 *
 * @author jhipster
 */
public class EmployeService implements IEmployeService {
    
    IEmployeDao employeDao = new EmployeDao();

    @Override
    public boolean ajouter(Employe t) {
	if ( (!"".equals(t.getMatricule())) && (!"".equals(t.getNom())) && (!"".equals(t.getPrenoms())) ) {
            employeDao.save(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean modifier(Employe t) {
	if (employeDao.readOne(t.getId()) != null) {
            employeDao.update(t);
            return true;
	}
	return false;
	
    }

    @Override
    public boolean supprimer(Integer pk) {
	if (employeDao.readOne(pk) != null) {
            employeDao.delete(pk);
            return true;
	}
	return false;
	
    }

    @Override
    public Employe lireUn(Integer pk) {
	Employe employe = employeDao.readOne(pk);
	return employe;
    }

    @Override
    public List<Employe> liretout() {
	// TODO Auto-generated method stub
	return employeDao.readAll();
    }


    
}
