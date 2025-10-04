/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// TP Programación 2 – Caso Práctico 3
// Autor: Damián Nogueira

package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Lista polimorfica: guardo empleados de distintos tipos en la misma colección.
        List<Empleado> empleados = new ArrayList<>();

        // Cargo algunos de prueba (nombres y valores inventados para hacer el ejercicio).
        empleados.add(new EmpleadoPlanta("Damián", 500000, 5));        // planta con antiguedad
        empleados.add(new EmpleadoPlanta("Luis", 620000, 2));
        empleados.add(new EmpleadoTemporal("Sofia", 160, 2500));     // 160 hs * $2500
        empleados.add(new EmpleadoTemporal("Diego", 120, 3000));

        // Invoco calcularSueldo() polimorficamente (no me importa el tipo concreto).
        System.out.println("== Sueldos Calculados ==");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " -> $" + e.calcularSueldo());
        }

        // Clasifico con instanceof.
        System.out.println("\n== Clasificacion por tipo ==");
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.getNombre() + " es Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.getNombre() + " es Empleado Temporal");
            } else {
                System.out.println(e.getNombre() + " tipo no identificado");
            }
        }
    }
}
