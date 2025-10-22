
package Ejercicio_2_Parte_2;

// Autor: Damián Ignacio Nogueira

import java.util.Scanner;

public class ConversionCadenaANumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leo un texto que debería ser un número entero
        System.out.print("Ingrese un número entero: ");
        String texto = sc.nextLine();

        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Convertido correctamente: " + valor);
        } catch (NumberFormatException e) {
            // Manejo cuando el texto no es un entero válido
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        }
    }
}
