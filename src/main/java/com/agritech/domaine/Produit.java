/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.domaine;

import java.sql.Date;

/**
 *
 * @author jhipster
 */
public class Produit {
    
    private int id;
    private String designation;
    private int prix;
    private Date dateExpiration;
    
    private Date createdAt;
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Produit() {
        super();
    }

    public Produit(String designation, int prix, Date dateExpiration) {
        super();
        this.designation = designation;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", designation=" + designation + ", prix=" + prix + ", dateExpiration=" + dateExpiration + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
    
}
