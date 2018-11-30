/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.agritech.dao.IEnginDao;
import com.agritech.domaine.Engin;

/**
 *
 * @author jhipster
 */
public class EnginDao implements IEnginDao {
    
    private String saveQuery = "INSERT INTO engin(immatriculation, marque, consoEssenceJournaliere, createdAt, updatedAt) VALUES(?, ?, ?, ?, ?) ";
    private String updateQuery = "UPDATE SET engin immatriculation=?, marque=?, consoEssenceJournaliere=?, createdAt=?, updatedAt=? WHERE id=?";
    private String deleteQuery = "DELETE FROM engin WHERE id=?";
    private String readOneQuery = "SELECT * FROM engin WHERE id=?";
    private String readAllQuery = "SELECT * FROM engin";
    
    Connection conn = Singleton.getConnection();
    PreparedStatement ps;
    
    @Override
    public boolean save(Engin t) {
	int retour = -1;
	try {
			
            ps = conn.prepareStatement(saveQuery);
            ps.setString(1, t.getImmatriculation());
            ps.setString(2, t.getMarque());
            ps.setDouble(3, t.getConsoEssenceJournaliere());
            ps.setDate(4, t.getCreatedAt());
            ps.setDate(5, t.getUpdatedAt());
			
            retour = ps.executeUpdate();
			
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return retour > 0;
        
    }
    
    @Override
    public boolean update(Engin t) {
	int retour = -1;
	try {
			
            ps = conn.prepareStatement(updateQuery);
            ps.setString(1, t.getImmatriculation());
            ps.setString(2, t.getMarque());
            ps.setDouble(3, t.getConsoEssenceJournaliere());
            ps.setDate(4, t.getCreatedAt());
            ps.setDate(5, t.getUpdatedAt());
            ps.setInt(6, t.getId());
			
            retour = ps.executeUpdate();
			
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return retour > 0;
        
    }
    
    @Override
    public boolean delete(Integer id) {
	int retour = -1;
	try {
            ps = conn.prepareStatement(deleteQuery);
            ps.setInt(1, id);
            retour = ps.executeUpdate();
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return retour > 0;
        
    }

    
    @Override
    public Engin readOne(Integer id) {
	Engin engin = null;
	try {
            ps = conn.prepareStatement(readOneQuery);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
		engin = new Engin();
		engin.setId(rs.getInt("id"));
		engin.setImmatriculation(rs.getString("immatriculation"));
		engin.setMarque(rs.getString("marque"));
		engin.setConsoEssenceJournaliere(rs.getDouble("consoEssenceJournaliere"));
                engin.setCreatedAt(rs.getDate("createdAt"));
                engin.setUpdatedAt(rs.getDate("updatedAt"));
            }
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return engin;
        
    }
    
    @Override
    public List<Engin> readAll() {
	List<Engin> listEngins = new LinkedList<>();
	Engin engin = null;
	try {
            ps = conn.prepareStatement(readAllQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
		engin = new Engin();
		engin.setId(rs.getInt("id"));
		engin.setImmatriculation(rs.getString("immatriculation"));
		engin.setMarque(rs.getString("marque"));
		engin.setConsoEssenceJournaliere(rs.getDouble("consoEssenceJournaliere"));
                engin.setCreatedAt(rs.getDate("createdAt"));
                engin.setUpdatedAt(rs.getDate("updatedAt"));
		listEngins.add(engin);
			}
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return listEngins;
        
    }


    
}
