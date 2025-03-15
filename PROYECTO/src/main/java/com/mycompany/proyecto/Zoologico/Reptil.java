
package com.mycompany.proyecto.Zoologico;

public class Reptil extends Animal{
      
    private String Tipo_Escamas;
    private boolean es_Venenoso;

    public Reptil(String Tipo_Escamas, boolean es_Venenoso, String nombre, double Peso, int Edad, double Altura, String Alias) {
        super(nombre, Peso, Edad, Altura, Alias);
        this.Tipo_Escamas = Tipo_Escamas;
        this.es_Venenoso = es_Venenoso;
    }

    public String getTipo_Escamas() {
        return Tipo_Escamas;
    }

    public void setTipo_Escamas(String Tipo_Escamas) {
        this.Tipo_Escamas = Tipo_Escamas;
    }

    public boolean isEs_Venenoso() {
        return es_Venenoso;
    }

    public void setEs_Venenoso(boolean es_Venenoso) {
        this.es_Venenoso = es_Venenoso;
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

  @Override
    public String toString(){
    return Nombre+", "+Peso+", "+Altura+" ,"+Edad+", "+Tipo_Escamas+", "+es_Venenoso ;
    }; 
    
}
