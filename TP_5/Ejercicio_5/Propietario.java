/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author Damian Nogueira
 */

public class Propietario {
    
    private String nombre;
    private String dni;

    // referencia para la relacion 1 a 1 con Computadora (bidireccional)
    /* package-private */ Computadora computadora; // ~ en UML

    // creo el propietario con sus datos
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    // devuelvo la computadora asociada (si tiene)
    public Computadora getComputadora() { return computadora; }

    // relacion 1 a 1: sincronizo ambos lados
    public void setComputadora(Computadora nueva) {
        if (this.computadora == nueva) return;
        Computadora anterior = this.computadora;
        this.computadora = nueva;
        if (anterior != null && anterior.getPropietario() == this) {
            anterior.setPropietario(null);
        }
        if (nueva != null && nueva.getPropietario() != this) {
            nueva.setPropietario(this);
        }
    }
}
