/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ModuloFase2;

/**
 *
 * @author maxlo
 */

import com.mycompany.proyecto.Zoologico.Animal;
        

import com.mycompany.proyecto.Zoologico.Animal;
import java.util.Arrays;
import java.util.Comparator;
public class visualizar {
    
    
    public static void listaAnimales(Animal[] animales) {
        if (animales == null || animales.length == 0) {
            System.out.println("No hay animales para mostrar.");
            return;
        }

        // Ordena por ID
        Arrays.sort(animales, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                if (a1 == null && a2 == null) return 0;
                if (a1 == null) return 1;
                if (a2 == null) return -1;
                return Integer.compare(a1.getId(), a2.getId());
            }
        });

        System.out.println("\n--- Lista de Animales (ordenada por ID) ---");
        for (Animal animal : animales) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }
            

    
    
        }  
    

