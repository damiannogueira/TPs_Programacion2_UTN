/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

package ejercicio_1;

public class Principal {
    public static void main(String[] args) {
        // Creo un objeto Auto con datos de prueba.
        Auto auto = new Auto("Fiat", "600", 2);

        // Muestro la información completa usando el método sobrescrito.
        System.out.println(auto.mostrarInfo());

        // Nota personal:
        // Si lo guardo en una variable de tipo Vehiculo también funciona:
        // Vehiculo v = auto;
        // System.out.println(v.mostrarInfo());
        // -> Igual imprime la versión de Auto gracias al polimorfismo dinámico.
    }
}
