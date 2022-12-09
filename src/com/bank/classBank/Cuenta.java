package com.bank.classBank;

import com.bank.dataaccess.CuentaDA;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cuenta {
    int numeroCuenta;
    String tipoCuenta;
    int saldo;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "NUMERO-CUENTA='" + numeroCuenta + '\'' +
                "TIPO-CUENTA='" + tipoCuenta + '\'' +
                ", SALDO='" + saldo + '\'' +
                '}';
    }

public Cuenta obtener(int numero_cuenta){
        ResultSet rs = new CuentaDA().get(numero_cuenta);
        if(rs !=null){
            try{
                if(rs.next()){
                    this.numeroCuenta = rs.getInt("numero_cuenta");
                    this.tipoCuenta = rs.getString("tipo_cuenta");
                    this.saldo = rs.getInt("saldo");
                    return this;
                }
                else{
                    System.out.println("Falló");
                    return null;
                }
            }catch(SQLException ex) {
                System.out.println("Falló" + ex);
                return null;
            }
        }
        else{
        return null;
        }
    }
    
}
