/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_2;

/**
 *
 * @author Damian Nogueira
 */
public class Ejercicio_12 {
    public static void main(String[] args) {

        // a. Declarar e inicializar array con precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c. Modificar el precio de un producto específico (por ejemplo, índice 2)
        precios[2] = 129.99;

        // d. Mostrar precios modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
