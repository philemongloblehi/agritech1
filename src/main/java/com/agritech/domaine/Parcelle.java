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
public class Parcelle {
    
    private int id;
    private String culture;
    private String observation;
    
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

    public Parcelle() {
        super();
    }

    public Parcelle(String culture, String observation) {
        super();
        this.culture = culture;
        this.observation = observation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "Parcelle{" + "id=" + id + ", culture=" + culture + ", observation=" + observation + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }

    
    
    
}
