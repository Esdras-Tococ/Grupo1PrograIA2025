
package com.mycompany.proyecto.Zoologico;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
    

public class CrearArchivo {
    public static void main(String[] args) {

        var nombreArchivo = "mi archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            //preguntar si ya existe el archivo en el disco duro
            //de lo contrario crear uno
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {

                //crear un archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                // Se guarda el archivo a disco duro con variable.close
                salida.close();
                System.out.println("Se a creado el archivo");
            }
        } catch(IOException e){
            System.out.println("Error! " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    
    
    
    

