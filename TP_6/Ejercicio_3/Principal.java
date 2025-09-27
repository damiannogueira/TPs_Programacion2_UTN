/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_3;
// Ejercicio Propuesto 3 - Universidad, Profesor y Curso
// Autor: Nogueira Damián
// Demo que cumple con las tareas solicitadas.

public class Principal {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1) Crear al menos 3 profesores y 5 cursos.
        Profesor pr1 = new Profesor("P001", "Ana Gómez", "Matemática");
        Profesor pr2 = new Profesor("P002", "Luis Pérez", "Informática");
        Profesor pr3 = new Profesor("P003", "María López", "Física");

        Curso c1 = new Curso("MAT101", "Álgebra I");
        Curso c2 = new Curso("MAT201", "Cálculo II");
        Curso c3 = new Curso("INF101", "Programación I");
        Curso c4 = new Curso("INF202", "Estructuras de Datos");
        Curso c5 = new Curso("FIS110", "Física General");

        // 2) Agregar profesores y cursos a la universidad.
        uni.agregarProfesor(pr1);
        uni.agregarProfesor(pr2);
        uni.agregarProfesor(pr3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("MAT101", "P001");
        uni.asignarProfesorACurso("MAT201", "P001");
        uni.asignarProfesorACurso("INF101", "P002");
        uni.asignarProfesorACurso("INF202", "P002");
        uni.asignarProfesorACurso("FIS110", "P003");

        // 4) Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n=== Cursos ===");
        uni.listarCursos();
        System.out.println("\n=== Profesores ===");
        uni.listarProfesores();

        // 5) Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        uni.asignarProfesorACurso("INF101", "P001");
        System.out.println("\n=== Tras reasignación (para ver sincronización) ===");
        pr1.listarCursos();
        pr2.listarCursos();

        // 6) Remover un curso y confirmar que ya no aparece en la lista del profesor.
        uni.eliminarCurso("MAT201");
        System.out.println("\n=== Tras eliminar MAT201 ===");
        pr1.listarCursos();

        // 7) Remover un profesor y dejar profesor = null en los cursos que dictaba.
        uni.eliminarProfesor("P003");

        // 8) Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println();
        uni.reporteCursosPorProfesor();
    }
}

