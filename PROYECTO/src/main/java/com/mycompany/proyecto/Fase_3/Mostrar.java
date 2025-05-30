/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3;

import static com.mycompany.proyecto.Fase_3.Menu_3.scanner;
import com.mycompany.proyecto.Fase_3.Insertar;


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
            String opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "C":
                    Insertar(tipoAnimal.toLowerCase());
                    break;
                case "R":
                    System.out.println("Función CONSULTAR para " + tipoAnimal + " (no implementada).");
                    break;
                case "U":
                    System.out.println("Función ACTUALIZAR para " + tipoAnimal + " (no implementada).");
                    break;
                case "D":
                    System.out.println("Función ELIMINAR para " + tipoAnimal + " (no implementada).");
                    break;
                case "X":
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void Insertar(String toLowerCase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
    
