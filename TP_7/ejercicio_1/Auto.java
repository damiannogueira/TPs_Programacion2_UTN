/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// TP 7 Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

package ejercicio_1;

public class Auto extends Vehiculo {
    // Atributo que solo aplica a los autos.
    private int cantidadPuertas;

    // Constructor: uso super(...) para inicializar la parte de Vehiculo.
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() { return cantidadPuertas; }

    // Sobrescribo mostrarInfo() para que muestre también las puertas.
    // Ejemplo de polimorfismo por sobreescritura.
    @Override
    public String mostrarInfo() {
        return "Auto - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Puertas: " + cantidadPuertas;
    }
}

