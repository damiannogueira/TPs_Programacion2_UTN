package Ejercicio_Parte_1;

// Autor: Damián Ignacio Nogueira

// Clase que representa un pago realizado con PayPal.
// Implementa la interfaz Pago (sin descuento).
public class PayPal implements Pago {

    // Procesa el pago con el monto indicado
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal por $" + monto);
    }
}
