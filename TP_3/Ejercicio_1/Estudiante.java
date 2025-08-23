package tp_3_Ejercicio_1;

/**
 *
 * @author Damián Nogueira
 */
/**
 * Clase que representa a un estudiante con sus datos básicos y calificaciones.
 */
public class Estudiante {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    /** Utilizo la palabra clave "this" para diferenciar entre el atributo de la clase (this.nombre) 
     * y el parámetro que llega al constructor (nombre). */
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificación ha aumentado en " + puntos + " puntos.");
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // Evito que quede negativa
        }
        System.out.println("La calificación ha disminuido en " + puntos + " puntos.");
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }

    public void setCurso(String curso) { this.curso = curso; }
}
