/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author Damian Nogueira
 */

public class Motor {
    
    private String tipo;
    private String numeroSerie;

    // creo el motor con su tipo y numero de serie
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // getters simples
    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }
}

