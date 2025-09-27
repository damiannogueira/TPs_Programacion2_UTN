package Ejercicio_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP Programación 2 – Caso Práctico 1
// Autor: Damián Nogueira

// Nota personal: Enum con las categorías y una descripción corta para cada una.
// Lo uso para evitar errores de tipeo y forzar valores válidos.

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    // Constructor del enum: guarda la descripción
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter simple para mostrar la descripción cuando quiera listar categorías
    public String getDescripcion() {
        return descripcion;
    }
}

