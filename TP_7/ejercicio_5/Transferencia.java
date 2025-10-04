/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 5
// Autor: Damian Nogueira

package ejercicio_5;

// Representa un pago por transferencia bancaria.
public class Transferencia implements Pagable {
    private String banco;
    private String cbu;
    private double monto;

    public Transferencia(String banco, String cbu, double monto) {
        this.banco = banco;
        this.cbu = cbu;
        this.monto = monto;
    }

    @Override
    public void pagar() {
        System.out.println("[Transferencia] Banco: " + banco
                + " | CBU: " + cbu
                + " | monto: $" + monto);
    }
}

