/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 2
// Autor: Damián Nogueira

package ejercicio_2;

// Subclase Rectangulo que hereda de Figura.
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre); // Llamo al constructor de Figura.
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    // Implemento el método abstracto con la fórmula del área del rectángulo.
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

