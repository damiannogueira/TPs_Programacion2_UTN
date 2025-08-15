/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_2;

import java.util.Scanner;

/**
 *
 * @author Damián Nogueira
 */
public class Ejercicio_8 {

    // Método que calcula el precio final con impuesto y descuento
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertir porcentajes a decimales y aplicar fórmula
        double precioFinal = precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leer datos desde el usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());

        // Calcular el precio final usando el método (llamada)
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar el resultado
        System.out.println("El precio final del producto es: $" + precioFinal);

        input.close();
    }
}
