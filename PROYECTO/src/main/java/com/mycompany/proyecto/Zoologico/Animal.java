
package com.mycompany.proyecto.Zoologico;


public class Animal {
   protected  int id;
   protected String Nombre;
   protected double Peso;
   protected int Edad;
   protected double Altura;
   protected String Alias;
   protected double Consumo;
   protected String Dieta;

    public Animal(int id,String Nombre, double Peso, int Edad, double Altura, String Alias, double Consumo, String Dieta) {
        this.id = id;
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Edad = Edad;
        this.Altura = Altura;
        this.Alias = Alias;
        this.Consumo = Consumo;
        this.Dieta = Dieta;
    
    }   

    public String getNombre() {
        return Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public double getAltura() {
        return Altura;
    }

    public String getAlias() {
        return Alias;
    }

    public double getConsumo() {
        return Consumo;
    }

    public String getDieta() {
        return Dieta;
    }
   public void Alimentar(){
       System.out.println("Se Alimenta el");
   } 
   public int getId() {
    return this.id;
}

}
