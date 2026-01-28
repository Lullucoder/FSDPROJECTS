package com.klu.jdbcdemoapp1;

import java.sql.*;

public class JdbcDemoApp1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/students_db";
        String username = "root";
        String password = "prashant";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Connected to JDBC Program");


            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                int sno = rs.getInt("sno");
                String name = rs.getString("name");
                System.out.println(sno + " " + name);
            }

            
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
