package com.bank.dataaccess;

import java.sql.*;

public class DBConnect {
    private Connection conn;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/west_bank";
            String user = "ADMIN";
            String pass = "tg-m2Ej7";
            conn= DriverManager.getConnection(url, user, pass);
            System.out.println("se ha establecido conexión");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
}
