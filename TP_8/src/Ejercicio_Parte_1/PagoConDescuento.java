package Ejercicio_Parte_1;

// Autor: Damián Ignacio Nogueira
// Interfaz que extiende Pago y agrega un método adicional
// para aplicar descuentos según el medio de pago.
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}
