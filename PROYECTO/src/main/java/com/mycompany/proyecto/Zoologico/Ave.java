
package com.mycompany.proyecto;

public class Ave {
    
    private String movilidad;
    private String plumas;
    private String reproduccion;
    private String alimentacion;

    public Ave(String movilidad, String plumas, String reproduccion, String alimentacion) {
        this.movilidad = movilidad;
        this.plumas = plumas;
        this.reproduccion = reproduccion;
        this.alimentacion = alimentacion;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getPlumas() {
        return plumas;
    }

    public void setPlumas(String plumas) {
        this.plumas = plumas;
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
