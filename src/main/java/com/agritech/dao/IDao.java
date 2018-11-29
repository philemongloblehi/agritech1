/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.dao;

import java.util.List;

/**
 *
 * @author jhipster
 */
public interface IDao<T, PK> {
    
    public boolean save(T t);
    public boolean update(T t);
    public boolean delete(PK id);
    public T readOne(PK id);
    public List<T> readAll();
    
}
