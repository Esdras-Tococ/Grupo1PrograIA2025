package com.mycompany.proyecto.ModuloFase2;

import com.mycompany.proyecto.Zoologico.Animal;
import com.mycompany.proyecto.Zoologico.Mamifero;
import com.mycompany.proyecto.Zoologico.Reptil;
import com.mycompany.proyecto.Zoologico.Ave;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.mycompany.proyecto.Zoologico.Registros;
public class AñadirAnimal {
   Animal animal;
   Animal[] animales = new Animal[10];
   int index = 0;
   public static final Scanner sc = new Scanner(System.in);
   public Animal[] ListaAnimales(){
   return animales;
   }
   public void crearAnimal(){
   
   
   }
public void crearReptil() {
   
    if (!espacio()) {
        System.out.println("No se puede agregar más animales. El zoológico está lleno.");
        return;}
    
    int id;
    String nombre;
    double peso;
    double altura;
    int edad;
    double consumo;
    
    while (true) {
    try {
    System.out.println("Ingrese id:");
    id = Integer.parseInt(sc.next());
    
    if (BusquedaId(id)) {  
    System.out.println("Ese ID ya está en uso. Ingrese otro."); 
   
    }     
    else{
        break;
    
    }
 
    } catch (Exception e) {
        System.out.println("Ingrese un dato valido");
        }
        
        }
    System.out.println("Ingrese nombre:");
    nombre = sc.next();
 while (true) {  
        try {
    System.out.println("Ingrese peso:");
    peso = Double.parseDouble(sc.next());
    break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
 
  while (true) {  
        try {
    System.out.println("Ingrese edad:");
     edad = Integer.parseInt(sc.next());
  break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
  
  
    while (true) {  
        try {
    System.out.println("Ingrese altura:");
    altura = Double.parseDouble(sc.next());
  break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
    
    
    System.out.println("Ingrese alias:");
    String alias = sc.next();
 while (true) {  
        try {
    System.out.println("Ingrese consumo:");
     consumo = Double.parseDouble(sc.next());
 break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
 
 
    System.out.println("Ingrese dieta:");
    String dieta = sc.next();

    System.out.println("Ingrese el tipo de escamas:");
    String escamas = sc.next();

    boolean veneno = leerboolean(
            "¿Es venenoso? (si/no):");

    animal = new Reptil(id, escamas, veneno, nombre, peso, edad, altura, alias, consumo, dieta);
    
    animales[index++] = animal;
    }
public void crearAve() {
    
    if (!espacio()) {
        System.out.println("No se puede agregar más animales. El zoológico está lleno.");
        return;}
    
    
    int id;
    String nombre;
    double peso;
    double altura;
    int edad;
    double consumo;
    
  while (true) {
    try {
    System.out.println("Ingrese id:");
    id = Integer.parseInt(sc.next());
    
    if (BusquedaId(id)) {  
    System.out.println("Ese ID ya está en uso. Ingrese otro."); 
   
    }     
    else{
        break;
    
    }
 
    } catch (Exception e) {
        System.out.println("Ingrese un dato valido");
        }
        
        }
    System.out.println("Ingrese nombre:");
    nombre = sc.next();
 while (true) {  
        try {
    System.out.println("Ingrese peso:");
    peso = Double.parseDouble(sc.next());
    break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
 
  while (true) {  
        try {
    System.out.println("Ingrese edad:");
     edad = Integer.parseInt(sc.next());
  break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
  
  
    while (true) {  
        try {
    System.out.println("Ingrese altura:");
    altura = Double.parseDouble(sc.next());
  break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
    
    
    System.out.println("Ingrese alias:");
    String alias = sc.next();
 while (true) {  
        try {
    System.out.println("Ingrese consumo:");
     consumo = Double.parseDouble(sc.next());
 break;
    } catch (Exception e) {
    System.out.println("Ingrese un dato valido");
        }
    }
 
 
    System.out.println("Ingrese dieta:");
    String dieta = sc.next();
    
    System.out.println("Ingrese el tipo de Plumas:");
    String plumas = sc.next();

    boolean volador = leerboolean("¿puede volar (si/no):");

    animal = new Ave(id, volador,plumas, nombre, peso, edad, altura, alias, consumo, dieta);

    animales[index++] = animal;
    }

public void crearMamifero() {
    if (!espacio()) {
        System.out.println("No se puede agregar más animales. El zoológico está lleno.");
        return;
    }

    Scanner sc = new Scanner(System.in);

    int id;
    while (true) {
    System.out.println("Ingrese id:");
    id = Integer.parseInt(sc.next());

    if (BusquedaId(id)) {
        System.out.println("Ese ID ya está en uso. Ingrese otro.");
    } 
    else {
        
        break;
    }
}
    System.out.println("Ingrese nombre:");
    String nombre = sc.next();

    System.out.println("Ingrese peso:");
    double peso = Double.parseDouble(sc.next());

    System.out.println("Ingrese edad:");
    int edad = Integer.parseInt(sc.next());

    System.out.println("Ingrese altura:");
    double altura = Double.parseDouble(sc.next());

    System.out.println("Ingrese alias:");
    String alias = sc.next();

    System.out.println("Ingrese consumo:");
    double consumo = Double.parseDouble(sc.next());

    System.out.println("Ingrese dieta:");
    String dieta = sc.next();

    System.out.println("Ingrese la Especie:");
    String especie = sc.next();

    System.out.println("Ingrese el tipo de Pelaje:");
    String pelaje = sc.next();

    animal = new Mamifero(id, especie, pelaje, nombre, peso, edad, altura, alias, consumo, dieta);

    animales[index++] = animal;
    }


private boolean leerboolean(String mensaje) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje);
            String entrada = sc.next().toLowerCase();
            if (entrada.equals("si")) return true;
            if (entrada .equals("no")) return false;
            System.out.println("Por favor, ingrese 'si' o 'no'.");
        }
    }
public boolean espacio() {return index < animales.length;}
public void menuAgregar(String animal) {
   // Scanner sc = new Scanner(System.in);
    while (true) {
        if (!espacio()) {
            System.out.println("Ya no hay espacio para más animales.\n");
            break;
        }
        switch (animal.toLowerCase()) {
            case "reptil":
                crearReptil();
                break;
                case "mamifero":
                    crearMamifero();
                
                break;
                case "ave":
               crearAve();
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("Animal agregado correctamente.\n");
        System.out.printf("¿Deseas seguir agregando %s? (si/no):",animal);
   
        String respuesta = sc.next().toLowerCase();

        while (!respuesta.equals("si") && !respuesta.equals("no")) {
            System.out.println("Por favor, responde con 'si' o 'no':");
            respuesta = sc.next().toLowerCase();
        }

        if (respuesta.equals("no")) {
          
                 for (Animal animale : animales) {
                     if (animale!=null) {
                            Registros.save(animale.toString());
                     }
              
                
            
            }
           
              break;
          
        }
    }
}

public boolean BusquedaIdData(int id){
 try {
            BufferedReader lector = new BufferedReader(new FileReader("Data.txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
               String[] lista = linea.split(",");
               int DataId = Integer.parseInt(lista[0]);
                if (DataId==id) {
                   // System.out.println(DataId);
                   return true;
                }
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 return false;
 
}
public boolean BusquedaId(int id) {
    for (int i = 0; i < index; i++) {
        if (animales[i].getId() == id) {
            return true;
        }
    }
    return false;
    }
}
