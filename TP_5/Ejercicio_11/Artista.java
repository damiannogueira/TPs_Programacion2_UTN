/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author Damian Nogueira
 */

public class Artista {
    
    private String nombre;
    private String genero;

    // constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
}
