/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

// TP Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

// Nota personal: Administra la colección dinámica (ArrayList) de productos.
// Implemento todos los métodos que pide el enunciado.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Inventario {
    // Atributo del enunciado: colección dinámica de productos
    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Listar todos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("(Inventario vacío)");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Buscar por ID (devuelvo null si no existe)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // Eliminar por ID 
    public boolean eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        return (encontrado != null) && productos.remove(encontrado);
    }

    // Actualizar stock por ID 
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // Filtrar por categoría (devuelvo lista nueva para no exponer lista interna)
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> salida = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                salida.add(p);
            }
        }
        return salida;
    }

    // Sumar cantidades (total de stock)
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Producto con mayor stock (uso Collections.max con Comparator)
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        return Collections.max(productos, Comparator.comparingInt(Producto::getCantidad));
    }

    // Filtrar por rango de precio [min, max]
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> salida = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                salida.add(p);
            }
        }
        return salida;
    }

    // Mostrar las categorías del enum CategoriaProducto con su descripción (como pide el enunciado)
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + " → " + c.getDescripcion());
        }
    }
}
