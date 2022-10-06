package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rood";

    private static final Connection connection = connect();

    private static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
    public static Connection getConnection() {
        return connection;
    }
}


