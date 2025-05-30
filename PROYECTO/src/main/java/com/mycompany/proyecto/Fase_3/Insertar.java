/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3;


import static com.mycompany.proyecto.Fase_3.Menu_3.scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author esdra
 */

public class Insertar {

    
    static final String DB_URL = "jdbc:postgresql://localhost:5432/zoologico"; 
    static final String USER = "postgres";
    static final String PASS = "tu_contraseña"; 

    static Scanner scanner = new Scanner(System.in);

    
    public static void insertarAnimal(String tabla) {
        System.out.println("Insertar nuevo " + tabla + ":");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Especie: ");
        String especie = scanner.nextLine();

        String sql = "INSERT INTO " + tabla + " (nombre, edad, especie) VALUES (?, ?, ?)";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nombre);
            stmt.setInt(2, edad);
            stmt.setString(3, especie);

            stmt.executeUpdate();
            System.out.println("Animal insertado correctamente.");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

}



  