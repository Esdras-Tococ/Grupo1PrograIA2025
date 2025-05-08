
package com.mycompany.proyecto.ModuloFase2;

import static com.mycompany.proyecto.ModuloFase2.AñadirAnimal.sc;


public class MenuFase2 {
    
    
    public static void Menu2() {
     AñadirAnimal AddAnimal = new AñadirAnimal();
     
     
     int opcion =0;

        do {
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
                    System.out.println("en proceso..........");
                
                    break;
                case 5:
                  System.out.println("en proceso..........");
                    break;
                case 6:
                    
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 6);
    
     
     
     
     
    }
}
