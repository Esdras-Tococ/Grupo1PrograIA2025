/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import com.mycompany.proyecto.Zoologico.Animal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jovany
 */
public class InsertarAnimal {
   
    
    public static void Insertar(String animal) {
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_PROYECTO_jar_1.0-SNAPSHOTPU");
        
        AnimalesC animales = new AnimalesC(emf);
        switch (animal.toLowerCase()) {
            
            case "mamifero":
                InsertaMamifero(emf, animales);
                break;
                case "ave":
                    InsertaAve(emf, animales);
                break;
                case "reptil":
                    InsertaReptil(emf, animales);
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
     
    public static boolean Respuestas (Scanner sc, String pregunta) {
    while (true) {
        System.out.print(pregunta + " (sí/no): ");
        String respuesta = sc.nextLine().trim().toLowerCase();
        if (respuesta.equals("sí") || respuesta.equals("si")) {
            return true;
        } else {
            System.out.println("Respuetas validas 'si' o 'no'.");
        }
    }
}
    
    public static void InsertaMamifero(EntityManagerFactory emf, AnimalesC animalc){
            
        
               Scanner sc = new Scanner(System.in);
        Animales animal1 = new Animales();
        Mamifero mamifero = new Mamifero();
       MamiferoC tableMamifero = new MamiferoC(emf);
       
    
                
        
        System.out.println("INGRESE EL NOMBRE");
        String nombre = sc.next();
       animal1.setNombre(nombre);
       
       
        System.out.println("INGRESE EL PESO");
       BigInteger peso = sc.nextBigInteger();
       animal1.setPeso(peso);
       
         System.out.println("INGRESE EL EDAD");
       Integer edad = sc.nextInt();
       animal1.setEdad(edad);
          System.out.println("INGRESE EL ALIAS");
       String  alias = sc.next();
       animal1.setAlias(alias);
       
        System.out.println("INGRESE EL CONSUMO");
        BigDecimal  consumo = sc.nextBigDecimal();
       animal1.setConsumo(consumo);
       
        System.out.println("INGRESE LA DIETA");
        String   dieta = sc.next();
       animal1.setDieta(dieta);
       
  System.out.println("INGRESE EL ALTURA");
        BigDecimal  altura = sc.nextBigDecimal();
       animal1.setAltura(altura);
       
          System.out.println("INGRESE LA CLASIFICACION");
        String   clasificacion = sc.next();
       animal1.setClasificacion(clasificacion);
       
       
          System.out.println("INGRESE TIPO DE PELAJE");
        String   pelaje = sc.next();
        mamifero.setPelaje(pelaje);
           System.out.println("INGRESE TIPO LA ESPECIE");
        String   especie= sc.next();
        mamifero.setEspecie(especie);
     
       
        try {

    animalc.create(animal1);
    
            System.out.println("se ingreso con exito");
        } catch (Exception e) {
            System.out.println("hubo un error");
        }
   try {
       Thread.sleep(900);
 
    mamifero.setIdAnimal(animal1.getId());
     Thread.sleep(900);
    tableMamifero.create(mamifero);
           
        } catch (Exception e) {
            System.out.println("hubo un error");
        }
           
    
    }


    public static void InsertaAve(EntityManagerFactory emf, AnimalesC animalc){
            
        
        Scanner sc = new Scanner(System.in);
        Animales animal1 = new Animales();
        Ave ave = new Ave();
       AveC tableAve = new AveC(emf);
       
     
        
        System.out.println("INGRESE EL NOMBRE");
        String nombre = sc.next();
       animal1.setNombre(nombre);
       
       
        System.out.println("INGRESE EL PESO");
       BigInteger peso = sc.nextBigInteger();
       animal1.setPeso(peso);
       
         System.out.println("INGRESE EL EDAD");
       Integer edad = sc.nextInt();
       animal1.setEdad(edad);
          System.out.println("INGRESE EL ALIAS");
       String  alias = sc.next();
       animal1.setAlias(alias);
       
        System.out.println("INGRESE EL CONSUMO");
        BigDecimal  consumo = sc.nextBigDecimal();
       animal1.setConsumo(consumo);
       
        System.out.println("INGRESE LA DIETA");
        String   dieta = sc.next();
       animal1.setDieta(dieta);
       
  System.out.println("INGRESE EL ALTURA");
        BigDecimal  altura = sc.nextBigDecimal();
       animal1.setAltura(altura);
       
          System.out.println("INGRESE LA CLASIFICACION");
        String   clasificacion = sc.next();
       animal1.setClasificacion(clasificacion);
       
       
        boolean volador = Respuestas(sc, "¿PUEDE VOLAR:?");
        ave.setVolador(volador);


        System.out.println("TIPO DE PLUMAS:");
        String tipoPlumas = sc.next();
        ave.setTipoPlumas(tipoPlumas);
 
        try {
        animalc.create(animal1);
        System.out.println("Se ingreso con exito.");
    } catch (Exception e) {
        System.out.println("Hubo un error: " + e.getMessage());
    }

    try {
        ave.setIdAnimal(animal1.getId());
        tableAve.create(ave);
        System.out.println("Ave ingresada con éxito.");
    } catch (Exception e) {
        System.out.println("Error al ingresar ave: " + e.getMessage());
    }
        

    
        }
    
public static void InsertaReptil(EntityManagerFactory emf, AnimalesC animalc){
            
        
        Scanner sc = new Scanner(System.in);
        Animales animal1 = new Animales();
        Reptil reptil = new Reptil();
       ReptilC tableReptil = new ReptilC(emf);
           
        
        System.out.println("INGRESE EL NOMBRE");
        String nombre = sc.next();
       animal1.setNombre(nombre);
       
       
        System.out.println("INGRESE EL PESO");
       BigInteger peso = sc.nextBigInteger();
       animal1.setPeso(peso);
       
         System.out.println("INGRESE EL EDAD");
       Integer edad = sc.nextInt();
       animal1.setEdad(edad);
          System.out.println("INGRESE EL ALIAS");
       String  alias = sc.next();
       animal1.setAlias(alias);
       
        System.out.println("INGRESE EL CONSUMO");
        BigDecimal  consumo = sc.nextBigDecimal();
       animal1.setConsumo(consumo);
       
        System.out.println("INGRESE LA DIETA");
        String   dieta = sc.next();
       animal1.setDieta(dieta);
       
  System.out.println("INGRESE EL ALTURA");
        BigDecimal  altura = sc.nextBigDecimal();
       animal1.setAltura(altura);
       
          System.out.println("INGRESE LA CLASIFICACION");
        String   clasificacion = sc.next();
       animal1.setClasificacion(clasificacion);
       

        System.out.println("TIPO DE ESCAMAS:");
    String tipoEscamas = sc.next();
    reptil.setTipoEscamas(tipoEscamas);

    boolean venenoso = Respuestas(sc, "¿ES VENENOSO?");
        reptil.setVenenoso(venenoso);
       
        try {
        animalc.create(animal1);
        System.out.println("Se ingreso con exito.");
    } catch (Exception e) {
        System.out.println("Hubo un error: " + e.getMessage());
    }

    try {
        reptil.setIdAnimal(animal1.getId());
        tableReptil.create(reptil);
        System.out.println("Ave ingresada con éxito.");
    } catch (Exception e) {
        System.out.println("Error al ingresar ave: " + e.getMessage());
    }
        
    
     
    
        }
}
