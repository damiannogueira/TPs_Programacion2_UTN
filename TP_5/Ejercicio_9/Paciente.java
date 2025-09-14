/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author Damian Nogueira
 */

public class Paciente {
    
    private String nombre;
    private String obraSocial;

    // creo el paciente con sus datos
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // getters simples
    public String getNombre()     { return nombre; }
    public String getObraSocial() { return obraSocial; }
}

