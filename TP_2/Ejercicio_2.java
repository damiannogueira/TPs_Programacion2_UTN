package TP_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Damian Nogueira
 */
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(input.nextLine());

        int mayor = (num1 >= num2) 
                    ? ((num1 >= num3) ? num1 : num3) 
                    : ((num2 >= num3) ? num2 : num3);

        System.out.println("El mayor es: " + mayor);

        input.close();
    }
}

