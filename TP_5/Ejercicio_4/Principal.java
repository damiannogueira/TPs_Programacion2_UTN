/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // creo banco y cliente (objetos independientes)
        Banco b1 = new Banco("BBVA", "30-99999999-9");
        Cliente c1 = new Cliente("Damián Nogueira", "12345678");

        // creo la tarjeta con sus datos
        TarjetaDeCredito t1 = new TarjetaDeCredito("4509 1234 5678 9999", "12/28");

        // relaciones pedidas por la consigna
        t1.setBanco(b1);   // agregación Tarjeta -> Banco
        t1.setCliente(c1); // asociación bidireccional Tarjeta <-> Cliente

        // chequeos simples
        System.out.println(t1.getCliente() != null ? t1.getCliente().getNombre() : "sin cliente");
        System.out.println(c1.getTarjeta() != null ? c1.getTarjeta().getNumero() : "sin tarjeta");
        System.out.println(t1.getBanco()   != null ? t1.getBanco().getNombre()   : "sin banco");
    }
}

