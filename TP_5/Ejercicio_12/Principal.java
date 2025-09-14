/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author Damian Nogueira
 */

public class Principal {
    public static void main(String[] args) {
        Contribuyente c1 = new Contribuyente("Damian Nogueira", "20-12345678-4");
        Impuesto imp1 = new Impuesto(150000.0);
        imp1.setContribuyente(c1);      // asociacion unidireccional Impuesto -> Contribuyente

        Calculadora calc = new Calculadora();
        calc.calcular(imp1);            // dependencia de uso (solo lo pasa por parametro)
    }
}
