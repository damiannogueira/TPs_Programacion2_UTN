/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // creo un Autor y una Editorial (objetos independientes)
        Autor a1 = new Autor("Julio Cortázar", "Argentina");
        Editorial e1 = new Editorial("Alfaguara", "Av. Siempre Viva 742");

        // creo el Libro con sus datos
        Libro l1 = new Libro("Rayuela", "978-987-1138-00-9");

        // relaciones pedidas por el ejercicio
        l1.setAutor(a1);       // asociación unidireccional Libro -> Autor
        l1.setEditorial(e1);   // agregación Libro -> Editorial

        // chequeos simples (salidas de control)
        System.out.println(l1.getTitulo() + " / " + l1.getIsbn());
        System.out.println("Autor: " + (l1.getAutor() != null ? l1.getAutor().getNombre() : "sin autor"));
        System.out.println("Editorial: " + (l1.getEditorial() != null ? l1.getEditorial().getNombre() : "sin editorial"));
    }
}
