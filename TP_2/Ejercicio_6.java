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
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Contadores para cada tipo de número
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Bucle para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = Integer.parseInt(input.nextLine()); // Leer número como entero

            // Clasificar el número
            if (numero > 0) {
                positivos++; // Incrementar positivos
            } else if (numero < 0) {
                negativos++; // Incrementar negativos
            } else {
                ceros++; // Incrementar ceros
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        input.close();
    }
}