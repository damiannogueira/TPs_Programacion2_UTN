package Ejercicio_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

// Nota personal: Clase que representa un producto del inventario.
// Incluye sobrecarga de constructores como pide la consigna.

public class Producto {
    // Atributos del enunciado
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Requisito "estáticos": uso uno para contar cuántos productos se crearon
    private static int totalCreados = 0;

    // Constructor completo (el que más uso)
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        // Uso "this" para diferenciar atributo de parámetro (consigna)
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        totalCreados++;
    }

    // Sobrecarga 1: si no me pasan cantidad, arranco en 0
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria);
    }

    // Sobrecarga 2: si no me pasan precio ni cantidad
    public Producto(String id, String nombre, CategoriaProducto categoria) {
        this(id, nombre, 0.0, 0, categoria);
    }

    // Getters y setters mínimos que uso en el inventario
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    // Método estático de apoyo para las conclusiones
    public static int getTotalCreados() { return totalCreados; }

    // Método pedido: mostrarInfo() – delego en toString() para no repetir formato
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    // toString() para depuración y listado prolijo (consigna)
    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=$" + String.format("%.2f", precio) +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}

