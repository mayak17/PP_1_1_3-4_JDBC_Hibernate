package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String host = "jdbc:mysql://localhost:3306/my_db_kata";
    private static final String user = "root";
    private static final String password = "root";


    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(host, user, password);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
