/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_4;

/**
 *
 * @author Damian Nogueira
 */

/**
 * Clase Empleado
 */
public class Empleado {
    // Atributos
    private final int id; // El id será inmutable por eso lo dejo como final
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // Variable de clase

    
    /**
     * Estos son mis constructores sobrecargados, 
     * uno recibe todos los atributos,
     * el otro genera un id automático y aplica un salario por defecto
     */
    
    // Constructor con todos los atributos y uso de this
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto (id automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
    }
    
    // Método sobrecargado: aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Método sobrecargado: aumento por cantidad fija
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID = " + id + ", Nombre = " + nombre + ", Puesto = " + puesto + ", Salario = $" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

