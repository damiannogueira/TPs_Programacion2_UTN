/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author Damian Nogueira
 */

public class Calculadora {
    // dependencia de uso: solo usa el impuesto, no lo guarda
    public void calcular(Impuesto impuesto) {
        // ejemplo simple de uso
        System.out.println("Calculando impuesto sobre monto: " + impuesto.getMonto());
    }
}

