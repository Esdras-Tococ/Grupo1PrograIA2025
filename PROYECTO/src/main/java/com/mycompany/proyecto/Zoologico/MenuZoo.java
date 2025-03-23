
package com.mycompany.proyecto.Zoologico;


import java.util.Scanner;
import java.util.ArrayList;



public class MenuZoo {
  Scanner scanner =new  Scanner(System.in);
    public  void zoo() {
    
         boolean salir =true;
         int opcion;
         while (salir){
            System.out.println("=== Menú Zoo ===");
            System.out.println("1. Registrar nuevo animal");
            System.out.println("2. Listar todos los animales");
            System.out.println("3. Calcular el alimento consumido en un periodo de días");
            System.out.println("4. Guardar datos en archivo CSV");
             System.out.println("5. alimentar a los animales:");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
            
                    
               registrarAnimales();

                    break;
                case 2:
                
                    break;
                case 3:
                    MenuCalculadora();
                    break;
                case 4:
                   
                System.out.println("Ingrese nombre para exportar el archivio\n");
                String nombre = scanner.next();
                   
                Registros.Export(nombre);
    
                    break;
                case 5:
                    System.out.println("Alimentar a los animales :");
                    String animal = scanner.next(); 
                    Animal Leon = new Mamifero("Carnivoro", "Grueso", "Leon", 15, 5, 6, "MAX", 20, "Carne");
                    Animal Paloma = new Ave(salir, "Largas", "Paloma", 5, 2, 1, "Grid", 1, "Semillas");
                            
                            Leon.Alimentar();
                            Paloma.Alimentar();
                    
                    break;
                case 6:
                    System.out.println("Hasta pronto    ");
                    System.out.println("regresando al menu principal");
                    return;

                default:
                    System.out.println("Opción inválida. ingrese una opcion del menu.");
                    break;
            }
        
            }
         
        scanner.close();
    }   
    
    public  void registrarAnimales() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Registrar una nuevo animal:");
        
          String nombre = "";
        while (nombre.trim().isEmpty()) {
            System.out.print("Ingrese el nombre del animal: ");
            nombre = scanner.nextLine();
            if (nombre.trim().isEmpty()) {
                System.out.println("El nombre no puede estar vacío. Intente de nuevo.");
            }
        }
        double peso = -1;
        while (peso <= 0) {
            System.out.print("Ingrese el peso del animal: ");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                if (peso <= 0) {
                    System.out.println("El peso debe ser un número positivo. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor ingrese un número válido para el peso.");
                scanner.next();
            }
        }
           String alias = "";
        while (alias.trim().isEmpty()) {
            scanner.nextLine();
            System.out.print("Ingrese el alias del animal: ");
            alias = scanner.nextLine();
            if (alias.trim().isEmpty()) {
                System.out.println("El alias no puede estar vacío. Intente de nuevo.");
            }
        }
          int edad = -1;
        while (edad <= 0) {
            System.out.print("Ingrese la edad del animal: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad <= 0) {
                    System.out.println("La edad debe ser un número entero positivo. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor ingrese un número válido para la edad.");
                scanner.next();
            }
        }
            double altura = -1;
        while (altura <= 0) {
            System.out.print("Ingrese la altura del animal: ");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                if (altura <= 0) {
                    System.out.println("La altura debe ser un número positivo. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor ingrese un número válido para la altura.");
                
            }
        }
        
        System.out.println("ingrese el consumo de alimento");
        double consumo = scanner.nextInt();
        System.out.println("ingrese la dieta");
        String dieta = scanner.next();
        
   
     
        
        
        System.out.println("Ingrese el tipo de animal: mamifero, ave , reptil\n");
        String tipo = scanner.next();
        Animal animal = null;
        switch (tipo.toLowerCase()) {
            case "mamifero":
                System.out.println("ingrese la especie");
                String especie = scanner.next();
                System.out.println("ingrese el pelaje");
                String pelaje = scanner.next();
               animal = new Mamifero(especie, pelaje,nombre, peso, edad, altura, alias,consumo, dieta);
                Registros.save(animal.toString());
                break;
                case "reptil":
                    System.out.println("ingrese el tipo de escamas");
                    String escamas = scanner.next();
                    System.out.println("si es venenoso ingrese 1 y 0 si no lo es:");
                    int opcion = scanner.nextInt();
                    boolean venenoso =true;
                    
                    if (opcion==1) {
                        venenoso = true;
                        
                        
                    }
                    
                    else if (opcion ==0) {
                        venenoso = false;
                    }
                    
                    animal = new Reptil(escamas, venenoso, nombre, peso, edad, altura, alias, consumo,dieta);
                  Registros.save(animal.toString());
                break;
                
                case"ave" :
                     System.out.println("si puede volar ingrese 1 y 0 si no:");
                    int opcion2 = scanner.nextInt();
                    boolean volador =true;
                    
                    if (opcion2==1) {
                        volador= true;
                        
                        
                    }
                    
                    else if (opcion2 ==0) {
                        volador = false;
                    }
                    System.out.println("ingrese el tipo de plumas");
                    String plumas = scanner.next();
                    
                animal = new Ave(volador, plumas,nombre, peso, edad, altura, alias, consumo,dieta);
                  Registros.save(animal.toString());
                break;
            default:
                throw new AssertionError();
        }
        
        
        
        
        
        
        
        
      
    }
      
   
    public static void MenuCalculadora() {
       boolean entry = true;
        while(entry){
            try {
        System.out.println("CALCULADOR DE CONSUMO DE ALIMENTO\n");
        System.out.println("INGRESE EL ANIMAL  ALIAS\n");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
       double  cantidad = Calculadora.Consulta(animal);
                //System.out.println(cantidad);
       
       if (cantidad!=0) {
        System.out.println("INGRESE LOS DIAS DE CONSUMO O A CONSUMIR\n");
        int dias = sc.nextInt();
       System.out.println("El consumo Total de Comida del "+animal+" es de: " + Calculadora.Consumo(dias, cantidad)+"kg\n");
            System.out.println("PULSE 0 PARA FINALIZAR O 1 PARA CONTINUAR");
        int user = sc.nextInt();
            if (user ==0) {
                entry = false;
            }
                    
                }
       
        else{
                
                    System.out.println("No existe el animal\n:");
                    System.out.println("Presione 0 para finalizar o 1 para continuar");
                    int user = sc.nextInt();
                    if (user == 0) {
                        
               entry= false;
           }
         }
      
                
            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");
            }
            
        }
    }
}
