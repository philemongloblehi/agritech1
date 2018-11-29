/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.domaine;

import java.util.Date;

/**
 *
 * @author jhipster
 */
public class Rendement {
    
    private int id;
    private String designation;
    private String annee;
    private double quantiteRecolte;
    
    private Date createdAt;
    private Date updatedAt;

    public Rendement() {
        super();
    }

    public Rendement(String designation, String annee, double quantiteRecolte) {
        super();
        this.designation = designation;
        this.annee = annee;
        this.quantiteRecolte = quantiteRecolte;
    }

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

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public double getQuantiteRecolte() {
        return quantiteRecolte;
    }

    public void setQuantiteRecolte(double quantiteRecolte) {
        this.quantiteRecolte = quantiteRecolte;
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

    @Override
    public String toString() {
        return "Rendement{" + "id=" + id + ", designation=" + designation + ", annee=" + annee + ", quantiteRecolte=" + quantiteRecolte + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
    
}
