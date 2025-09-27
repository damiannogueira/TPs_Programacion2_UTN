/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
// Ejercicio Propuesto 3 - Universidad, Profesor y Curso
// Autor: Nogueira Damián
// Administrador del dominio: alta/baja y consultas de profesores y cursos.
// Mantiene la relación usando SIEMPRE Curso.setProfesor(...) para no romper el invariante.

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados.");
            return;
        }
        System.out.println("Profesores en " + nombre + ":");
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos cargados.");
            return;
        }
        System.out.println("Cursos en " + nombre + ":");
        for (Curso c : cursos) c.mostrarInfo();
    }

    // Asignar/cambiar profesor usando la única fuente de verdad: Curso.setProfesor(...)
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) return false;
        c.setProfesor(p);
        return true;
    }

    // Eliminar curso: romper vínculo si lo tiene y quitarlo de la lista institucional
    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return false;
        if (c.getProfesor() != null) {
            c.setProfesor(null); // corta bidireccionalidad de forma segura
        }
        return cursos.remove(c);
    }

    // Eliminar profesor: dejar en null los cursos que dictaba
    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return false;
        // Copia para evitar ConcurrentModification
        for (Curso c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        return profesores.remove(p);
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("Reporte: cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}
