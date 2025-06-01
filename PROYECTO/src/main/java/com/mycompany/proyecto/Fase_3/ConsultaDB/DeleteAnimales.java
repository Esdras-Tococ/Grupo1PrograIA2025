
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jovany
 */
public class DeleteAnimales {
       
    
    
    public static void delete(String animal) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_PROYECTO_jar_1.0-SNAPSHOTPU");
    AnimalesC animales = new AnimalesC(emf);
        switch (animal.toLowerCase()) {
            case "mamifero":
                  deleteMamifero(animales, emf);
    
                break;
                case "ave":
                    deleteReptil(animales, emf);
                break;
                case "reptil":
                    deleteAve(animales, emf);
                break;
            default:
                throw new AssertionError();
        }
      
    
    
    
        
    }
    
 
    
    public static void deleteMamifero(AnimalesC animales, EntityManagerFactory emf){
             Scanner sc = new Scanner(System.in);
        MamiferoC mamifero = new MamiferoC(emf);
        while (true) {            
            
        
         
             Integer id;     
            
        System.out.println("Ingrese el ID del registro a eliminar/ x para salir");
           try {
        String idus = sc.next();
       
            if (idus.equals("x")) {
             return;
            }
            else{
             id= Integer.parseInt(idus);
            
            }
 } catch (Exception e) {
               System.out.println("Hubo un error");
               continue;
            }
           
            
        Animales ani = animales.findAnimales(id);
        if (ani==null) {
            System.out.println("No existe el registro");
            continue;
        }
            System.out.println("Seguro que desea eliminar el regsitro:");
            
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "ID", "NOMBRE","PESO","ALTURA","CONSUMO","CLASIFICAION");
                 System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",ani.getId(),ani.getNombre(),ani.getPeso(),ani.getAltura(),ani.getConsumo(),ani.getClasificacion());
                 
                 
                 
                 String  user = sc.next();
                 if (user.toLowerCase().equals("si")) {
                
            
        try {
         animales.destroy(id);
        mamifero.destroy(id);
            System.out.println("Eliminafo con exito!!!!");
        } catch (Exception e) {
            
        }
        }
                 else{
                 continue;
                 
                 }
                 
                 
                 
                 
        }//while
        
    
    
    
    }
    
    
    
    
    
    
    
      public static void deleteReptil(AnimalesC animales, EntityManagerFactory emf){
             Scanner sc = new Scanner(System.in);
        ReptilC reptil = new ReptilC(emf);
        while (true) {            
            
        
         
             Integer id;     
            
        System.out.println("Ingrese el ID del registro a eliminar/ x para salir");
           try {
        String idus = sc.next();
       
            if (idus.equals("x")) {
             return;
            }
            else{
             id= Integer.parseInt(idus);
            
            }
 } catch (Exception e) {
               System.out.println("Hubo un error");
               continue;
            }
           
            
        Animales ani = animales.findAnimales(id);
        if (ani==null) {
            System.out.println("No existe el registro");
            continue;
        }
            System.out.println("Seguro que desea eliminar el regsitro:");
            
     System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "ID", "NOMBRE","PESO","ALTURA","CONSUMO","CLASIFICAION");
               System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",ani.getId(),ani.getNombre(),ani.getPeso(),ani.getAltura(),ani.getConsumo(),ani.getClasificacion());
                 
                 
                 
                 String  user = sc.next();
                 if (user.toLowerCase().equals("si")) {
                
            
        try {
         animales.destroy(id);
        reptil.destroy(id);
            System.out.println("Eliminafo con exito!!!!");
        } catch (Exception e) {
            
        }
        }
                 else{
                 continue;
                 
                 }
                 
                 
                 
                 
        }//while
        
    
    
    
    }


  public static void deleteAve(AnimalesC animales, EntityManagerFactory emf){
             Scanner sc = new Scanner(System.in);
        AveC ave = new AveC(emf);
        while (true) {            
            
        
         
             Integer id;     
            
        System.out.println("Ingrese el ID del registro a eliminar/ x para salir");
           try {
        String idus = sc.next();
       
            if (idus.equals("x")) {
             return;
            }
            else{
             id= Integer.parseInt(idus);
            
            }
 } catch (Exception e) {
               System.out.println("Hubo un error");
               continue;
            }
           
            
        Animales ani = animales.findAnimales(id);
        if (ani==null) {
            System.out.println("No existe el registro");
            continue;
        }
            System.out.println("Seguro que desea eliminar el regsitro:");
            System.out.println("================================================================================");
             System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "|ID", "NOMBRE","PESO","ALTURA","CONSUMO","CLASIFICAION|");
               System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",ani.getId(),ani.getNombre(),ani.getPeso(),ani.getAltura(),ani.getConsumo(),ani.getClasificacion());
                 
                 
                 
                 String  user = sc.next();
                 if (user.toLowerCase().equals("si")) {
                
            
        try {
         animales.destroy(id);
        ave.destroy(id);
            System.out.println("Eliminafo con exito!!!!");
        } catch (Exception e) {
            
        }
        }
                 else{
                 continue;
                 
                 }
                 
                 
                 
                 
        }//while
        
    
    
    
    }
}
