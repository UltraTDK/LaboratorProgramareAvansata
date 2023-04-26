package com.compulsory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnManager {
    private static DbConnManager instance = null;
    private Connection connection = null;

    private DbConnManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "password";
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbConnManager getInstance() {
        if (instance == null) {
            instance = new DbConnManager();
        }
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}
