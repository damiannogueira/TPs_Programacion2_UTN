/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author Damian Nogueira
 */

public class Reproductor {
    // dependencia de uso: solo usa la cancion, no la guarda
    public void reproducir(Cancion cancion) {
        // sout de prueba para ver que funciona
        String nombreArtista = (cancion.getArtista() != null) ? cancion.getArtista().getNombre() : "Artista desconocido";
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + nombreArtista);
    }
}

