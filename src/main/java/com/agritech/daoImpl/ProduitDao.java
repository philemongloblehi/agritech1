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
import com.agritech.dao.IProduitDao;
import com.agritech.domaine.Produit;


/**
 *
 * @author jhipster
 */
public class ProduitDao implements IProduitDao {
    
    private String saveQuery = "INSERT INTO produit(designation, prix, createdAt, updatedAt) VALUES(?, ?, ?, ?)";
    private String updateQuery = "UPDATE produit SET designation = ?, prix = ?, createdAt = ?, updatedAt = ? WHERE id = ?";
    private String deleteQuery = "DELETE FROM produit WHERE id = ?";
    private String readOneQuery = "SELECT * FROM produit WHERE id = ?";
    private String readAllQuery = "SELECT * FROM produit";
	
    PreparedStatement ps;
    Connection conn = Singleton.getConnection();

    @Override
    public boolean save(Produit t) {
	int retour = -1;
	try {
			
            ps = conn.prepareStatement(saveQuery);
            ps.setString(1, t.getDesignation());
            ps.setInt(2, t.getPrix());
            ps.setDate(3, t.getCreatedAt());
            ps.setDate(4, t.getUpdatedAt());
			
            retour = ps.executeUpdate();
			
	} catch (SQLException e) {
            e.printStackTrace();
	}
        return retour > 0;
	
    }

    @Override
    public boolean update(Produit t) {
	int retour = -1;
	try {
			
            ps = conn.prepareStatement(updateQuery);
            ps.setString(1, t.getDesignation());
            ps.setInt(2, t.getPrix());
            ps.setDate(3, t.getCreatedAt());
            ps.setDate(4, t.getUpdatedAt());
            ps.setInt(5, t.getId());
			
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
    public Produit readOne(Integer id) {
	Produit produit = null;
	try {
			
            ps = conn.prepareStatement(readOneQuery);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
			
            while (rs.next()) {
				
		produit = new Produit();
		produit.setId(rs.getInt("id"));
		produit.setDesignation(rs.getString("designation"));
		produit.setPrix(rs.getInt("prix"));
                produit.setCreatedAt(rs.getDate("createdAt"));
                produit.setUpdatedAt(rs.getDate("updatedAt"));
			}
		} catch (SQLException e) {
                    e.printStackTrace();
		}
	return produit;
	
    }

    @Override
    public List<Produit> readAll() {
		
        List<Produit> listProduits = new LinkedList<>();
        Produit produit = null;
		
        try {
			
            ps = conn.prepareStatement(readAllQuery);
            ResultSet rs = ps.executeQuery();
			
            while (rs.next()) {
				
		produit = new Produit();
		produit.setId(rs.getInt("id"));
		produit.setDesignation(rs.getString("designation"));
		produit.setPrix(rs.getInt("prix"));
                produit.setCreatedAt(rs.getDate("createdAt"));
                produit.setUpdatedAt(rs.getDate("updatedAt"));
				
		listProduits.add(produit);
            }
	} catch (SQLException e) {
            e.printStackTrace();
	}
		return listProduits;
	
    }


    
}
