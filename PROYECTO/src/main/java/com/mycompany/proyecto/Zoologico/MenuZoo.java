
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
            System.out.println("3. Calcular el alimento consumido en un periodo de días");
            System.out.println("4. Guardar datos en archivo CSV");
            System.out.println("5. Salir");
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
                  //CrearArchivo b = new CrearArchivo();       
                   // b.hashCode();
                 
                    break;
                case 5:
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
        try {
             System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        
        System.out.println("ingrese el peso :");
        double peso= scanner.nextInt();
        
        System.out.print("Ingrese el alisas: ");
        String alias = scanner.nextLine();
        
        System.out.print("Ingrese la edad : ");
        int edad = scanner.nextInt();
        
        System.out.println("ingrese la alturra:");
        double altura = scanner.nextInt();
            
        } catch (Exception e) {
            System.out.println("ingrese un dato valido : ");
        }
       
        try {
          //  animal nuevoAnimal = new animal(nombre, peso,alias, edad,altura );
        //animal.add(nuevoAnimal);

        System.out.println("¡Animal agregado exitosamente!");
       
            
        } catch (Exception e) {
            System.out.println("animal no pudo agregare:");
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
                
                    System.out.println("No existe el animal\n");
                }
      
                
            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");
            }
            
        }
    }
}
