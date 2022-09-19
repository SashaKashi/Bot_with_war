package com.example.test.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://35.195.218.82:5432/activity", "sasha",
                                                                                                      "sasha");
        con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

        return con;
    }
}

