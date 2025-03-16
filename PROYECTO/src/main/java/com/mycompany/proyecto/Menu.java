
package com.mycompany.proyecto;

import java.util.Scanner;
import com.ejemplo.menuZoologico.menuZoologico;



public class Menu {
    public static void main(String[] args) {
         Zoologico zoologico = new Zoologico();
         Scanner scanner= new Scanner(System.in);
         boolean salir =true;
         int opcion;
         
            
        
        while (salir){  
            System.out.println("\nMenù:");
            System.out.println("Elige una opcion:");
            System.out.println("opcion 1.Zoologico:");
            System.out.println("opcion 2.Fase II:");
            System.out.println("opcion 3.Fase III:");
            System.out.println("opcion 4.Salir: ");
            opcion =scanner.nextInt();
            scanner.nextLine();
            
            
            switch (opcion){
                case 1:
                     System.out.println("zoologico"); 
                    break;
                case 2:
                    System.out.println("Fase II ");
                    break;
                case 3:
                    System.out.println("Fase III");
                    break;    
                case 4:
                    System.out.println("!Hasta proto! gracias por visitar el zoologico:");
                    return;
                default:
                    System.out.println("opcion invalidad seleccione una opcion del menu:");
                    break;
            }
           
        }
    }

   
        
    }
    

