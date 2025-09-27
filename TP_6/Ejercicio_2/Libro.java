/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

// Ejercicio Propuesto 2 - Biblioteca y Libros
// Autor: Damián Nogueira
// Relación: cada Libro tiene 1 Autor

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    // Muestra la información del libro
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo +
                " (ISBN: " + isbn +
                ", Año: " + anioPublicacion +
                ", Autor: " + autor + ")");
    }

    @Override
    public String toString() {
        return titulo + " (" + anioPublicacion + ") - " + autor;
    }
}

