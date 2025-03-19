
package com.mycompany.proyecto.Zoologico;


import java.util.Scanner;




public class MenuZoo {
  
    public  void zoo() {
    Scanner scanner =new  Scanner(System.in);
         boolean salir =true;
         int opcion;
         while (salir){
            System.out.println("=== Menú Zoo ===");
            System.out.println("1. Registrar nuevo animal");
            System.out.println("2. Listar todos los animales");
            System.out.println("3. Alimentar a los animales");
            System.out.println("4. Calcular el alimento consumido en un periodo de días");
            System.out.println("5. Guardar datos en archivo CSV");
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
                    //alimentarAnimales(scanner);
                    break;
                case 4:
                    MenuCalculadora();
                    break;
                case 5:
                  Registros b = new Registros();       
                 b.Export();
                 
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
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo (mamífero, ave, reptil): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese el tipo de dieta (herbívoro, carnívoro, omnívoro): ");
        String dieta = scanner.nextLine();
        System.out.print("Ingrese la cantidad de alimento por día en kg: ");
        double cantidadAlimento = scanner.nextDouble();
        scanner.nextLine();
        
    
        
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
                
                    System.out.println("No existe el animal\n");
                }
      
                
            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");
            }
            
        }
    }
}
