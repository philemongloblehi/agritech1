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
public class Employe {
    
    private int id;
    private String matricule;
    private String nom;
    private String prenoms;
    private String sexe;
    private String fonction;
    private int salaire;
    
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

    public Employe() {
        super();
    }

    public Employe(String matricule, String nom, String prenoms, String sexe, String focntion, int salaire) {
        super();
        this.matricule = matricule;
        this.nom = nom;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.fonction = focntion;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }   
    
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenoms=" + prenoms + ", sexe=" + sexe + ", fonction=" + fonction + ", salaire=" + salaire + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }

    
    
    
    
    
}
