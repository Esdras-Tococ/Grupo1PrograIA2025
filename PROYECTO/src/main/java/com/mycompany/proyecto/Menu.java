

package com.mycompany.proyecto;

import com.mycompany.proyecto.ModuloFase2.BaseDeDatos;
import java.util.Scanner;
import com.mycompany.proyecto.Zoologico.MenuZoo;
import com.mycompany.proyecto.ModuloFase2.MenuFase2;
import com.mycompany.proyecto.ModuloFase2.BaseDeDatos;


public class Menu {
    public static void main(String[] args) {
          MenuZoo a = new MenuZoo();  
         Scanner scanner= new Scanner(System.in);
         boolean salir =true;
         int opcion;
         
            
        
        while (salir){  
            System.out.println("\nMenù:");
            System.out.println("Elige una opcion:");
            System.out.println("opcion 1.Zoologico:");
            System.out.println("opcion 2.REGISTRO DE ANIMALES");
            System.out.println("opcion 3.Base De Datos:");
            System.out.println("opcion 4.Salir: ");
            opcion =scanner.nextInt();
         
            
            try {
                
                 switch (opcion){
               
                case 1:
                    
                 a.zoo();
                    break;
                case 2:
                   MenuFase2.Menu2();
                    break;
                case 3:
                    BaseDeDatos.base();
                    break;    
                case 4:
                    System.out.println("!Hasta pronto! gracias por visitar el zoologico:");
                    return;
                default:
                    System.out.println("opcion invalidad seleccione una opcion del menu:");
                    break;
                 }
                
            } catch (Exception e) {
                System.out.println(e);
            }
           
        }
    }
    
   
        
    }
    

