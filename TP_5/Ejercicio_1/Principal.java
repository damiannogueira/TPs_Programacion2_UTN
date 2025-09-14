package Ejercicio_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Damian Nogueira
 */
import java.time.LocalDate;

/** Pequeña demo de ejemplo */
public class Principal {
    public static void main(String[] args) {
        Titular t = new Titular("Damián Ignacio Nogueira", "34.467.509");
        Pasaporte p = new Pasaporte("AR-2025-0001",
                LocalDate.of(2025, 1, 15),
                "damian_pasaporte.jpg", "JPG",
                t);

        System.out.println(p);
        System.out.println("Titular conoce su pasaporte? " + (t.getPasaporte() != null));

        // Reemplazo de foto (composición)
        p.reemplazarFoto("damian_nueva.png", "PNG");
        System.out.println("Foto reemplazada -> " + p.getFoto());

        // Romper vínculo bidireccional
        p.setTitular(new Titular("Cambio Titular", "45.999.999"));
        System.out.println(p);
    }
}
