/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

// Ejercicio Propuesto 2 - Biblioteca y Libros
// Autor: Nogueira Damián
// Nota: la voy a usar como atributo dentro de Libro (composición indirecta)

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    // Muestra la info del autor
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (" + nacionalidad + "), ID=" + id);
    }

    @Override
    public String toString() {
        return nombre + " [" + nacionalidad + "]";
    }
}

