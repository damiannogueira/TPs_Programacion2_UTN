/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author Damian Nogueira
 */

public class Banco {
    
    private String nombre;
    private String cuit;

    // creo el banco con sus datos
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getCuit()   { return cuit; }
}
