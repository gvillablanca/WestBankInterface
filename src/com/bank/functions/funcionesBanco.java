package com.bank.functions;

import com.bank.classBank.Cliente;
import com.bank.classBank.Cuenta;
import javax.swing.JOptionPane;


public class funcionesBanco {    
    public static boolean isNumeric(String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} 
        catch (NumberFormatException e){
            System.out.println("INGRESE VALOR NUMERICO...");
            return false;
	}
    }
    
    public static String checkRut(String rut) {
        try
        {
            int cont=0;
            String format;
            if(rut.length() == 0){
                return "";
            }else{
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                format = "-"+rut.substring(rut.length()-1);
                for(int i = rut.length()-2;i>=0;i--){
                    format = rut.substring(i, i+1)+format;
                    cont++;
                    if(cont == 3 && i != 0){
                        format = "."+format;
                        cont = 0;
                    }
                }
                return format;
            }
        }
        catch(Exception e){
            String mensaje = e.toString();
            return mensaje;
        }
    }
    
    public static boolean verificarCuenta(String numeroCuenta){
        try{
            int numeroCuentaInt = Integer.parseInt(numeroCuenta);
            Cuenta cuenta = new Cuenta();
            cuenta.obtener(numeroCuentaInt);
            
            if(cuenta.getNumeroCuenta() != 0){
                return true;
            }
            else{
                return false;
            }            
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean verificarRut(String rut){
        try{
            Cliente cliente = new Cliente();
            cliente.obtener(rut);
            
            if(cliente.getRut() != null){
                return true;
            }
            else{
                return false;
            }  
            
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean transferenciaCuenta(String numeroCuenta, int monto, String informacion){
        try{
            int numeroCuentaInt = Integer.parseInt(numeroCuenta);
            
            Cuenta cuenta = new Cuenta();
            cuenta.obtener(numeroCuentaInt);
            
            if(cuenta != null){
                if(informacion.equals("O")){                
                    if(cuenta.getSaldo() > 0 || cuenta.getSaldo() >= monto){
                        int saldoOrigenNuevo = cuenta.getSaldo() - monto;
                        if(cuenta.modificarSaldo(saldoOrigenNuevo, numeroCuentaInt)){
                            return true; 
                        }
                        else{
                            return false;
                        }                         
                    }
                    else{
                       JOptionPane.showMessageDialog(null, "Saldo insuficiente para transferencia", "Advertencia", JOptionPane.OK_OPTION);
                       return false; 
                    }                    
                }
                else if(informacion.equals("D")){          
                    int saldoDestinoNuevo = cuenta.getSaldo() + monto;
                    if(cuenta.modificarSaldo(saldoDestinoNuevo, numeroCuentaInt)){
                        return true; 
                    }
                    else{
                        return false;
                    } 
                }
                else{
                   return false;  
                }    
            }
            else{
               return false; 
            }   
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean depositoGiro(String rut, int monto, String informacion){
        try{
            Cliente cliente = new Cliente();
            cliente.dataFull(rut);
            
            int numeroCuentaInt = cliente.getCuenta();
            
            Cuenta cuenta = new Cuenta();
            cuenta.obtener(numeroCuentaInt);
            
            if(cuenta != null){
                if(informacion.equals("GRO")){                
                    if(cuenta.getSaldo() > 0 && cuenta.getSaldo() >= monto){
                        int saldoOrigenNuevo = cuenta.getSaldo() - monto;
                        if(cuenta.modificarSaldo(saldoOrigenNuevo, numeroCuentaInt)){
                            return true; 
                        }
                        else{
                            return false;
                        }                         
                    }
                    else{
                       return false; 
                    }                    
                }
                else if(informacion.equals("DTO")){          
                    int saldoDestinoNuevo = cuenta.getSaldo() + monto;
                    if(cuenta.modificarSaldo(saldoDestinoNuevo, numeroCuentaInt)){
                        return true; 
                    }
                    else{
                        return false;
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error en sistema, volver a intentar nuevamente", "Advertencia", JOptionPane.OK_OPTION);
                    return false;                   
                }    
            }
            else{
               return false; 
            }   
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
}
