package com.mycompany.proyecto;

import com.mycompany.proyecto.Zoologico.Animal;
import com.mycompany.proyecto.Zoologico.Mamifero;
import com.mycompany.proyecto.Zoologico.Reptil;
import com.mycompany.proyecto.Zoologico.Ave;
import java.util.Scanner;

public class AñadirAnimal {
    Animal animal;
    Animal[] animales = new Animal[2];
    int index = 0;


public void crearReptil() {
    if (!espacio()) {
        System.out.println("No se puede agregar más animales. El zoológico está lleno.");
        return;
    }

    Scanner sc = new Scanner(System.in);

    int id;
    while (true) {
    System.out.println("Ingrese id:");
    id = Integer.parseInt(sc.next());

    if (BusquedaId(id)) {
        System.out.println("Ese ID ya está en uso. Ingrese otro.");
    } 
    else {
        
        break;
    }
}


    System.out.println("Ingrese nombre:");
    String nombre = sc.next();

    System.out.println("Ingrese peso:");
    double peso = Double.parseDouble(sc.next());

    System.out.println("Ingrese edad:");
    int edad = Integer.parseInt(sc.next());

    System.out.println("Ingrese altura:");
    double altura = Double.parseDouble(sc.next());

    System.out.println("Ingrese alias:");
    String alias = sc.next();

    System.out.println("Ingrese consumo:");
    double consumo = Double.parseDouble(sc.next());

    System.out.println("Ingrese dieta:");
    String dieta = sc.next();

    System.out.println("Ingrese el tipo de escamas:");
    String escamas = sc.next();

    boolean veneno = leerVeneno("¿Es venenoso? (si/no):");

    animal = new Reptil(id, escamas, veneno, nombre, peso, edad, altura, alias, consumo, dieta);

    animales[index++] = animal;
    }

private boolean leerVeneno(String mensaje) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje);
            String entrada = sc.next().toLowerCase();
            if (entrada.equals("si")) return true;
            if (entrada.equals("no")) return false;
            System.out.println("Por favor, ingrese 'si' o 'no'.");
        }
    }
public boolean espacio() {return index < animales.length;}
public void menuAgregarReptiles() {
    Scanner sc = new Scanner(System.in);
    while (true) {
        if (!espacio()) {
            System.out.println("Ya no hay espacio para más animales.\n");
            break;
        }

        crearReptil();
        System.out.println("Animal agregado correctamente.\n");
        System.out.println("¿Deseas seguir agregando reptiles? (si/no):");
        String respuesta = sc.next().toLowerCase();

        while (!respuesta.equals("si") && !respuesta.equals("no")) {
            System.out.println("Por favor, responde con 'si' o 'no':");
            respuesta = sc.next().toLowerCase();
        }

        if (respuesta.equals("no")) {
            break;
        }
    }
}




public void crearMamifero() {
    if (!espacio()) {
        System.out.println("No se puede agregar más animales. El zoológico está lleno.");
        return;
    }

    Scanner sc = new Scanner(System.in);

    int id;
    while (true) {
    System.out.println("Ingrese id:");
    id = Integer.parseInt(sc.next());

    if (BusquedaId(id)) {
        System.out.println("Ese ID ya está en uso. Ingrese otro.");
    } 
    else {
        
        break;
    }
}


    System.out.println("Ingrese nombre:");
    String nombre = sc.next();

    System.out.println("Ingrese peso:");
    double peso = Double.parseDouble(sc.next());

    System.out.println("Ingrese edad:");
    int edad = Integer.parseInt(sc.next());

    System.out.println("Ingrese altura:");
    double altura = Double.parseDouble(sc.next());

    System.out.println("Ingrese alias:");
    String alias = sc.next();

    System.out.println("Ingrese consumo:");
    double consumo = Double.parseDouble(sc.next());

    System.out.println("Ingrese dieta:");
    String dieta = sc.next();

    System.out.println("Ingrese la Especie:");
    String especie = sc.next();

    System.out.println("Ingrese el tipo de Pelaje:");
    String pelaje = sc.next();

    animal = new Mamifero(id, especie, pelaje, nombre, peso, edad, altura, alias, consumo, dieta);

    animales[index++] = animal;
    }

public void menuAgregarMamiferos() {
    Scanner sc = new Scanner(System.in);
    while (true) {
        if (!espacio()) {
            System.out.println("Ya no hay espacio para más animales.\n");
            break;
        }

        crearMamifero();
        System.out.println("Animal agregado correctamente.\n");
        System.out.println("¿Deseas seguir agregando mamiferos? (si/no):");
        String respuesta = sc.next().toLowerCase();

        while (!respuesta.equals("si") && !respuesta.equals("no")) {
            System.out.println("Por favor, responde con 'si' o 'no':");
            respuesta = sc.next().toLowerCase();
        }

        if (respuesta.equals("no")) {
            break;
        }
    }
}
public boolean BusquedaId(int id) {
    for (int i = 0; i < index; i++) {
        if (animales[i].getId() == id) {
            return true;
        }
    }
    return false;
}
}
