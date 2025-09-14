/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author Damian Nogueira
 */

public class Vehiculo {
    
    private String patente;
    private String modelo;

    // relaciones
    private Motor motor;        // Agregacion: Vehiculo -> Motor
    private Conductor conductor; // Asociacion bidireccional 1 a 1

    // creo el vehiculo con sus datos
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    // getters basicos
    public String getPatente() { return patente; }
    public String getModelo()  { return modelo; }

    // relacion: agregacion con Motor (reemplazable)
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    // relacion: asociacion bidireccional con Conductor
    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor nuevo) {
        if (this.conductor == nuevo) return;
        Conductor anterior = this.conductor;
        this.conductor = nuevo;
        if (anterior != null && anterior.getVehiculo() == this) {
            anterior.setVehiculo(null);
        }
        if (nuevo != null && nuevo.getVehiculo() != this) {
            nuevo.setVehiculo(this);
        }
    }
}

