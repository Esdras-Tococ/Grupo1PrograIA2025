
package com.mycompany.proyecto.Fase2;
import java.util.Scanner;
import  com.mycompany.proyecto.Zoologico.MenuZoo;


public class Menu2 {
    public static void main(String[] args) {
          MenuZoo a = new MenuZoo();  
         Scanner scanner= new Scanner(System.in);
         boolean salir =true;
         int opcion;
         
            
        
        while (salir){  
            System.out.println("\nMenu:");
            System.out.println("Elige una opcion:");
            System.out.println("Opcion 1: Agregar Mamifero");
            System.out.println("Opcion 2: Agregar Ave");
            System.out.println("Opcion 3: Agregar Reptil");
            System.out.println("Opcion 4: Ordenar Arreglo");
            System.out.println("Opcion 5: Mostrar Arreglo");
            System.out.println("Opcion 6: Salir");

            opcion =scanner.nextInt();
         
            
            try {
                
                 switch (opcion){
               
                case 1:
                        System.out.println("Agregar Mamifero:");
                    break;
                case 2:
                        System.out.println("Agregaar Ave:");
                    break;
                case 3:
                        System.out.println("Agregar Reptil");
                    break;    
                 case 4:
                        System.out.println("Ordenar Arreglo");
                    break;
                    case 5:
                        System.out.println("Mostrar Arreglo");
                            break;
                    case 6:
                        System.out.println("Saliendo de Menu");
                            return;
                default:
                    System.out.println("opcion invalidad seleccione una opcion del menu:");
                    break;
                 }
                
            } catch (Exception e) {
                System.err.println("ingrese una opcion validad:.");
                System.err.println("Seleccione una opcion:");
            }
           
        }
    }

    
    
    
    
   
}
