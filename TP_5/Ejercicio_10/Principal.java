/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // creo los objetos que pide el enunciado
        Titular t1 = new Titular("Damian Nogueira", "12345678");
        ClaveSeguridad cs1 = new ClaveSeguridad("ABCD-1234", "2025-09-13");
        CuentaBancaria cb1 = new CuentaBancaria("01701234-00000000000001", 150000.0);

        // relaciones pedidas
        cb1.setClaveSeguridad(cs1); // composicion CuentaBancaria -> ClaveSeguridad
        cb1.setTitular(t1);         // asociacion bidireccional 1 a 1

        // chequeo rapido (opcional)
        System.out.println("CBU: " + cb1.getCbu() +
                           " | Titular: " + (cb1.getTitular()!=null ? cb1.getTitular().getNombre() : "sin titular") +
                           " | Clave: " + (cb1.getClaveSeguridad()!=null ? cb1.getClaveSeguridad().getCodigo() : "sin clave"));
    }
}

