package com.bank.dataaccess;

import java.sql.*;

public class ClienteDA {
    
    public ResultSet get(String rut){
      DBConnect dbCtx = new DBConnect(); 
      String st = "SELECT RUT, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, DOMICILIO, COMUNA, TELEFONO, NUMERO_CUENTA FROM CLIENTE WHERE RUT = ? ";
      ResultSet rs;
      try{
          PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
          pst.setString(1, rut);
          rs=pst.executeQuery();
          return rs;
      }
      catch(SQLException e){
          System.out.println("error: " + e.getMessage());
          return null;
      }        
    }
    
    public ResultSet verificarCliente (String rut){
        DBConnect dbCtx = new DBConnect(); 
        String st = "SELECT RUT FROM CLIENTE WHERE RUT = ?";
        ResultSet rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setString(1, rut);
            rs=pst.executeQuery();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return null;
        } 
    }
}
