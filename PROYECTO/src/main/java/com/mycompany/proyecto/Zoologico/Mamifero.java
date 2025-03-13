
package com.mycompany.proyecto.Zoologico;

public class Mamifero extends Animal{
  
    
    
    private String Especie;
    private String Tipo_Pelaje;
    private String Alimentacion;
    

  public Mamifero(String Nombre, int Peso , int Altura, int Edad, String Especie, String Tipo_pelaje, String Alimentacion){
       
        super(Nombre, Peso, Altura,Edad);
        
        this.Alimentacion=Alimentacion;
        this.Especie=Especie;
        this.Tipo_Pelaje =Tipo_pelaje;
        
    }
    
   
    @Override
    public String toString(){
    return Nombre+", "+Peso+", "+Altura+" ,"+Edad+", "+Especie+Tipo_Pelaje+", "+Alimentacion ;
    };
    
  
  
  
}
