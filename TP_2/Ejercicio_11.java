/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_2;

import java.util.Scanner;

/**
 *
 * @author Damian Nogueira
 */
public class Ejercicio_11 {

    // Variable global (constante) con el valor del descuento
    final static double DESCUENTOESPECIAL = 0.10;

    // Método que calcula y muestra el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el monto del descuento
        double descuentoAplicado = precio * DESCUENTOESPECIAL;

        // Calcular precio final
        double precioFinal = precio - descuentoAplicado;

        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());

        // Llamar al método
        calcularDescuentoEspecial(precio);

        input.close();
    }
}
