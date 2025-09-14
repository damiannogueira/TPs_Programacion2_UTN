/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author Damian Nogueira
 */

public class Contribuyente {
    
    private String nombre;
    private String cuil;

    // creo el contribuyente con sus datos
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getCuil()   { return cuil; }
}
