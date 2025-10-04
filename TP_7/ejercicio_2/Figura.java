/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 2
// Autor: Damián Nogueira

package ejercicio_2;

// Clase abstracta base para distintas figuras geométricas.
// Uso abstract porque no tiene sentido instanciar directamente "Figura".
public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    // Método abstracto: cada subclase va a implementar su propia fórmula.
    public abstract double calcularArea();
}
