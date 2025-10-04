/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 5
// Autor: Damian Nogueira

package ejercicio_5;

// Representa un pago en efectivo.
// Nota personal: lo incluyo para mostrar que el mismo contrato tambien aplica a algo simple.
public class Efectivo implements Pagable {
    private double monto;

    public Efectivo(double monto) {
        this.monto = monto;
    }

    @Override
    public void pagar() {
        System.out.println("[Efectivo] Entregado en caja | monto: $" + monto);
    }
}

