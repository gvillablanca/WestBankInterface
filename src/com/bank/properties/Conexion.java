package com.bank.properties;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.Properties;

public class Conexion {
    Properties p = new Properties();
    
    public Conexion(){
         try {
         p.load(new FileReader("../com/bank/properties/app.properties"));
         p.getProperty("url");         
         System.out.println("uno="+p.getProperty("uno"));
         
         Enumeration<Object> keys = p.keys();
         while (keys.hasMoreElements()){
            Object key = keys.nextElement();
            System.out.println(key + " = "+ p.get(key));
         }

      } catch (Exception e){
         System.err.println("Error reading file "+e.getMessage());
      }
    }
}
