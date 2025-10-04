/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 3
// Autor: Damián Nogueira

package ejercicio_3;

// Clase abstracta base. No tiene sentido crear "Empleado" genérico sin tipo.
public abstract class Empleado {
    // Datos comunes a cualquier empleado.
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    // Polimorfismo: cada subclase calcula el sueldo con su propia regla.
    public abstract double calcularSueldo();
}

