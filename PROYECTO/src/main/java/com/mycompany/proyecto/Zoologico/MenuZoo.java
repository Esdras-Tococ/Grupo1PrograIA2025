
package com.mycompany.proyecto.Zoologico;


import java.util.Scanner;




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
                    //listarAnimales();
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
     
        }
      
   
    public static void MenuCalculadora() {
       boolean entry = true;
        while(entry){
            try {
        System.out.println("CALCULADOR DE CONSUMO DE ALIMENTO\n");
        System.out.println("INGRESE EL ANIMAL  ALIAS\n");
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
                
                    System.out.println("No existe el animal\n:");
                }
      
                
            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");
            }
            
        }
    }
}
