/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author Damian Nogueira
 */

public class Conductor {
    
    private String nombre;
    private String licencia;

    // referencia para la relacion 1 a 1 con Vehiculo (bidireccional)
    /* package-private */ Vehiculo vehiculo; // ~ en UML

    // creo el conductor con sus datos
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }

    // devuelvo el vehiculo asociado (si tiene)
    public Vehiculo getVehiculo() { return vehiculo; }

    // relacion 1 a 1: sincronizo ambos lados
    public void setVehiculo(Vehiculo nuevo) {
        if (this.vehiculo == nuevo) return;
        Vehiculo anterior = this.vehiculo;
        this.vehiculo = nuevo;
        if (anterior != null && anterior.getConductor() == this) {
            anterior.setConductor(null);
        }
        if (nuevo != null && nuevo.getConductor() != this) {
            nuevo.setConductor(this);
        }
    }
}
