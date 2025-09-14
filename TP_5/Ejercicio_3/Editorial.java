/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Damian Nogueira
 */

public class Editorial {
   
    private String nombre;
    private String direccion;

    // constructor para crear la editorial con sus datos
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
}
