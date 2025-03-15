
package com.mycompany.proyecto.Zoologico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Registros {
    
    public static void Export() {
        String archivoCSV ="data.csv";
        
        try (FileReader fr = new FileReader("Data.txt")) {
         BufferedReader br = new BufferedReader(fr);
      
         String linea;
         while((linea=br.readLine())!=null)
             
            try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV, true))) {
            long ID = Files.lines(Paths.get(archivoCSV)).count();
            writer.println(ID+","+linea);
        }   catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
      }
      catch(Exception e){
         e.printStackTrace();
      }
        
        
        
        
        
        
        
       
        
        
    }
    
    
    
    
     public static void save(String datos) {//recibe un argumento string 
        String archivoCSV="Data.txt";
        String datos7= datos.toLowerCase();
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV, true))) {
        long ID = Files.lines(Paths.get(archivoCSV)).count();
            writer.println(ID+","+datos7);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo ");
        }
        
        
    }
    
}
