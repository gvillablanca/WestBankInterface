package com.bank.dataaccess;

import com.bank.classBank.Cliente;
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
    
     public int crearCliente(Cliente cliente){
        DBConnect dbCtx = new DBConnect(); 
        String st = "INSERT INTO CLIENTE(RUT, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, DOMICILIO, COMUNA, TELEFONO, NUMERO_CUENTA)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setString(1, cliente.getRut());
           //falta  por completar
            rs=pst.executeUpdate();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return 0;
        }        
    }
}
