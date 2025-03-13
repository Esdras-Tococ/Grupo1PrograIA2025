
package com.mycompany.proyecto.Zoologico;

public class Mamifero {
  
  private String patas;
  private String tipos;
  private String reproduccion;
  private String alimentacion;

  public Mamifero(String patas, String tipos, String reproduccion, String alimentacion) {
        this.patas = patas;
        this.tipos = tipos;
        this.reproduccion = reproduccion;
        this.alimentacion = alimentacion;
    }

    public String getPatas() {
        return patas;
    }

    public void setPatas(String patas) {
        this.patas = patas;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
  
  
  
}
