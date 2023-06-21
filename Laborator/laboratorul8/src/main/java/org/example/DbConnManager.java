package org.example;

import java.sql.*;

public class DbConnManager {
    private final Connection conn;

    public DbConnManager(String url, String username, String password) throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
    }

    public ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(query);
    }

    public void close() throws SQLException {
        conn.close();
    }
}
