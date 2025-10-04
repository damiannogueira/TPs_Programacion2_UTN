/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 2
// Autor: Damián Nogueira

package ejercicio_2;

// Subclase Circulo que hereda de Figura.
public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);  // Llamo al constructor de Figura.
        this.radio = radio;
    }

    public double getRadio() { return radio; }

    // Implemento el método abstracto con la fórmula del área del círculo.
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
