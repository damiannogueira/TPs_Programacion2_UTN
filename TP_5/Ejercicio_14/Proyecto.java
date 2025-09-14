/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14;

/**
 *
 * @author Damian Nogueira
 */

public class Proyecto {
    
    private String nombre;
    private int duracionMin;

    // constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public int getDuracionMin() { return duracionMin; }
}

