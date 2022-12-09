package com.bank.dataaccess;

import java.sql.*;

public class CuentaDA {
    public ResultSet get(int numero_cuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "SELECT \n" +
                  "    NUMERO_CUENTA,\n" +
                  "    TIPO_CUENTA,\n" +
                  "    SALDO\n" +
                  " FROM\n" +
                  "    CUENTA\n" +
                  " WHERE\n" +
                  "    CLI.NUMERO_CUENTA = ?";
        ResultSet rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, numero_cuenta);
            rs=pst.executeQuery();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return null;
        }        
    }
}
