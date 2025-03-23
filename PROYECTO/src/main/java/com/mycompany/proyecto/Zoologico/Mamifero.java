
package com.mycompany.proyecto.Zoologico;

public class Mamifero extends Animal{
  
    
    
    private String Especie;
    private String Tipo_Pelaje;

    

  public Mamifero(String Nombre, int Peso , int Altura, int Edad, String Alias, String Especie, String Tipo_pelaje, double Consumo){
       
        super(Nombre, Peso, Altura,Edad, Alias, Consumo);
        

        this.Especie=Especie;
        this.Tipo_Pelaje =Tipo_pelaje;
        
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
    
   
    @Override
    public String toString(){
    return Nombre+", "+Peso+", "+Altura+" ,"+Edad+","+Alias+","+","+Consumo+"," +Especie+Tipo_Pelaje;
    };
  
}
