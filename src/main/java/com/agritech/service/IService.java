/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.service;

import java.util.List;

/**
 *
 * @author jhipster
 */
public interface IService<T, PK> {
    
    public boolean ajouter(T t);
    public boolean modifier(T t);
    public boolean supprimer(PK pk);
    public T lireUn(PK pk);
    public List<T> liretout();
    
}
