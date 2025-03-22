    
package com.mycompany.proyecto;

import java.util.Scanner;
import com.mycompany.proyecto.Zoologico.MenuZoo;



public class Menu {
    public static void main(String[] args) {
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
            
            try {
                 switch (opcion){
               
                case 1:
                 MenuZoo a = new MenuZoo();       
                 a.zoo();
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
                
            } catch (Exception e) {
                System.err.println("ingrese una opcion valid:.");
                System.err.println("por fvor, selecione una opcion del menu:");
            }
           
        }
    }
    
   
        
    }
    

