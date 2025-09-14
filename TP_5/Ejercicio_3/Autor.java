/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Damian Nogueira
 */

public class Autor {
    
    private String nombre;
    private String nacionalidad;

    // constructor para crear un autor con sus datos
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
}

