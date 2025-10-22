package Ejercicio_1_Parte_2;

// Autor: Damián Ignacio Nogueira

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pido dos números al usuario
        System.out.print("Ingrese el dividendo: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el divisor: ");
        int b = sc.nextInt();

        try {
            // Si el divisor es 0, en Java se lanza ArithmeticException
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo el caso divisor cero
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}
