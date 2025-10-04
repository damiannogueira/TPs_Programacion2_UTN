/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 5
// Autor: Damian Nogueira

package ejercicio_5;

// Funcion "generica" en el sentido de la consigna: sirve para cualquier Pagable.
// Nota personal: uso el tipo de la interfaz para no depender de implementaciones concretas.
public class ProcesadorPagos {
    public static void procesarPago(Pagable medio) {
        // Polimorfismo: no me importa si es tarjeta, transferencia o efectivo.
        medio.pagar();
    }
}
