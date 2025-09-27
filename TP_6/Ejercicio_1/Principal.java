/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_1;

// TP Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

// Nota personal: Acá pruebo todas las tareas (1 a 10) solicitadas en el enunciado.

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1) Crear al menos 5 productos de distintas categorías y agregarlos
        Producto p1 = new Producto("P001", "Leche entera", 1200, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook 14\"", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera básica", 7500, 40, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén antiadherente", 18999, 12, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Auriculares BT", 29999, 25, CategoriaProducto.ELECTRONICA);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        // (extra) muestro cuántos productos se instanciaron -> atributo/método estático
        System.out.println("Total de productos creados: " + Producto.getTotalCreados());

        // 2) Listar todos los productos con su info y categoría
        System.out.println("\n2) Listado completo:");
        inv.listarProductos();

        // 3) Buscar producto por ID y mostrar su info
        System.out.println("\n3) Buscar por ID 'P003':");
        Producto buscado = inv.buscarProductoPorId("P003");
        System.out.println(buscado != null ? buscado : "No encontrado");

        // 4) Filtrar por categoría específica
        System.out.println("\n4) Filtrar por categoría ELECTRONICA:");
        List<Producto> electronica = inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) System.out.println(p);

        // 5) Eliminar por ID y listar restantes
        System.out.println("\n5) Eliminar 'P001' y listar:");
        boolean elimino = inv.eliminarProducto("P001");
        System.out.println("Eliminado: " + elimino);
        inv.listarProductos();

        // 6) Actualizar stock de un producto
        System.out.println("\n6) Actualizar stock de 'P005' a 60:");
        boolean actualizo = inv.actualizarStock("P005", 60);
        System.out.println("Actualizado: " + actualizo);
        System.out.println(inv.buscarProductoPorId("P005"));

        // 7) Mostrar total de stock disponible
        System.out.println("\n7) Total de stock disponible:");
        System.out.println(inv.obtenerTotalStock());

        // 8) Obtener y mostrar el producto con mayor stock
        System.out.println("\n8) Producto con mayor stock:");
        Producto mayor = inv.obtenerProductoConMayorStock();
        System.out.println(mayor != null ? mayor : "Inventario vacío");

        // 9) Filtrar productos con precios entre $1000 y $30000
        System.out.println("\n9) Productos con precio entre $1000 y $30000:");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 30000)) {
            System.out.println(p);
        }

        // 10) Mostrar categorías disponibles con sus descripciones
        System.out.println("\n10) Categorías disponibles:");
        inv.mostrarCategoriasDisponibles();
    }
}
