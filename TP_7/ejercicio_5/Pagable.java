/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 5
// Autor: Damian Nogueira

package ejercicio_5;

// Interfaz comun para cualquier medio de pago.
// Idea: obligar a que todos expongan el metodo pagar() con el mismo contrato.
public interface Pagable {
    void pagar(); // Nota personal: no paso monto por parametro para seguir la consigna.
}

