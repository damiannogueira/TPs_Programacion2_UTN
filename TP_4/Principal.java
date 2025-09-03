/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_4;

/**
 *
 * @author Damian Nogueira
 */

/**
 *  Esta es mi clase de prueba 
 */
public class Principal {
    public static void main(String[] args) {
        // Instanciación con constructor completo
        Empleado e1 = new Empleado(101, "Damián Nogueira", "Gerente", 120000);
        Empleado e2 = new Empleado(102, "Homero Simpson", "Desarrollador", 95000);

        // Instanciación con constructor que genera id automático y aplica salario por defecto
        Empleado e3 = new Empleado("Barney Gómez", "Analista");
        Empleado e4 = new Empleado("Moe Szyslak", "Soporte");

        // Aplicar métodos sobrecargados actualizarSalario
        e1.actualizarSalario(10.00); // aumento del 10%
        e2.actualizarSalario(5000); // aumento fijo de $5000
        e3.actualizarSalario(15.00);   // aumento del 15%
        e4.actualizarSalario(2000); // aumento fijo de $2000

        // Imprimir información de cada empleado
        // Uso toString implícitamente
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar el total de empleados creados con el método estático
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

