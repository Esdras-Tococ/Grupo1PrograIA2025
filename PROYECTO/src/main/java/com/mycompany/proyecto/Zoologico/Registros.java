
package com.mycompany.proyecto.Zoologico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Registros {
    private static boolean columnas = false;
    public static void Export(String nombre) {
        
        String archivoCSV =nombre+".csv";
        
        try (FileReader fr = new FileReader("Data.txt",StandardCharsets.UTF_8)) {
         BufferedReader br = new BufferedReader(fr);
      
         String linea;
         while((linea=br.readLine())!=null)
             
            try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV,StandardCharsets.UTF_8,true))) {
           
                if (!columnas) { columnas = true;
                 
                    writer.println("ID, NOMBRE, PESO, AÑOS ,ALTURA, ALIAS, COMSUMO DE COMDIDA KG");}
        
            writer.println(linea);
        }   catch (IOException e) {
            System.out.println("Error al escribir en el archivo "+e.getMessage());
        }
      }
      catch(Exception e){
         e.printStackTrace();
      }
        
        
        
        
        
        
        System.out.println("Se exporto con exito!!!!");
       
        
        
    }
    
    
    
    
     public static void save(String datos) {//recibe un argumento string 
        String archivoCSV="Data.txt";
        String datos7= datos.toLowerCase();
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV,StandardCharsets.UTF_8, true))) {
        long ID = Files.lines(Paths.get(archivoCSV)).count();
            writer.println(ID+","+datos7);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo ");
        }
        
        
    }
    
}
