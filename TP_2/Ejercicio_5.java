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

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumaPares = 0;
        int numero; //variable para almacenar cada numero

        //Ciclo Do hasta que el usuario ingrese cero para salir
        do {
            System.out.print("Ingrese un número (Ingrese 0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());

            if (numero % 2 == 0 && numero != 0) { //Si es par lo sumo
                sumaPares += numero;
            }
        } while (numero != 0);
        
        //Mostrar resultado
        System.out.println("La suma de los números pares es: " + sumaPares);

        input.close();
    }
}
    

