/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Ejercicio_11;
/**
 *
 * @author Damian Nogueira
 */

public class Principal {
    public static void main(String[] args) {
        // creo el artista y la cancion
        Artista a1 = new Artista("Gustavo Cerati", "Rock");
        Cancion c1 = new Cancion("Lago en el cielo");
        c1.setArtista(a1);  // asociacion unidireccional Cancion -> Artista

        // creo el reproductor y uso el metodo (dependencia de uso)
        Reproductor r1 = new Reproductor();
        r1.reproducir(c1);
    }
}

