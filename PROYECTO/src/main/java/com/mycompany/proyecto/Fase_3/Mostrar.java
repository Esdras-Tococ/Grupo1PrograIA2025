/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3;

import static com.mycompany.proyecto.Fase_3.Menu_3.scanner;
import com.mycompany.proyecto.Fase_3.Insertar;
import  com.mycompany.proyecto.Fase_3.ConsultaDB.Consultas;
import com.mycompany.proyecto.Fase_3.ConsultaDB.DeleteAnimales;
import com.mycompany.proyecto.Fase_3.ConsultaDB.UpdateAnimales;

/**
 *
 * @author esdra
 */
public class Mostrar {


    public static void mostrarSubMenuCRUD(String tipoAnimal) {
        while (true) {
            
            
            System.out.println("\n--- OPERACIONES CON " + tipoAnimal.toUpperCase() + " ---");
            System.out.println("C: Insertar");
            System.out.println("R: Consultar");
            System.out.println("U: Actualizar");
            System.out.println("D: Eliminar");
            System.out.println("X: Volver al menú anterior");
            System.out.print("Seleccione una opción: ");
            try {
                
            
            String opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "C":
                  //  Insertar(tipoAnimal.toLowerCase());
                    break;
                case "R":
                   Consultas.consultar(tipoAnimal.toLowerCase());
                    break;
                case "U":
                    UpdateAnimales.updates(tipoAnimal);
                    break;
                case "D":
                    DeleteAnimales.delete(tipoAnimal);
                    break;
                case "X":
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } catch (Exception e) {
                System.out.println(e);
            }
    }

    

    
}
}
