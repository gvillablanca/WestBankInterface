package bank.westbankinterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import bank.classBank.Cliente;
import bank.classBank.Cuenta;

public class WestBankInterface {
    public static void main(String[] args) {
        List<Cliente> clienteBanco = new LinkedList<>(); 
        menu(clienteBanco);
        
        lookAndFeel();
        Home menu = new Home();
        menu.setVisible(true);
    }

    private static void lookAndFeel() {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } 
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //funciones de banco
    
     public static void menu(List<Cliente> clienteBanco){
        System.out.println("*********************************************************************");
        System.out.println("BIENVENIDO, PARA CONTINUAR SELECCIONE UNA DE LAS SIGUIENTES OPCIONES...\n");
        System.out.println("*********************************************************************");
        System.out.println("1- REGISTRAR CLIENTE \n2- VER DATOS DE CLIENTES \n3- DEPOSITAR \n4- GIRAR \n5- CONSULTAR SALDO \n6- SALIR");
        System.out.println("*********************************************************************");
        String opcion = new String();
        while(opcion.isEmpty()){
            System.out.println("OPCION: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim();
            
            if(opcion.isEmpty()){
                System.out.println("FAVOR SELECCIONAR UNA OPCION\n");
            }
            else if(opcion.equals("1")){
                registrarCliente(clienteBanco);
            }
            else if(opcion.equals("2")){
                verDatos(clienteBanco);
            }
            else if(opcion.equals("3")){
                deposito(clienteBanco);
            }
            else if(opcion.equals("4")){
                giros(clienteBanco);
            }
            else if(opcion.equals("5")){
                consultaSaldo(clienteBanco);
            }
            else if(opcion.equals("6")){
                salida();
            }
            else{
                System.out.println("INGRESAR OPCION VALIDA");
                opcion = new String();
            }
        }
    }
    
    public static void registrarCliente(List<Cliente> clienteBanco){
        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();
        
        String rut = new String();
        String nombre = new String();
        String apellidoPaterno = new String();
        String apellidoMaterno = new String();
        String domicilio = new String();
        String comuna = new String();
        String telefono = new String();
        String numeroCuenta = new String();
        int saldo =0;
        
        while(rut.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || domicilio.isEmpty() || comuna.isEmpty() || telefono.isEmpty()){
            System.out.println("RUT (INGRESE RUT SIN PUNTOS NI GUION) : ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT....\n");
            }
            else if(rut.length() < 8 || rut.length() > 9){
                System.out.println("FAVOR INGRESAR RUT CORRECTO SIN PUNTOS NI GUIONES....\n");
            }
            else{
                rut = checkRut(rut);
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(clienteBanco.get(i).getRut().equals(rut)){
                            System.out.println("CLIENTE YA SE REGISTRA EN SISTEMA....\n");                            
                            break;
                        }
                        else{
                            System.out.println("*********************************************************************");
                            System.out.println("NOMBRE: ");
                            Scanner nombreIn = new Scanner(System.in);
                            nombre = nombreIn.nextLine();

                            System.out.println("APELLIDO PATERNO: ");
                            Scanner apellidoPatIn = new Scanner(System.in);
                            apellidoPaterno = apellidoPatIn.nextLine();

                            System.out.println("APELLIDO MATERNO: ");
                            Scanner apellidoMatIn = new Scanner(System.in);
                            apellidoMaterno = apellidoMatIn.nextLine();

                            System.out.println("DOMICILIO: ");
                            Scanner domicilioIn = new Scanner(System.in);
                            domicilio = domicilioIn.nextLine();

                            System.out.println("COMUNA: ");
                            Scanner comunaIn = new Scanner(System.in);
                            comuna = comunaIn.nextLine();

                            System.out.println("TELEFONO: ");
                            Scanner telefonoIn = new Scanner(System.in);
                            telefono = telefonoIn.nextLine();
                            if(isNumeric(telefono)){
                            int telefonoInt = Integer.parseInt(telefono);
                            if(telefonoInt == 0 || telefono.isEmpty() || telefonoInt < 0){
                                System.out.println("INGRESE NUMERO DE TELEFONO MAYOR A CERO");
                                break;
                            }
                            else{
                                if(telefono.length()>=8 && telefono.length()<=9){
                                    System.out.println("INGRESE NUMERO DE CUENTA (9 DIGITOS): ");
                                    Scanner numeroCuentaIn = new Scanner(System.in);
                                    numeroCuenta = numeroCuentaIn.nextLine(); 
                                    System.out.println("*********************************************************************");
                                    cliente.setRut(rut);
                                    cliente.setNombre(nombre.toUpperCase());
                                    cliente.setApellidoPaterno(apellidoPaterno.toUpperCase());
                                    cliente.setApellidoMaterno(apellidoMaterno.toUpperCase());
                                    cliente.setDomicilio(domicilio.toUpperCase());
                                    cliente.setComuna(comuna.toUpperCase());
                                    cliente.setCuenta(cuenta);
                                    cliente.setTelefono(telefono);
                                    
                                    if(isNumeric(numeroCuenta)){
                                        int numeroCuentaInt = Integer.parseInt(numeroCuenta);
                                        if(numeroCuenta.length() < 9 || numeroCuentaInt <= 0){
                                            System.out.println("INGRESE NUMERO DE CUENTA VALIDO, RECUERDE QUE DEBE SER DE 9 ...\n");
                                            break;
                                        }
                                        else{
                                            cuenta.setNumeroCuenta(Integer.parseInt(numeroCuenta));
                                            cuenta.setSaldo(saldo);                
                                            clienteBanco.add(cliente);
                                            System.out.println("CLIENTE REGISTRADO EXITOSAMENTE!\n");
                                            menu(clienteBanco);
                                            break;
                                        }
                                    }
                                    else{
                                        numeroCuenta = new String();
                                        break;
                                    }
                                }
                                else{
                                    System.out.println("INGRESE NUMERO DE TELEFONO VALIDO");
                                    telefono = new String();
                                    break;
                                }
                            }
                        }else{
                            telefono = new String();
                            break;
                        }
                            
                         }                     
                    }
                    else{
                        System.out.println("*********************************************************************");
                        System.out.println("NOMBRE: ");
                        Scanner nombreIn = new Scanner(System.in);
                        nombre = nombreIn.nextLine();

                        System.out.println("APELLIDO PATERNO: ");
                        Scanner apellidoPatIn = new Scanner(System.in);
                        apellidoPaterno = apellidoPatIn.nextLine();

                        System.out.println("APELLIDO MATERNO: ");
                        Scanner apellidoMatIn = new Scanner(System.in);
                        apellidoMaterno = apellidoMatIn.nextLine();

                        System.out.println("DOMICILIO: ");
                        Scanner domicilioIn = new Scanner(System.in);
                        domicilio = domicilioIn.nextLine();

                        System.out.println("COMUNA: ");
                        Scanner comunaIn = new Scanner(System.in);
                        comuna = comunaIn.nextLine();

                        System.out.println("TELEFONO: ");
                        Scanner telefonoIn = new Scanner(System.in);
                        telefono = telefonoIn.nextLine();
                        if(isNumeric(telefono)){
                            int telefonoInt = Integer.parseInt(telefono);
                            if(telefonoInt == 0 || telefono.isEmpty() || telefonoInt < 0){
                                System.out.println("INGRESE NUMERO DE TELEFONO MAYOR A CERO");
                                break;
                            }
                            else{
                                if(telefono.length()>=8 && telefono.length()<=9){
                                    System.out.println("INGRESE NUMERO DE CUENTA (9 DIGITOS): ");
                                    Scanner numeroCuentaIn = new Scanner(System.in);
                                    numeroCuenta = numeroCuentaIn.nextLine(); 
                                    System.out.println("*********************************************************************");
                                    cliente.setRut(rut);
                                    cliente.setNombre(nombre.toUpperCase());
                                    cliente.setApellidoPaterno(apellidoPaterno.toUpperCase());
                                    cliente.setApellidoMaterno(apellidoMaterno.toUpperCase());
                                    cliente.setDomicilio(domicilio.toUpperCase());
                                    cliente.setComuna(comuna.toUpperCase());
                                    cliente.setCuenta(cuenta);
                                    cliente.setTelefono(telefono);
                                    
                                    if(isNumeric(numeroCuenta)){
                                        int numeroCuentaInt = Integer.parseInt(numeroCuenta);
                                        if(numeroCuenta.length() < 9 || numeroCuentaInt <= 0){
                                            System.out.println("INGRESE NUMERO DE CUENTA VALIDO, RECUERDE QUE DEBE SER DE 9 ...\n");
                                            break;
                                        }
                                        else{
                                            cuenta.setNumeroCuenta(Integer.parseInt(numeroCuenta));
                                            cuenta.setSaldo(saldo);                
                                            clienteBanco.add(cliente);
                                            System.out.println("CLIENTE REGISTRADO EXITOSAMENTE!\n");
                                            menu(clienteBanco);
                                            break;
                                        }
                                    }
                                    else{
                                        numeroCuenta = new String();
                                        break;
                                    }
                                        
                                }
                                else{
                                    System.out.println("INGRESE NUMERO DE TELEFONO VALIDO");
                                    telefono = new String();
                                    break;
                                }
                            }
                        }else{
                            telefono = new String();
                        }
            
                        
                    }
                }                     
            }
        }
        menu(clienteBanco);
    }    
    
    public static void verDatos(List<Cliente> clienteBanco){
        String rut = new String();        
        while(rut.isEmpty()){
            System.out.println("RUT (INGRESE RUT SIN PUNTOS NI GUION) : ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT PARA MOSTRAR DATOS...\n");
            }
            else if(rut.length() < 8 || rut.length() > 9){
                System.out.println("FAVOR INGRESAR RUT CORRECTO SIN PUNTOS NI GUIONES....\n");
            }
            else{
                rut = checkRut(rut);
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(clienteBanco.get(i).getRut().equals(rut)){
                                    System.out.println("DATOS CLIENTES:");
                                    System.out.println("*********************************************************************");
                                    System.out.println( "RUT: " + clienteBanco.get(i).getRut()+
                                                        "\nNOMBRE: " + clienteBanco.get(i).getNombre()+
                                                        "\nAPELLIDO PATERNO: " + clienteBanco.get(i).getApellidoPaterno()+
                                                        "\nAPELLIDO MATERNO: " + clienteBanco.get(i).getApellidoMaterno()+
                                                        "\nDOMICILIO: " + clienteBanco.get(i).getDomicilio()+
                                                        "\nCOMUNA: " + clienteBanco.get(i).getComuna()+
                                                        "\nTELEFONO: " + clienteBanco.get(i).getTelefono()+
                                                        "\nNUMERO DE CUENTA: " + clienteBanco.get(i).getCuenta().getNumeroCuenta()+
                                                        "\nSALDO: " + clienteBanco.get(i).getCuenta().getSaldo());
                                    System.out.println("*********************************************************************\n");
                            break;
                        }
                        else{
                            System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA...");
                            break;
                        }
                    }
                    else{
                        System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA...");
                        break;
                    }
                }
            }
        }
        menu(clienteBanco);
    }
    
    public static void deposito(List<Cliente> clienteBanco){
        String rut = new String();
        while(rut.isEmpty()){
            System.out.println("RUT (INGRESE RUT SIN PUNTOS NI GUION) : ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT PARA MOSTRAR DATOS...\n");
            }
            else if(rut.length() < 8 || rut.length() > 9){
                System.out.println("FAVOR INGRESAR RUT CORRECTO SIN PUNTOS NI GUIONES....\n");
            }
            else{
               rut = checkRut(rut);
               for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(!clienteBanco.get(i).getRut().equals(rut)||clienteBanco.size()==0){
                            System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA");
                            break;
                        }
                        else{
                            String monto = new String();
                            System.out.println("INGRESE MONTO A DEPOSITAR: ");
                            Scanner saldoIn = new Scanner(System.in);
                            monto = saldoIn.nextLine();

                            if(isNumeric(monto)){
                                int montoInt = Integer.parseInt(monto);                        
                                if(montoInt==0 || monto.isEmpty() || montoInt<0){
                                    System.out.println("INGRESE VALOR MAYOR A CERO");
                                    break;
                                }
                                else{
                                    int nsaldo = clienteBanco.get(i).getCuenta().getSaldo() + Integer.parseInt(monto);
                                    clienteBanco.get(i).getCuenta().setSaldo(nsaldo);
                                    System.out.println("NUEVO SALDO: " + nsaldo);
                                    break;
                                }
                            }
                            else{
                                break;
                            }      
                        }
                    }
                    else{
                        System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA");
                        break;
                    }
                } 
            }
        }          
        menu(clienteBanco);
    }
    
    public static void giros(List<Cliente> clienteBanco){
        String rut = new String();
        while(rut.isEmpty()){
            System.out.println("RUT (INGRESE RUT SIN PUNTOS NI GUION) : ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT PARA MOSTRAR DATOS...\n");
            }
            else if(rut.length() < 8 || rut.length() > 9){
                System.out.println("FAVOR INGRESAR RUT CORRECTO SIN PUNTOS NI GUIONES....\n");
            }
            else{
               rut = checkRut(rut);
               for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(!clienteBanco.get(i).getRut().equals(rut)||clienteBanco.size()==0){
                            System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA");
                            break;
                        }
                        else{
                            String monto = new String();
                            System.out.println("INGRESE MONTO A GIRAR: ");
                            Scanner saldoIn = new Scanner(System.in);
                            monto = saldoIn.nextLine();

                            if(isNumeric(monto)){
                                int montoInt = Integer.parseInt(monto);                        
                                if(montoInt==0 || monto.isEmpty() || montoInt<0){
                                    System.out.println("INGRESE VALOR MAYOR A CERO");
                                    break;
                                }
                                else{
                                    int nsaldo = clienteBanco.get(i).getCuenta().getSaldo() - Integer.parseInt(monto);
                                    clienteBanco.get(i).getCuenta().setSaldo(nsaldo);
                                    System.out.println("NUEVO SALDO: " + nsaldo);
                                    break;
                                }
                            }
                            else{
                                break;
                            }      
                        }
                    }
                    else{
                        System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA");
                        break;
                    }
                } 
            }
        }          
        menu(clienteBanco);
    }
    
    public static void consultaSaldo(List<Cliente> clienteBanco){
        String rut = new String();        
        while(rut.isEmpty()){
            System.out.println("RUT (INGRESE RUT SIN PUNTOS NI GUION) : ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT PARA MOSTRAR DATOS...\n");
            }
            else if(rut.length() < 8 || rut.length() > 9){
                System.out.println("FAVOR INGRESAR RUT CORRECTO SIN PUNTOS NI GUIONES....\n");
            }
            else{
                rut = checkRut(rut);
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(clienteBanco.get(i).getRut().equals(rut)){
                                    System.out.println("SALDO DISPONIBLE:");
                                    System.out.println("*********************************************************************");
                                    System.out.println( "SALDO: " + clienteBanco.get(i).getCuenta().getSaldo());
                                    System.out.println("*********************************************************************\n");
                            break;
                        }
                        else{
                            System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA...");
                            break;
                        }
                    }
                }
            }
        }
        menu(clienteBanco);
    }
     
    public static void salida(){
        System.out.println("*********************************************************************");
        System.out.println("HASTA PRONTO...");
        System.out.println("*********************************************************************");
        System.exit(0);
    }
    
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
    
    
}
