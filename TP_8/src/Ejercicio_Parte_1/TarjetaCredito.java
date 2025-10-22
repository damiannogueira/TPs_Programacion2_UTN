package Ejercicio_Parte_1;

// Autor: Damián Ignacio Nogueira

// Clase que representa un pago con tarjeta de crédito.
// Implementa PagoConDescuento porque permite aplicar un descuento.
public class TarjetaCredito implements PagoConDescuento {

    // Método que procesa el pago con tarjeta
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta por $" + monto);
    }

    // Aplica un descuento fijo del 10% al monto
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9;
    }
}
