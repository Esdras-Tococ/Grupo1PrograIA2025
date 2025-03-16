
package com.mycompany.proyecto.Zoologico;

import java.util.Scanner;
import java.util.function.Consumer;





public class MenuZoologico {

    private static Iterable<Animal> animales;
    
    
    
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); // Inicializamos el scanner
        Zoologico zoologico = new Zoologico();
        
        MenuZoologico(zoologico, scanner);
    }
        int opcion =0;
        public static void MenuZoologico(Zoologico zoologico, Scanner scanner){
        while (true){
            System.out.println("\nMenu del Zoologico:");
            System.out.println("1. Agregar nuevo animal:");
            System.out.println("2. ver todos los animales: ");
            System.out.println("3. exportar datos a CSV:");
            System.out.println("4. volver al menu principal :");
            System.out.println("Elige una opcion :");
            int opcionZoo= scanner.nextInt();
            scanner.nextLine();
            
            switch (opcionZoo){
                case 1:
                    agregarAnimal(zoologico,scanner);
                    break;
                case 2:
                    Zoologico.verAnimales();
                    
                    break;
                case 3:
                    Zoologico.exportarCSV();
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
       public static void agregarAnimal(Zoologico zoologico, Scanner scanner) {
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de especie (mamífero, ave, reptil): ");
        String especie = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el tipo de alimento (carne, frutas, insectos): ");
        String tipoAlimento = scanner.nextLine();
        System.out.print("Ingrese la cantidad diaria de alimento: ");
        int cantidadDiaria = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        Animal animal = null;
        if (especie.equals("mamífero")) {
            animal = new Mamifero(nombre, tipoAlimento, cantidadDiaria);
        } else if (especie.equals("ave")) {
            animal = new Ave(nombre, tipoAlimento, cantidadDiaria);
        } else if (especie.equals("reptil")) {
            animal = new Reptil(nombre, tipoAlimento, cantidadDiaria);
        } else {
            System.out.println("Especie no válida.");
            return;
        }

       
        for (Animal a : animales) {
            if (a.getClass() == animal.getClass()) {
                System.out.println("Ya hay un animal de esta especie.");
                return;
            }
        }

        animales.forEach((Consumer<? super Animal>) animal);
        System.out.println("Animal agregado exitosamente.");
    }


    
    
   
    public static void MenuCalculadora() {
       boolean entry = true;
        while(entry){
            try {
        System.out.println("CALCULADOR DE CONSUMO DE ALIMENTO\n");
        System.out.println("INGRESE EL ANIMAL ,ALIAS O ID\n");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
       int  cantidad = Calculadora.Consulta(animal);
                if (cantidad!=0) {
        System.out.println("INGRESE LOS DIAS DE CONSUMO O A CONSUMIR\n");
        int dias = sc.nextInt();
       System.out.println("El consumo Total de Comida del "+animal+" es de: " + Calculadora.Consumo(cantidad, dias)+"kg\n");
            System.out.println("PULSE 0 PARA FINALIZAR O 1 PARA CONTINUAR");
        int user = sc.nextInt();
            if (user ==0) {
                entry = false;
            }
                    
                }
                else{
                
                    System.out.println("No existe el animal\n");
                }
      
                
            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");
            }
        
        }
      
        
    }
    
    
  
    
}
