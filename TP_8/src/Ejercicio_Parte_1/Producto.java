package Ejercicio_Parte_1;

// Autor: Damián Ignacio Nogueira

// Clase que representa un producto dentro del sistema.
// Implementa la interfaz Pagable porque tiene un precio que puede sumarse al total.
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    // Constructor que recibe el nombre y el precio del producto
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementación del método de la interfaz Pagable
    @Override
    public double calcularTotal() {
        return precio;
    }
}

