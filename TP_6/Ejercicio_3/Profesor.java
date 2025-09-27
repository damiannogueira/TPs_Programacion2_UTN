/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

// Ejercicio Propuesto 3 - Universidad, Profesor y Curso
// Autor: Nogueira Damián
// Modelo Profesor: un profesor dicta N cursos (lado 1..N)
// "cursos" es la lista donde guardo sus cursos actuales.

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    // Devuelvo copia para no exponer la lista interna
    public List<Curso> getCursos() { return new ArrayList<>(cursos); }

    // === Iniciar vínculo DESDE el profesor (sincroniza ambos lados) ===
    public void agregarCurso(Curso c) {
        if (c == null || cursos.contains(c)) return;
        cursos.add(c);
        if (c.getProfesor() != this) {
            c.setProfesor(this); // fuente de verdad del vínculo
        }
    }

    public void eliminarCurso(Curso c) {
        if (c == null || !cursos.contains(c)) return;
        cursos.remove(c);
        if (c.getProfesor() == this) {
            c.setProfesor(null); // rompe el vínculo de forma segura
        }
    }

    // === Auxiliares usados por Curso.setProfesor(...) (evitan recursión) ===
    void vincularCursoDesdeCurso(Curso c) {
        if (!cursos.contains(c)) cursos.add(c);
    }

    void desvincularCursoDesdeCurso(Curso c) {
        cursos.remove(c);
    }

    // === Utilidades para mostrar ===
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos actualmente.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + id +
                ", Esp.: " + especialidad + ") | Cursos: " + cursos.size());
    }

    @Override
    public String toString() {
        return nombre + " [" + especialidad + "] (ID: " + id + ")";
    }
}
