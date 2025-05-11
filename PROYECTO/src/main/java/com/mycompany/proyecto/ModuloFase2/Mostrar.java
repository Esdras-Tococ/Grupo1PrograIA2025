/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ModuloFase2;

import com.mycompany.proyecto.Zoologico.Animal;

/**
 *
 * @author jayron
 */
public class Mostrar {
   
    public static void uno() {
        
    }
    public static void imprimir  (Animal[] animales, int ListaAnimales){
        int contador =0;
         System.out.println("\n================================ LISTA DE ANIMALES ========================================");
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "ID", "NOMBRE","ALIAS","EDAD","PESO","ALTURA","CONSUMO","DIETA");
        System.out.println("--------------------------------------------------------------------------------------------");

        
       
        
         
         if (ListaAnimales<0) {
            System.out.println("No hay animales en la lista.");
        } else {
             for (Animal animal : animales) {
                 
                 
             
                if (animal != null) {
                         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s \n",animal.getId(),animal.getNombre(),animal.getAlias(),animal.getEdad(),animal.getPeso(),animal.getAltura(),animal.getConsumo(),animal.getDieta());
                }
            }
        }
         
          System.out.println("===========================================================================================\n");  
    }
    
    
}

