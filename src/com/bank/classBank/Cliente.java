package com.bank.classBank;

import com.bank.dataaccess.ClienteDA;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente {
    String rut;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String domicilio;
    String comuna;
    String telefono;
    int cuenta;

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public String getDomicilio() {
            return domicilio;
        }

        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }

        public String getComuna() {
            return comuna;
        }

        public void setComuna(String comuna) {
            this.comuna = comuna;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getCuenta() {
            return cuenta;
        }

        public void setCuenta(int cuenta) {
            this.cuenta = cuenta;
        }

        
        @Override
        public String toString() {
            return "Cliente{" +
                    "RUT='" + rut + '\'' +
                    ", NOMBRE='" + nombre + '\'' +
                    ", APELLIDO-PATERNO='" + apellidoPaterno + '\'' +
                    ", APELLIDO-MATERNO='" + apellidoMaterno + '\'' +
                    ", DOMICILIO='" + domicilio + '\'' +
                    ", COMUNA='" + comuna + '\'' +
                    ", TELEFONO='" + telefono + '\'' +
                    ", CUENTA='" + cuenta + '\'' +
                    '}';
        }
        
        
    public Cliente obtener(String rut){
        ResultSet rs = new ClienteDA().verificarCliente(rut);
        if(rs !=null){
            try{
                if(rs.next()){
                    this.rut = rs.getString("rut");
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
    
    public Cliente dataFull(String rut){
        ResultSet rs = new ClienteDA().get(rut);
        if(rs !=null){
            try{
                if(rs.next()){
                    this.rut = rs.getString("rut");
                    this.nombre = rs.getString("nombre");
                    this.apellidoPaterno = rs.getString("apellido_paterno");
                    this.apellidoMaterno = rs.getString("apellido_materno");
                    this.domicilio = rs.getString("domicilio");
                    this.comuna = rs.getString("comuna");
                    this.telefono = rs.getString("telefono");
                    this.cuenta = rs.getInt("numero_cuenta");
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
    
    
    public boolean crearCliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, String telefono, int cuenta){
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellidoPaterno(apellidoPaterno);
        this.setApellidoMaterno(apellidoMaterno);
        this.setDomicilio(domicilio);
        this.setComuna(comuna);
        this.setTelefono(telefono);
        this.setCuenta(cuenta);
        
        int reg = new ClienteDA().crearCliente(this);
        
        if(reg == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
