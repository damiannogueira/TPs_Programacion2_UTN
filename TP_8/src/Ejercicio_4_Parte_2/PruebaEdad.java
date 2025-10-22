package Ejercicio_4_Parte_2;

// Autor: Damián Ignacio Nogueira

import java.util.Scanner;

public class PruebaEdad {
    // Método que valida la edad y lanza la excepción personalizada
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad válida.");
        } catch (EdadInvalidaException e) {
            // Capturo y muestro el mensaje de la excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}

