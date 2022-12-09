package com.bank.dataaccess;

import java.sql.*;

public class ClienteDA {
    
    public ResultSet get(String rut){
      DBConnect dbCtx = new DBConnect(); 
      String st = "SELECT \n" +
                "	CLI.RUT, \n" +
                "	CLI.NOMBRE, \n" +
                "	CLI.APELLIDO_PATERNO, \n" +
                "	CLI.APELLIDO_MATERNO, \n" +
                "	CLI.DOMICILIO, \n" +
                "	CLI.COMUNA, \n" +
                "	CLI.TELEFONO, \n" +
                "	CLI.NUMERO_CUENTA, \n" +
                "	CU.TIPO_CUENTA, \n" +
                "	CU.SALDO \n" +
                "FROM \n" +
                "	CLIENTE CLI, \n" +
                "	CUENTA CU \n" +
                "WHERE \n" +
                "    CLI.NUMERO_CUENTA = CU.NUMERO_CUENTA\n" +
                "    AND CLI.RUT = ?";
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
