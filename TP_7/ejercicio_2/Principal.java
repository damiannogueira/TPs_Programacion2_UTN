/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 2
// Autor: Damián Nogueira

package ejercicio_2;

public class Principal {
    public static void main(String[] args) {
        // Creo un array de figuras (uso polimorfismo).
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Círculo", 5);
        figuras[1] = new Rectangulo("Rectángulo", 4, 6);

        // Recorro el array e invoco calcularArea() sin importar el tipo concreto.
        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getNombre() + " - Área: " + f.calcularArea());
        }
    }
}

