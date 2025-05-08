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
        
public class visualizar {
    
    public void listaAnimales(Animal [] animales){
      Arrays.sort(animales, new Comparator<Animal>() {
                
                public int compare(Animal a1, Animal a2) {
                    if (a1 == null && a2 == null) return 0;
                    if (a1 == null) return 1;
                    if (a2 == null) return -1;
                    return Integer.compare(a1.getId(), a2.getId());
                }
            });
      
            return;
            
        }  
    }

