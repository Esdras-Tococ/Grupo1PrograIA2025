
package com.mycompany.proyecto.Zoologico.MenuFase2;

import com.mycompany.proyecto.Zoologico.Animal;
import java.util.Scanner;
import com.mycompany.proyecto.Zoologico.MenuZoo;
public class AñadirAnimal {
    Scanner sc = new Scanner(System.in);
    MenuZoo menu = new MenuZoo();
    
    
    public static void main(String[] args) {
        
        MenuZoo.registrarAnimales();
        
    }
    
    
    
    public void Reptil(){
    
    
        System.out.println("Ingrese el ID");
        int id = Integer.parseInt( sc.next());
        System.out.println("Ingrese Nombre");
        String nombre = sc.next();
        System.out.println("");
    
    
    
    
    
    }
    
    
}
