/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jayron
 */
public class animalPrincipal {
     private String nombre;
   private String especie;
   private double alimentacion;
   private int edad;

  public animalPrincipal(String nombre, String especie,double alimantacion, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.alimentacion=alimantacion; 
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setaalimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }
        public double getalimentacion() {
        return alimentacion;
        }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

