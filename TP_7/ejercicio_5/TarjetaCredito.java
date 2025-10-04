/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 5
// Autor: Damian Nogueira

package ejercicio_5;

// Representa un pago con tarjeta de credito.
// Simplifico validaciones (no encripto ni valido formato real, porque es un ejercicio).
public class TarjetaCredito implements Pagable {
    private String titular;
    private String numero;   // Nota personal: guardo solo para imprimir ejemplo.
    private int cuotas;
    private double monto;

    public TarjetaCredito(String titular, String numero, int cuotas, double monto) {
        this.titular = titular;
        this.numero = numero;
        this.cuotas = cuotas;
        this.monto = monto;
    }

    @Override
    public void pagar() {
        // Simulo el cobro. En la vida real aca iria la pasarela de pagos.
        System.out.println("[TarjetaCredito] Titular: " + titular
                + " | ****" + ultimos4(numero)
                + " | cuotas: " + cuotas
                + " | monto: $" + monto);
    }

    // Helper chiquito para no mostrar el numero completo.
    private String ultimos4(String n) {
        if (n == null || n.length() < 4) return "0000";
        return n.substring(n.length() - 4);
    }
}
