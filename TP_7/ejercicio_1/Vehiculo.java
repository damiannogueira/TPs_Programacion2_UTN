/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// TP 7 Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

package ejercicio_1;

public class Vehiculo {
    // Atributos básicos que comparten todos los vehículos.
    // Uso private para respetar encapsulamiento.
    private String marca;
    private String modelo;

    // Constructor para obligar a inicializar marca y modelo al crear el objeto.
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters para acceder a los atributos desde afuera sin exponerlos directamente.
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    // Método que muestra la info del vehículo.
    // Más adelante será sobrescrito en Auto para agregar datos propios.
    public String mostrarInfo() {
        return "Vehiculo - Marca: " + marca + ", Modelo: " + modelo;
    }
}

