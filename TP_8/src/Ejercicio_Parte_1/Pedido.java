package Ejercicio_Parte_1;

// Autor: Damián Ignacio Nogueira

import java.util.ArrayList;
import java.util.List;

// Clase que representa un pedido con varios productos.
// También implementa la interfaz Pagable para poder calcular el total del pedido.
public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;

    // Agrega un producto a la lista del pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Calcula el total sumando los precios de todos los productos
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // Asocia un cliente al pedido para poder notificarlo
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Cuando cambia el estado del pedido, se notifica al cliente
    public void cambiarEstado(String nuevoEstado) {
        if (cliente != null) {
            cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
        }
    }
}

