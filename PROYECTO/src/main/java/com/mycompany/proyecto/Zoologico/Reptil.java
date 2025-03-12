
package com.mycompany.proyecto;

public class Reptil {
    
    private String escamas;
    private String sangre;
    private String reproduccion;
    private String alimentacion;

    public Reptil(String escamas, String sangre, String reproduccion, String alimentacion) {
        this.escamas = escamas;
        this.sangre = sangre;
        this.reproduccion = reproduccion;
        this.alimentacion = alimentacion;
    }

    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
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
