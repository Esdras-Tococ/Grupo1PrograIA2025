
package com.mycompany.proyecto.Zoologico;

public class Calculo_de_Alimentos {
    
    
    public static double Calculadora_Alimento(int Dias, double Cantidad){
    
        if (Dias ==0) {
            return 0;
            
        }
    
    
    
    return Cantidad + Calculadora_Alimento(Dias -1, Cantidad);
    }
}
