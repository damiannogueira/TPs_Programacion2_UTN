/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP_2;

/**
 *
 * @author Damian Nogueira
 */
public class Ejercicio_13 {

    // Función recursiva para mostrar precios
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) { // Caso base: detener cuando índice llegue al final
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1); // Llamada recursiva con el siguiente índice
        }
    }

    public static void main(String[] args) {

        // a. Declarar e inicializar array de precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        // c. Modificar el precio del producto en índice 2
        precios[2] = 129.99;

        // d. Mostrar precios modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }
}

