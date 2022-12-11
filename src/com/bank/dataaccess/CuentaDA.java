package com.bank.dataaccess;

import com.bank.classBank.Cuenta;
import java.sql.*;

public class CuentaDA {
 
    public int updateSaldo(Cuenta cuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "UPDATE CUENTA SET SALDO = ? WHERE NUMERO_CUENTA = ?";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, cuenta.getSaldo());
            pst.setInt(2, cuenta.getNumeroCuenta());
            rs=pst.executeUpdate();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return 0;
        }        
    }
    
    public ResultSet verificarCuenta (int numero_cuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "SELECT NUMERO_CUENTA, TIPO_CUENTA, SALDO FROM CUENTA WHERE NUMERO_CUENTA = ?";
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
    
    public int crearCuenta(Cuenta cuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "INSERT INTO CUENTA(NUMERO_CUENTA, TIPO_CUENTA, SALDO)\n" +
                    "VALUES(?, ?, 0)";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, cuenta.getNumeroCuenta());
            pst.setString(2, cuenta.getTipoCuenta());            
            rs=pst.executeUpdate();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return 0;
        }        
    }    
}
