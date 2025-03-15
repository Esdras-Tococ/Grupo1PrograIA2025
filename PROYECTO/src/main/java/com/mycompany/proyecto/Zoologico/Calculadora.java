
package com.mycompany.proyecto.Zoologico;

import java.io.BufferedReader;
import java.io.FileReader;


public class Calculadora {
    
    
    public static int Consulta(String key) {
        
     
        
         try (FileReader fr = new FileReader("Data.txt")) {
         BufferedReader br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null){
         
                String [] buscar = linea.split(",");
                
        
              for (String a :buscar) {
                  if (a.equals(key.toLowerCase())) {
   
                    String Cantidad = buscar[6];
                  
                    return Integer.parseInt(Cantidad);
                      
                  }
                
             }
                 
             
         }
             
             }
         catch(Exception e){ return 0;
         }
             
    return 0;
        
        
        
        
        
        
        
       

     
    }



    public static int Consumo(int Dias, int Cantidad) {
     
              if (Dias ==0) {
         return 0;
            
        }
    return Cantidad + Consumo(Dias -1, Cantidad);
        
        
        
        
        
        
        
        
    }

}
