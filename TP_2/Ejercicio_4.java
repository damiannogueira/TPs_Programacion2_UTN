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
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leer precio como String y permitir coma o punto
        System.out.print("Ingrese el precio del producto: ");
        String precioStr = input.nextLine().trim().replace(',', '.');
        double precio = Double.parseDouble(precioStr); // Asumo entrada válida

        if (precio <= 0) {
            System.out.println("El precio debe ser mayor a 0.");
            input.close();
            return;
        }

        // Leer categoría como String y pasar a mayúsculas
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = input.nextLine().trim().toUpperCase();

        double descuento = 0;

        // Determinar descuento según categoría
        if (categoria.equals("A")) {
            descuento = 0.10;
        } else if (categoria.equals("B")) {
            descuento = 0.15;
        } else if (categoria.equals("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoría no válida.");
            input.close();
            return;
        }

        // Calcular precio final directamente
        double precioFinal = precio - (precio * descuento);

        // Mostrar resultados con formato
        System.out.printf("Precio original: %.2f%n", precio);
        System.out.printf("Descuento aplicado: %.0f%%%n", descuento * 100);
        System.out.printf("Precio final: %.2f%n", precioFinal);

        input.close();
    }
}
