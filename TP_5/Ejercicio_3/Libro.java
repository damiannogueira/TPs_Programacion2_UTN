/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Damian Nogueira
 */

public class Libro {
    
    private String titulo;
    private String isbn;

    // referencias para las relaciones
    private Autor autor;           // Asociación unidireccional: Libro -> Autor
    private Editorial editorial;   // Agregación: Libro -> Editorial

    // constructor con los datos mínimos del libro
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // getters de los datos del libro
    public String getTitulo() { return titulo; }
    public String getIsbn()   { return isbn; }

    // relación: seteo el Autor (unidireccional: solo Libro conoce a Autor)
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    // relación: seteo la Editorial (agregación: reemplazable)
    public Editorial getEditorial() { return editorial; }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }
}

