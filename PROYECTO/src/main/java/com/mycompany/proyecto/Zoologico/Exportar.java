
package com.mycompany.proyecto.Zoologico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Exportar {
    
    
    
    
    
    
    public void export() {
        String datos="jirafa , 4, 4.2, herviboro, 9kg";
        String archivoCSV="Data.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV, true))) {
        long ID = Files.lines(Paths.get(archivoCSV)).count();
            writer.println(ID+","+datos);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
        
    }
    
}
