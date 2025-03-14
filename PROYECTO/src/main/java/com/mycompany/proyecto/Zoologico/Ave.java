
package com.mycompany.proyecto.Zoologico;

public class Ave extends Animal{
    
    private boolean Puede_Volar;
    private String Plumas;

    public Ave(boolean Puede_Volar, String Plumas, String nombre, double Peso, int Edad, double Altura) {
        super(nombre, Peso, Edad, Altura);
        this.Puede_Volar = Puede_Volar;
        this.Plumas = Plumas;
    }

    public boolean isPuede_Volar() {
        return Puede_Volar;
    }

    public void setPuede_Volar(boolean Puede_Volar) {
        this.Puede_Volar = Puede_Volar;
    }

    public String getPlumas() {
        return Plumas;
    }

    public void setPlumas(String Plumas) {
        this.Plumas = Plumas;
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
    return Nombre+", "+Peso+", "+Altura+" ,"+Edad+", "+Puede_Volar+", "+Plumas ;
    };   
    
}

       
   