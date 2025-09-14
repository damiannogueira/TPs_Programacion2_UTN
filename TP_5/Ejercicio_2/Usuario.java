/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Damian Nogueira
 */
public class Usuario {
    private String nombre;
    private String dni;
    Celular celular; // atributo para la relación con Celular (visibilidad de paquete ~ en UML)

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }

    // Asociación 1–1 bidireccional 
    public void setCelular(Celular nuevo) {
        if (this.celular == nuevo) return;
        Celular anterior = this.celular;
        this.celular = nuevo;
        if (anterior != null && anterior.getUsuario() == this) {
            anterior.setUsuario(null);
        }
        if (nuevo != null && nuevo.getUsuario() != this) {
            nuevo.setUsuario(this);
        }
    }
}

