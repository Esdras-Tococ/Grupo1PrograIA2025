/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ModuloFase2;

import static com.mycompany.proyecto.ModuloFase2.AñadirAnimal.sc;
import java.util.Scanner;


/**
 *
 * @author jayron
 */
public class BaseDeDatos {
        public static void base() {
            Scanner sc =new  Scanner (System.in);
        
        
        int opcion=0;
        
            {
        
             System.out.println("===== MENU BASE DE DATOS  =====");
            System.out.println("1: Trabaja con Mamifero:");
            System.out.println("2: Trabaja con Ave:");
            System.out.println("3: Trabaja con Reptil:");
            System.out.println("4: Regresar al Menu Principal:");
            
            String user = sc.next();
                try {
                     opcion = Integer.parseInt(user);
                } catch (Exception e) {
                     System.out.println("Opcion invalida ");
               
                }
            try {
                
                switch (opcion=0) {
                    case 1:
                        System.out.println("en poceso");
                        
                        break;
                        
                    case 2:
                        System.out.println("en poceso");
                        
                        break;
                        
                    case 3:
                        System.out.println("en poceso");
                        
                        break;
                        
                    case 4:
                        System.out.println("NOS VEMOS GRCIAS POR TU TIEMPO;");
                        
                        break;
                    default:
                         System.out.println("Opcion Invalida ,Ingrese Un Dato correcto:");
                }
            } catch (Exception e) {
            
            }
            
}
        
        }
    }
    
    

