/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agritech.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhipster
 */
public class Singleton {
    
    private static final String URL = "jdbc:mysql://localhost:3306/agritechdb";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "globlehi90";
	
    private static Connection conn;

    
    private Singleton() {
    }
    
    public static Connection getConnection() {
        
        if (conn == null) {
            try {
		conn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            } catch (SQLException e) {
		e.printStackTrace();
            }
	}
	return conn;
    }
    
}
