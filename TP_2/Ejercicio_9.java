/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_9 {

    // a. Método que calcula el costo de envío según zona y peso
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) { //Comparar ignorando mayusc y minusc
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona de envío no válida. Usando costo 0.");
            return 0.0;
        }

        return peso * costoPorKg;
    }

    // b. Calcula el total sumando el precio del producto y el costo de envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine().trim();

        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calcular total de la compra
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        input.close();
    }
}
