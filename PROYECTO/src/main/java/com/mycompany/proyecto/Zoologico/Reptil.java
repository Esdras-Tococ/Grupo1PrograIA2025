
package com.mycompany.proyecto.Zoologico;

public class Reptil extends Animal{
      
    private String Tipo_Escamas;
    private boolean es_Venenoso;

    public Reptil(int id,String Tipo_Escamas, boolean es_Venenoso, String Nombre, double Peso, int Edad, double Altura, String Alias, double Consumo, String Dieta) {
        super(id,Nombre, Peso, Edad, Altura, Alias, Consumo, Dieta);
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
    return id+","+Nombre+", "+Peso+", "+Altura+" ,"+Edad+", "+Alias+","+Consumo+","+Dieta+","+Tipo_Escamas+", "+es_Venenoso ;
    }; 

    @Override
    public void Alimentar() {
       System.out.println("El "+getNombre()+" se alimenta de: " +Dieta);
    }
   
}
