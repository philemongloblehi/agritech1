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
public class Engin {
    
    private int id;
    private String immatriculation;
    private String marque;
    private double consoEssenceJournaliere;
    
    private Date createdAt;
    private Date updatedAt;

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

    public Engin() {
        super();
    }

    public Engin(String immatriculation, String marque, double consoEssenceJournaliere) {
        super();
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.consoEssenceJournaliere = consoEssenceJournaliere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getConsoEssenceJournaliere() {
        return consoEssenceJournaliere;
    }

    public void setConsoEssenceJournaliere(double consoEssenceJournaliere) {
        this.consoEssenceJournaliere = consoEssenceJournaliere;
    }

    @Override
    public String toString() {
        return "Engin{" + "id=" + id + ", immatriculation=" + immatriculation + ", marque=" + marque + ", consoEssenceJournaliere=" + consoEssenceJournaliere + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }

    
    
    
    
}
