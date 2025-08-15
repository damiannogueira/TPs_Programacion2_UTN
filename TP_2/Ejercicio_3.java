package TP_2;

import java.util.Scanner;

/**
 *
 * @author Damian Nogueira
 */
public class Ejercicio_3 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine()); // convertir a int

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }

    }
    
}
