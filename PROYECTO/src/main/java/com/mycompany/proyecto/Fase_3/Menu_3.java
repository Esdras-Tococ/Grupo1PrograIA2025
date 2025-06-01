/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3;

import static com.mycompany.proyecto.Fase_3.Mostrar.mostrarSubMenuCRUD;
import java.util.Scanner;

/**
 *
 * @author esdras
 */
public class Menu_3 {

    static Scanner scanner = new Scanner(System.in);
    
    
    public static void SubMenuFase3() {
        while (true) {
            System.out.println("\n--- FASE 3 - BASE DE DATOS ---");
            System.out.println("a: Trabajar con Mamifero");
            System.out.println("b: Trabajar con Ave");
            System.out.println("c: Trabajar con Reptil");
            System.out.println("d: Salir");
            System.out.print("Seleccione una opcion: ");
            
            String opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "a":
                    mostrarSubMenuCRUD("Mamifero");
                    break;
                case "b":
                    mostrarSubMenuCRUD("Ave");
                    break;
                case "c":
                    mostrarSubMenuCRUD("Reptil");
                    break;
                case "d":
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

}
