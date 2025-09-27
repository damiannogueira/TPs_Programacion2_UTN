/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_2;

// Ejercicio Propuesto 2 - Biblioteca y Libros
// Autor: Damián Nogueira
// Clase Main: prueba de todas las consignas (1 a 9)

public class Principal {
    public static void main(String[] args) {
        // 1) Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // 2) Creamos al menos tres autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Julio Cortázar", "Argentina");

        // 3) Agregamos 5 libros asociados a alguno de los autores
        biblio.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblio.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, a1);
        biblio.agregarLibro("ISBN003", "Harry Potter y la piedra filosofal", 1997, a2);
        biblio.agregarLibro("ISBN004", "Harry Potter y la cámara secreta", 1998, a2);
        biblio.agregarLibro("ISBN005", "Rayuela", 1963, a3);

        // 4) Listar todos los libros
        System.out.println("\n4) Listado completo de libros:");
        biblio.listarLibros();

        // 5) Buscar un libro por ISBN
        System.out.println("\n5) Buscar por ISBN 'ISBN003':");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN003");
        System.out.println(buscado != null ? buscado : "No encontrado");

        // 6) Filtrar libros por año
        System.out.println("\n6) Libros publicados en 1997:");
        for (Libro l : biblio.filtrarLibrosPorAnio(1997)) {
            System.out.println(l);
        }

        // 7) Eliminar un libro por ISBN
        System.out.println("\n7) Eliminar 'ISBN002': " + biblio.eliminarLibro("ISBN002"));
        biblio.listarLibros();

        // 8) Cantidad total de libros
        System.out.println("\n8) Cantidad total de libros:");
        System.out.println(biblio.obtenerCantidadLibros());

        // 9) Listar autores de la biblioteca
        System.out.println("\n9) Autores en la biblioteca:");
        biblio.mostrarAutoresDisponibles();
    }
}

