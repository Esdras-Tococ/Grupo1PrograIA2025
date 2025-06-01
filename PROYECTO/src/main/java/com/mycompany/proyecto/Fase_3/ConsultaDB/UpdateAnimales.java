/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jovany
 */
public class UpdateAnimales {
    
 
    
    public static void updates(String animal) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_PROYECTO_jar_1.0-SNAPSHOTPU");
    AnimalesC animales = new AnimalesC(emf);
      

        
        switch (animal.toLowerCase()) {
            case "mamifero":
                updateMamifero(animales, emf);
                break;
                case "ave":
                    updateAve(animales, emf);
                
                break;
                case "reptil":
                    updateReptil(animales, emf);
                
                break;
            default:
                throw new AssertionError();
        }
  
  
    
    }
    
    
    
    public static void updateMamifero(AnimalesC animales, EntityManagerFactory emf){
             Scanner sc = new Scanner(System.in);
        MamiferoC mamifero = new MamiferoC(emf);
       
        while (true) {                      
                      
             try {
                
            
     
        System.out.println("INGRESE EL ID DEL REGISTRO A MODIFICAR / 0 para salir");
        Integer id= sc.nextInt();
            if (id==0) {
                return;
            }
        
        Animales animal = animales.findAnimales(id);
        Mamifero mamifero1 =  mamifero.findMamifero(id);
                  if (mamifero1==null) {
                      System.out.println("NO existe el registro");
                      continue;
                  }
               
        System.out.println("Es correcto el registro: SI.. para continuar NO.. para ingresar nuevo id");
           System.out.println("============================================================================================");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s  %-10s  %-10s%n", "ID","NOMBRE","PESO","EDAD","ALTURA","PELAJE", "ESPECIE");
                     
          System.out.printf("%-5s %-10s  %-10s  %-10s  %-10s %-10s  %-10s%n", animal.getId(),animal.getNombre(),animal.getPeso()+"kg",animal.getEdad()+"anos",animal.getAltura()+"cm" ,mamifero1.getPelaje(),mamifero1.getEspecie() );
        
        String respuesta = sc.next();
        if (respuesta.toLowerCase().equals("si")) {
            System.out.println("Que campo desea cambiar");
             String user = sc.next();
            switch (user.toLowerCase()) {
                case "nombre":
                     System.out.println("Ingrese nuevo Nombre");
                    String nombre = sc.next();
                    animal.setNombre(nombre);
                    break;
                    case "peso":
                    System.out.println("INgrese el peso");
                    BigInteger peso = sc.nextBigInteger();
                    animal.setPeso(peso);
                    break;
                    case "edad":
                    System.out.println("ingrese edad");
                    Integer edad = sc.nextInt();
                    animal.setEdad(edad);
                    break;
                    case "alias":
                     System.out.println("ingrese alias");
                    String alias = sc.next();
                    animal.setAlias(alias);
                    break;
                    case "consumo":
                     System.out.println("ingrese consumo");
                      BigDecimal consumo = sc.nextBigDecimal();
                      animal.setConsumo(consumo);
                    break;
                    case "dieta":
                     System.out.println("ingrese dieta");
                    String dieta= sc.next();
                    animal.setDieta(dieta);
                    break;
                    case "altura":
                      System.out.println("ingrese altura");
                      BigDecimal altura = sc.nextBigDecimal();
                      animal.setAltura(altura);
                    break;
                    case "pelaje":
                    System.out.println("ingrese pelaje");
                    String pelaje= sc.next();
                    mamifero1.setPelaje(pelaje);
                    break;
                    case "especie":
                      System.out.println("ingrese especie");
                    String especie= sc.next();
                    mamifero1.setEspecie(especie);
                    break;
                default:
                    throw new AssertionError();
            }
            
    
  
            
                mamifero.edit(mamifero1);
                animales.edit(animal);
                  System.out.println(" Registro Exitoso!!!!!");
                  
                  System.out.println("x para salir v para seguir modificando");
                  String mod = sc.next();
        
                  if (mod.equals("x")) {
                return;
            }
        
        }//if si
        else{
        
        continue;}
        
        
        
        } catch (Exception e) {
                 System.out.println("HUbo un erro");
        return;}
        
        
                  }//while
        
             
    

    
    }




    public static void updateReptil(AnimalesC animales, EntityManagerFactory emf){
             Scanner sc = new Scanner(System.in);
        ReptilC Reptil = new ReptilC(emf);
        try {
            
        
            
        
        while (true) {                      
                      
                  
        System.out.println("INGRESE EL ID DEL REGISTRO A MODIFICAR / 0 para salir");
        Integer id= sc.nextInt();
            if (id==0) {
                return;
            }
        
        Animales animal = animales.findAnimales(id);
        Reptil reptil1 =  Reptil.findReptil(id);
                  if (reptil1==null) {
                      System.out.println("NO existe el registro");
                      continue;
                  }
               
        System.out.println("Es correcto el registro: SI para continuar no para ingresar nuevo id");
                     System.out.println("============================================================================================");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s %-10s  %-10s%n", "ID","NOMBRE","PESO","EDAD","ALTURA","TIPO ESCAMAS","VENENOSO");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s %-10s  %-10s%n", animal.getId(),animal.getNombre(),animal.getPeso()+"kg",animal.getEdad()+"anos",animal.getAltura()+"cm" ,reptil1.getTipoEscamas(),reptil1.getVenenoso());
        
        String respuesta = sc.next();
        if (respuesta.toLowerCase().equals("si")) {
            System.out.println("Que campo desea cambiar");
             String user = sc.next();
            switch (user.toLowerCase()) {
                case "nombre":
                     System.out.println("Ingrese nuevo Nombre");
                    String nombre = sc.next();
                    animal.setNombre(nombre);
                    break;
                    case "peso":
                    System.out.println("INgrese el peso");
                    BigInteger peso = sc.nextBigInteger();
                    animal.setPeso(peso);
                    break;
                    case "edad":
                    System.out.println("ingrese edad");
                    Integer edad = sc.nextInt();
                    animal.setEdad(edad);
                    break;
                    case "alias":
                     System.out.println("ingrese alias");
                    String alias = sc.next();
                    animal.setAlias(alias);
                    break;
                    case "consumo":
                     System.out.println("ingrese consumo");
                      BigDecimal consumo = sc.nextBigDecimal();
                      animal.setConsumo(consumo);
                    break;
                    case "dieta":
                     System.out.println("ingrese dieta");
                    String dieta= sc.next();
                    animal.setDieta(dieta);
                    break;
                    case "altura":
                      System.out.println("ingrese altura");
                      BigDecimal altura = sc.nextBigDecimal();
                      animal.setAltura(altura);
                    break;
                    case "escamas":
                    System.out.println("ingrese escamas");
                    String escamas= sc.next();
                    reptil1.setTipoEscamas(escamas);
                    break;
                    case "venenoso":
                      System.out.println("Es venenoso si/no");
                       String venenoso= sc.next();
                        if (venenoso.toLowerCase().equals("si")) {
                             reptil1.setVenenoso(true); 
                        }
                        else{
                          reptil1.setVenenoso(false);
                        }
                   
                  
                    break;
                default:
                    throw new AssertionError();
            }
            
    
  
            
                Reptil.edit(reptil1);
                animales.edit(animal);
                  System.out.println(" Registro Exitoso!!!!!");
                  
                  System.out.println("x para salir v para seguir modificando");
                  String mod = sc.next();
        
                  if (mod.equals("x")) {
                return;
            }
        
        }//if si
        else{
        
        continue;}
        
        
        
        
        
        
                  }//while
        
             } catch (Exception e) {
                 System.out.println("Hubo un error");
        }
    

    
    }





