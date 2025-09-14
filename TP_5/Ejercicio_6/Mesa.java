/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author Damian Nogueira
 */

public class Mesa {
    
    private int numero;
    private int capacidad;

    // creo la mesa con su numero y capacidad
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // getters simples
    public int getNumero()    { return numero; }
    public int getCapacidad() { return capacidad; }
}

