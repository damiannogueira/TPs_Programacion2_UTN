/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author Damian Nogueira
 */

public class Cancion {
    
    private String titulo;

    // referencia a Artista para la asociacion unidireccional
    private Artista artista;

    // constructor con el titulo
    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    // getters/setters basicos
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }
}
