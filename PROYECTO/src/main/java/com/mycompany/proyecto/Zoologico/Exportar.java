
package com.mycompany.proyecto.Zoologico;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exportar {
    public static void Export(String datos) {//recibe un argumento string 
        String archivoCSV="Data.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV, true))) {
        long ID = Files.lines(Paths.get(archivoCSV)).count();
            writer.println(ID+","+datos);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
        
    }
    
}
