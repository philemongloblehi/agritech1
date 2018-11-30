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
import com.agritech.dao.IEmployeDao;
import com.agritech.domaine.Employe;

/**
 *
 * @author jhipster
 */
public class EmployeDao implements IEmployeDao {
    
    private String saveQuery = "INSERT INTO employe(matricule, nom, prenoms, fonction, sexe, contact, salaire, createdAt, updatedAt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String updateQuery = "UPDATE employe SET matricule = ?, nom = ?, prenoms = ?, fonction = ?, sexe = ?, contact = ?, salaire = ?, createdAt = ?, updatedAt = ? WHERE id = ? ";
    private String deleteQuery = "DELETE FROM employe WHERE id = ?";
    private String readOneQuery = "SELECT * FROM employe WHERE id = ?";
    private String readAllQuery = "SELECT * FROM employe";
    
    Connection conn = Singleton.getConnection();
    PreparedStatement ps;
    
    @Override
    public boolean save(Employe t) {
        int retour = -1;
        try {
			
            ps = conn.prepareStatement(saveQuery);
            ps.setString(1, t.getMatricule());
            ps.setString(2, t.getNom());
            ps.setString(3, t.getPrenoms());
            ps.setString(4, t.getFonction());
            ps.setString(5, t.getSexe());
            ps.setString(6, t.getContact());
            ps.setInt(7, t.getSalaire());
            ps.setDate(8, t.getCreatedAt());
            ps.setDate(9, t.getUpdatedAt());
			
            retour = ps.executeUpdate();
			
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retour > 0;
    }

    @Override
    public boolean update(Employe t) {
	int retour = -1;
	try {
			
            ps = conn.prepareStatement(updateQuery);
            ps.setString(1, t.getMatricule());
            ps.setString(2, t.getNom());
            ps.setString(3, t.getPrenoms());
            ps.setString(4, t.getFonction());
            ps.setString(5, t.getSexe());
            ps.setString(6, t.getContact());
            ps.setInt(7, t.getSalaire());
            ps.setDate(8, t.getCreatedAt());
            ps.setDate(9, t.getUpdatedAt());
            ps.setInt(10, t.getId());
			
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
    public Employe readOne(Integer id) {
	Employe employe = null;
	try {
			
            ps = conn.prepareStatement(readOneQuery);
            ps.setInt(1, id);
			
            ResultSet rs = ps.executeQuery();
			
            while (rs.next()) {
		employe = new Employe();
		employe.setId(rs.getInt("id"));
		employe.setMatricule(rs.getString("matricule"));
		employe.setNom(rs.getString("nom"));
		employe.setPrenoms(rs.getString("prenoms"));
		employe.setFonction(rs.getString("fonction"));
		employe.setSexe(rs.getString("sexe"));
		employe.setContact(rs.getString("contact"));
		employe.setSalaire(rs.getInt("salaire"));
                employe.setCreatedAt(rs.getDate("createdAt"));
                employe.setUpdatedAt(rs.getDate("updatedAt"));
            }
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return employe;
        
    }

    @Override
    public List<Employe> readAll() {
	List<Employe> listEmployes = new LinkedList<>();
	Employe employe = null;
	try {
			
            ps = conn.prepareStatement(readAllQuery);
			
            ResultSet rs = ps.executeQuery();
			
            while (rs.next()) {
				
		employe = new Employe();
		employe.setId(rs.getInt("id"));
		employe.setMatricule(rs.getString("matricule"));
		employe.setNom(rs.getString("nom"));
		employe.setPrenoms(rs.getString("prenoms"));
		employe.setFonction(rs.getString("fonction"));
		employe.setSexe(rs.getString("sexe"));
		employe.setContact(rs.getString("contact"));
		employe.setSalaire(rs.getInt("salaire"));
                employe.setCreatedAt(rs.getDate("createdAt"));
                employe.setUpdatedAt(rs.getDate("updatedAt"));                
				
		listEmployes.add(employe);
			}
		} catch (SQLException e) {
                    e.printStackTrace();
		}
		return listEmployes;
	}


    
}
