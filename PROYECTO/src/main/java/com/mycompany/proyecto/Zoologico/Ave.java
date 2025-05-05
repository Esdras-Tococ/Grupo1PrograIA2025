
package com.mycompany.proyecto.Zoologico;

public class Ave extends Animal{
    
    private boolean Puede_Volar;
    private String Plumas;

    public Ave(int id,boolean Puede_Volar, String Plumas, String Nombre, double Peso, int Edad, double Altura, String Alias, double Consumo, String Dieta) {
        super(id,Nombre, Peso, Edad, Altura, Alias, Consumo, Dieta);
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
    return id+","+Nombre+", "+Peso+", "+Altura+" ,"+Edad+","+Dieta+","+Consumo+","+Alias+","+Puede_Volar+", "+Plumas ;
    };  
    
    @Override
    public void Alimentar() {
       System.out.println("El/La "+getNombre()+" se alimenta de: " +Dieta);
    }
}

       
   