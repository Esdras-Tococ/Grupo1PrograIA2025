
package com.mycompany.proyecto.Zoologico;

public class Calculadora {
    
    
    public static double Consumo(int Dias, double Cantidad){
        if (Dias ==0) {
            return 0;
            
        }
    return Cantidad + Consumo(Dias -1, Cantidad);
    }
}
