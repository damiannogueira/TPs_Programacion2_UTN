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
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota; // Variable para almacenar la nota

        // Repetir hasta que la nota esté entre 0 y 10
        do {
            System.out.print("Ingrese una nota de 0 a 10: ");
            nota = Integer.parseInt(input.nextLine()); // Leer nota como entero

            // Validar rango
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10); // Condición para repetir

        // Mensaje final
        System.out.println("Nota guardada correctamente.");

        input.close();
    }
}
