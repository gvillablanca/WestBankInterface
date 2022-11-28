package bank.functions;

import bank.classBank.Cliente;
import java.util.List;

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
    
    public static boolean verificarCuenta(List<Cliente> clienteBanco, String numeroCuenta){
        try{
            int numeroCuentaInt = Integer.parseInt(numeroCuenta);
            if(clienteBanco == null){
                return false;
            }
            else{
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(clienteBanco.get(i).getCuenta().getNumeroCuenta() == numeroCuentaInt){
                            return true;                    
                        }
                    }
                }
                return false;
            }
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean transferenciaCuenta(List<Cliente> clienteBanco, String numeroCuenta, String informacion, int monto){
        try{
            int numeroCuentaInt = Integer.parseInt(numeroCuenta);
            for(int i = 0;i<=clienteBanco.size();i++){
                if(clienteBanco.size()>0){
                    if(clienteBanco.get(i).getCuenta().getNumeroCuenta() == numeroCuentaInt){
                        if(informacion.equals("O")){
                            int nsaldo = clienteBanco.get(i).getCuenta().getSaldo() - monto;
                            clienteBanco.get(i).getCuenta().setSaldo(nsaldo);
                            return true;
                        }
                        else if(informacion.equals("D")){
                            int nsaldo = clienteBanco.get(i).getCuenta().getSaldo() + monto;
                            clienteBanco.get(i).getCuenta().setSaldo(nsaldo);
                           return true; 
                        }                        
                    }
                }
            }
            return false;
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
}
