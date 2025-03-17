
package com.mycompany.proyecto.Zoologico;

import java.util.Scanner;


public class MenuZoo {
    
    
    
    
   
  
        
    
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
