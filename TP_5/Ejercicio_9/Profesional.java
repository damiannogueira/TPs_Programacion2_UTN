/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author Damian Nogueira
 */

public class Profesional {
    
    private String nombre;
    private String especialidad;

    // creo el profesional con sus datos
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // getters simples
    public String getNombre()        { return nombre; }
    public String getEspecialidad()  { return especialidad; }
}

