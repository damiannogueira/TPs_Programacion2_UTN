/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author Damian Nogueira
 */

public class Principal {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Damian Nogueira", "damian@email.com");
        GeneradorQR gen = new GeneradorQR();

        // dependencia de creacion: el generador crea el CodigoQR adentro del metodo
        gen.generar("QR-ABC-123", u1);
    }
}

