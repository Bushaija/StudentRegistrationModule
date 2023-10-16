package com.auca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mvcdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "kinyarwanda";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Connection getConnection() throws SQLException {
    	try {
    		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); 
    	} catch (SQLException ex) {
    		ex.printStackTrace();
    		throw ex;
    	}
    }

}