
package com.mycompany.proyecto;
import com.mycompany.proyecto.Zoologico.Animal;
import com.mycompany.proyecto.Zoologico.Exportar;
import com.mycompany.proyecto.Zoologico.Mamifero;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        Zoologico zoo= new Zoologico();
        
        
        while (true){
            System.out.println("\nMenù:");
            System.out.println("Elige una opcion:");
            System.out.println("1.Zoologico:");
            System.out.println("2. Fase II:");
            System.out.println("3.Fase III:");
            System.out.println("4. Salir: ");
            int opcion =scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    motraMenuZoologico(Zoologico, scanner);
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
    private static void MostrarMenuZoologico(Zoologico zoologico, Scanner scanner ){
        while (true){
            System.out.println("\nMenu del Zoologico:");
            System.out.println("1. Agregar nuevo animal:");
            System.out.println("2. ver todos los animales: ");
            System.out.println("3. exportar datos a CSV:");
            System.out.println("4. volver al menu principal :");
            System.out.println("Elige una opcion :");
            int opcionZoologico= scanner.nextInt();
            scanner.nextLine();
            
            switch (opcionZoologico){
                case 1:
                    agregarNuevoAnimal(zoologico,scanner);
                    break;
                case 2:
                    zoologico.verAnimales();
                    
                    break;
                case 3:
                    zoologico.exportarCSV();
                    break;
                case 4:
                   //VOLVER AL MENU PRINCIPAl
                    return;
                default:
                    System.out.println("opicion invalida ");
                    break;    
            }
        }
        
    }

    private static void agregarNuevoAnimal(Zoologico zoologico, Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private static void agregarNuevoAnimal() {
        System.out.println("Seleccione el tipo de animal:");
        System.out.println("1. Mamífero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad del animal: ");
        int edad = scanner.nextInt();
        System.out.print("Consumo diario de alimento (en kg): ");
        double consumo = scanner.nextDouble();
        scanner.nextLine();

        Animal animal = null;
        switch (tipo) {
            case 1:
                animal = new Mamifero(nombre, edad, consumo);
                break;
            case 2:
                animal = new Ave(nombre, edad, consumo);
                break;
            case 3:
                animal = new Reptil(nombre, edad, consumo);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        zoologico.agregarAnimal(animal);
    }

    private static class zoologico {

        public zoologico() {
        }
    }

   
}
