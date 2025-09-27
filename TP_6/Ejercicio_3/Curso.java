/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

// Ejercicio Propuesto 3 - Universidad, Profesor y Curso
// Autor: Nogueira Damián
// Modelo Curso: cada curso tiene EXACTAMENTE un profesor responsable (o null si está sin asignar).
// Requisito clave: setProfesor(...) debe mantener la coherencia de ambos lados.

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // lado 1 del 1..N

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Punto crítico:
    // - Si cambio el profesor, me quito de la lista del anterior.
    // - Actualizo mi referencia.
    // - Me agrego a la lista del nuevo.
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // nada que hacer

        // 1) cortar vínculo con profesor anterior
        if (this.profesor != null) {
            this.profesor.desvincularCursoDesdeCurso(this);
        }

        // 2) asignar nuevo
        this.profesor = p;

        // 3) vincular con profesor nuevo
        if (p != null) {
            p.vincularCursoDesdeCurso(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor == null) ? "(sin profesor)" : profesor.getNombre();
        System.out.println("Curso: " + codigo + " - " + nombre + " | Profesor: " + prof);
    }

    @Override
    public String toString() {
        String prof = (profesor == null) ? "—" : profesor.getNombre();
        return codigo + " - " + nombre + " (Prof.: " + prof + ")";
    }
}
