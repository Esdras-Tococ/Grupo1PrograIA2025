
package com.mycompany.proyecto.Zoologico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi archivo.txt";
        var archivo = new File(nombreArchivo);
        try{

            System.out.printf("%-15s %-25s %-25s %-25s %-25s %-25s%n", "ID", "Animal", "Peso(Kg)", "Edad(años)", "Altura(m)", "Nombre");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea archivo
            var linea = entrada.readLine();
            //Leemos todas las lineas
            while (linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }
            //cerrar archivo
            entrada.close();
        }   catch (Exception e){
            System.out.println("Error al leer el archivo" + e);
        }
    }
}
    
    
