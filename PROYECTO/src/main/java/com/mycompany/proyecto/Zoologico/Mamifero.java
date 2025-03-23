
package com.mycompany.proyecto.Zoologico;

public class Mamifero extends Animal{
  
    
    
    private String Especie;
    private String Tipo_Pelaje;

    public Mamifero(String Especie, String Tipo_Pelaje, String Nombre, double Peso, int Edad, double Altura, String Alias, double Consumo, String Dieta) {
        super(Nombre, Peso, Edad, Altura, Alias, Consumo, Dieta);
        this.Especie = Especie;
        this.Tipo_Pelaje = Tipo_Pelaje;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getTipo_Pelaje() {
        return Tipo_Pelaje;
    }

    public void setTipo_Pelaje(String Tipo_Pelaje) {
        this.Tipo_Pelaje = Tipo_Pelaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double Consumo) {
        this.Consumo = Consumo;
    }

    public String getDieta() {
        return Dieta;
    }

    public void setDieta(String Dieta) {
        this.Dieta = Dieta;
    }

   
   
    @Override
    public String toString(){
    return Nombre+", "+Peso+", "+Altura+" ,"+Edad+","+Alias+","+Consumo+","+Dieta+","+Especie+","+Tipo_Pelaje;
    };

    @Override
    public void Alimentar() {
       System.out.println("Se alimenta de:"+getNombre()+Dieta);
    }
  
}
