/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 3
// Autor: Damián Nogueira

package ejercicio_3;

// Empleado de planta: sueldo fijo + plus simple por antiguedad.
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int aniosAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, int aniosAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double getSueldoBase() { return sueldoBase; }
    public int getAniosAntiguedad() { return aniosAntiguedad; }

    @Override
    public double calcularSueldo() {
        // Regla simple que inventé para hacer el ejercicio: 2% por año sobre el base.
        double plus = sueldoBase * 0.02 * aniosAntiguedad;
        return sueldoBase + plus;
    }
}