public static void updateAve(AnimalesC animales, EntityManagerFactory emf){
             Scanner sc = new Scanner(System.in);
        AveC Ave = new AveC(emf);
       try {
        
   
        while (true) {                      
                      
                  
        System.out.println("INGRESE EL ID DEL REGISTRO A MODIFICAR / 0 para salir");
        Integer id= sc.nextInt();
            if (id==0) {
                return;
            }
        
        Animales animal = animales.findAnimales(id);
        Ave ave1 =  Ave.findAve(id);
                  if (ave1==null) {
                      System.out.println("NO existe el registro");
                      continue;
                  }
               
        System.out.println("Es correcto el registro: SI para continuar no para ingresar nuevo id");
                 System.out.println("============================================================================================");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s  %-10s  %-10s%n", "ID","NOMBRE","PESO","EDAD","ALTURA","PLUMAS","VOLADOR");
       System.out.printf("%-5s %-10s  %-10s  %-10s  %-10s %-10s  %-10s%n", animal.getId(),animal.getNombre(),animal.getPeso()+"kg",animal.getEdad()+"anos",animal.getAltura()+"cm" ,ave1.getTipoPlumas(),ave1.getVolador() );
        
        String respuesta = sc.next();
        if (respuesta.toLowerCase().equals("si")) {
            System.out.println("Que campo desea cambiar");
             String user = sc.next();
            switch (user.toLowerCase()) {
                case "nombre":
                     System.out.println("Ingrese nuevo Nombre");
                    String nombre = sc.next();
                    animal.setNombre(nombre);
                    break;
                    case "peso":
                    System.out.println("INgrese el peso");
                    BigInteger peso = sc.nextBigInteger();
                    animal.setPeso(peso);
                    break;
                    case "edad":
                    System.out.println("ingrese edad");
                    Integer edad = sc.nextInt();
                    animal.setEdad(edad);
                    break;
                    case "alias":
                     System.out.println("ingrese alias");
                    String alias = sc.next();
                    animal.setAlias(alias);
                    break;
                    case "consumo":
                     System.out.println("ingrese consumo");
                      BigDecimal consumo = sc.nextBigDecimal();
                      animal.setConsumo(consumo);
                    break;
                    case "dieta":
                     System.out.println("ingrese dieta");
                    String dieta= sc.next();
                    animal.setDieta(dieta);
                    break;
                    case "altura":
                      System.out.println("ingrese altura");
                      BigDecimal altura = sc.nextBigDecimal();
                      animal.setAltura(altura);
                    break;
                    case "plumas":
                    System.out.println("ingrese tipo de plumas");
                    String plumass= sc.next();
                    ave1.setTipoPlumas(plumass);
                    break;
                    case "venenoso":
                      System.out.println("Es volador si/no");
                       String venenoso= sc.next();
                        if (venenoso.toLowerCase().equals("si")) {
                             ave1.setVolador(true); 
                        }
                        else{
                          ave1.setVolador(false);
                        }
                   
                  
                    break;
                default:
                    throw new AssertionError();
            }
            
    
  
            
                Ave.edit(ave1);
                animales.edit(animal);
                  System.out.println(" Registro Exitoso!!!!!");
                  
                  System.out.println("x para salir v para seguir modificando");
                  String mod = sc.next();
        
                  if (mod.equals("x")) {
                return;
            }
        
        }//if si
        else{
        
        continue;}
                  }//while
        
              } catch (Exception e) {
                  System.out.println("HUbo un error");
    }
    

    
    }







}
