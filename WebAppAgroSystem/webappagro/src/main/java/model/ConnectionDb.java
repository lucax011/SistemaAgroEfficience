package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public class ConnectionDb {

    Connection con = null;
    String driver = "com.mysql.jdbc.Driver";

    public Connection getCon() {

        Connection connection = null;
        try {
            // Load the JDBC driver

            Class<?> driver_class = Class.forName(driver);
            @SuppressWarnings("deprecation")
            Driver driver = (Driver) driver_class.newInstance();

            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return connection;

    }

    public java.sql.Statement createStatement() {
        // TODO Auto-generated method stub
        return null;
    }
}
