package com.bank.functions;

import com.bank.classBank.Cliente;
import com.bank.ui.GestionarCliente;
import com.bank.ui.gestionarCuenta;
import com.bank.ui.Home;
import java.util.ArrayList;

public class FuncionesMenu {
    public void home(){
        Home home = new Home();  
        home.setTitle("Inicio");
        home.setResizable(true);
        home.setLocationRelativeTo(null);
        home.setVisible(true);        
    }
    
    public void home(ArrayList<Cliente> clienteBanco){
        Home home = new Home(clienteBanco);  
        home.setTitle("Inicio");
        home.setResizable(true);
        home.setLocationRelativeTo(null);
        home.setVisible(true);        
    }
        
    public void gestionarCliente(ArrayList<Cliente> clienteBanco){
        GestionarCliente gestionarCliente = new GestionarCliente(clienteBanco);  
        gestionarCliente.setTitle("Gestionar Cuenta");
        gestionarCliente.setResizable(true);
        gestionarCliente.setVisible(true);
        gestionarCliente.setLocationRelativeTo(null);
    }
    
    public void gestionarCuenta(ArrayList<Cliente> clienteBanco){
        gestionarCuenta gestionarCuenta = new gestionarCuenta(clienteBanco);  
        gestionarCuenta.setTitle("Gestionar Cuenta");
        gestionarCuenta.setResizable(true);
        gestionarCuenta.setVisible(true);
        gestionarCuenta.setLocationRelativeTo(null);
    }
}
