
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Consultas {
    
  
   
    public static  void consultar(String animal) {
  EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_PROYECTO_jar_1.0-SNAPSHOTPU");
    AnimalesC animales = new AnimalesC(emf);
        switch (animal) {
            case "reptil":
              
                    ReptilC reptil =new ReptilC(emf);
                  consultarReptil(animales, reptil);
                
                break;
                case "ave":
                        AveC aves = new AveC(emf);
                        consultarAve(animales, aves);
                
                break;
                case "mamifero":
                      MamiferoC mamifero = new MamiferoC(emf);
                      consultarMamifero(animales, mamifero);
                
                break;
            default:
                throw new AssertionError();
        }




       
    
    
    
}

public static void consultarAve(AnimalesC animales,AveC aves){
      try {
 ArrayList<Animales>lista = animales.findAnimalesEntities();
  List<Ave> listaA = aves.findAveEntities();
 
          System.out.println("============================================================================================");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s  %-10s  %-10s%n", "ID","NOMBRE","PESO","EDAD","ALTURA","PLUMAS","VOLADOR");
            for (Animales animales1 : lista) {
              if ("aves".equalsIgnoreCase(animales1.getClasificacion())) {
                    
               Integer id = animales1.getId();
               Ave ave = aves.findAve(id);
                if (ave==null) {
                      return;
                  }
           
               
            System.out.printf("%-5s %-10s  %-10s  %-10s  %-10s %-10s  %-10s%n", animales1.getId(),animales1.getNombre(),animales1.getPeso()+"kg",animales1.getEdad()+" años",animales1.getAltura()+"cm" ,ave.getTipoPlumas(),ave.getVolador() );
           
                
                
                
                 
                }
            
            }
           
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
    }




public static void consultarReptil(AnimalesC animales,ReptilC reptil){
      try {
          ArrayList<Animales>lista = animales.findAnimalesEntities();
           System.out.println("============================================================================================");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s %-10s  %-10s%n", "ID","NOMBRE","PESO","EDAD","ALTURA","TIPO ESCAMAS","VENENOSO");
            for (Animales animales1 : lista) {
              if ("reptil".equalsIgnoreCase(animales1.getClasificacion())) {
                    
               Integer id = animales1.getId();
               Reptil reptil1 = reptil.findReptil(id);
                if (reptil1==null) {
                      return;
                  }
           
               
          System.out.printf("%-5s %-10s  %-10s  %-10s %-10s %-10s  %-10s%n", animales1.getId(),animales1.getNombre(),animales1.getPeso()+"kg",animales1.getEdad()+" años",animales1.getAltura()+"cm" ,reptil1.getTipoEscamas(),reptil1.getVenenoso());
           
                
                
                
                 
                }
            
            }
           
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
    }











public static void consultarMamifero(AnimalesC animales,MamiferoC mamifero){
      try {
  ArrayList<Animales>lista = animales.findAnimalesEntities();
   System.out.println("============================================================================================");
  System.out.printf("%-5s %-10s  %-10s  %-10s %-10s  %-10s  %-10s%n", "ID","NOMBRE","PESO","EDAD","ALTURA","PELAJE", "ESPECIE");
            for (Animales animales1 : lista) {
              if ("mamifero".equalsIgnoreCase(animales1.getClasificacion())) {
                    
               Integer id = animales1.getId();
               
               Mamifero mamifero1 = mamifero.findMamifero(id);
                  if (mamifero1==null) {
                      return;
                  }
           
               
          System.out.printf("%-5s %-10s  %-10s  %-10s  %-10s %-10s  %-10s%n", animales1.getId(),animales1.getNombre(),animales1.getPeso()+"kg",animales1.getEdad()+" años",animales1.getAltura()+"cm" ,mamifero1.getPelaje(),mamifero1.getEspecie() );
           
                
                
                
                 
                }
            
            }
           
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
    }
}


