
package com.mycompany.proyecto.ModuloFase2;

import static com.mycompany.proyecto.ModuloFase2.AñadirAnimal.sc;
import com.mycompany.proyecto.ModuloFase2.Mostrar;


public class MenuFase2 {
    
    
    public static void Menu2() {
     AñadirAnimal AddAnimal = new AñadirAnimal();
     
    
     int opcion =0;

        while (true) {
        {
            System.out.println("===== MENU DE ANIMALES =====");
            System.out.println("1: Agregar Mamifero");
            System.out.println("2: Agregar Ave");
            System.out.println("3: Agregar Reptil");
            System.out.println("4: Ordenar Arreglo");
            System.out.println("5: Mostrar Arreglo");
            System.out.println("6: Salir");
           
            String user = sc.next();
            try {
                opcion = Integer.parseInt(user);
                
            } catch (Exception e) {
                System.out.println("Opcion invalida ");
                break;
            }
            try {
                
           
            switch (opcion) {
                case 1:
                        AddAnimal.menuAgregar("Mamifero");
                    break;
                case 2:
                     AddAnimal.menuAgregar("Ave");
                    break;
                case 3:
                    AddAnimal.menuAgregar("Reptil");
                    break;
                case 4:
                   visualizar.listaAnimales(AddAnimal.ListaAnimales());
                
                    break;
                case 5:
                      Mostrar.imprimir(AddAnimal.ListaAnimales(), opcion);
                  
                    break;
                case 6:
                    System.out.println("NOS VEMOS,  GRCIAS POR TU TIEMPO;");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
            
            
             } catch (Exception e) {
            }
        }
            
        }
 
    
     
     
     
     
    }
}
