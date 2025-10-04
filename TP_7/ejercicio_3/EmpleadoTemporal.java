/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programación 2 – Caso Práctico 3
// Autor: Damián Nogueira

package ejercicio_3;

// Empleado temporal: cobra por horas. Fórmula básica que inventé para realizar el ejercicio.
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getValorHora() { return valorHora; }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}

