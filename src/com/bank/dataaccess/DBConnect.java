package com.bank.dataaccess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBConnect {
    private Connection conn;   
    
    public DBConnect(){
        try{
            InputStream entrada = new FileInputStream("../WestBankInterface/src/com/bank/properties/app.properties");
            Properties propiedades = new Properties();
            propiedades.load(entrada);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = propiedades.getProperty("url");
            String user = propiedades.getProperty("user");
            String pass = propiedades.getProperty("pass");
            conn= DriverManager.getConnection(url, user, pass);
            System.out.println("se ha establecido conexión");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
}
