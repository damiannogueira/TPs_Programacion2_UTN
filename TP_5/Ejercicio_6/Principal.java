/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // creo cliente y mesa (objetos independientes)
        Cliente cl1 = new Cliente("Damian Nogueira", "11-5555-5555");
        Mesa m1 = new Mesa(12, 4);

        // creo la reserva
        Reserva r1 = new Reserva("2025-09-20", "21:00");

        // relaciones pedidas por la consigna
        r1.setCliente(cl1); // asociacion unidireccional Reserva -> Cliente
        r1.setMesa(m1);     // agregacion Reserva -> Mesa
        
        // chequeo rapido
        System.out.println("Reserva para: " + r1.getCliente().getNombre() +
                           " en mesa nro " + r1.getMesa().getNumero() +
                           " el " + r1.getFecha() + " a las " + r1.getHora());
    }
}

