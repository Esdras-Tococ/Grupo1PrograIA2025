
package com.mycompany.proyecto.Zoologico;


public class Animal {
   protected String Nombre;
   protected double Peso;
   protected int Edad;
   protected double Altura;
   protected String Alias;
   protected double Consumo;
   protected String Dieta;

    public Animal(String Nombre, double Peso, int Edad, double Altura, String Alias, double Consumo, String Dieta) {
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Edad = Edad;
        this.Altura = Altura;
        this.Alias = Alias;
        this.Consumo = Consumo;
        this.Dieta = Dieta;
    
    }   
   public void Alimentar(){
       System.out.println("Se Alimenta el");
   } 
}
