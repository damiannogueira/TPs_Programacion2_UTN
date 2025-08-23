package tp_3_Ejercicio_3;

/**
 *
 * @author Damian Nogueira
 */

//Importo la librería time
import java.time.Year; 

/**
 * Clase que representa un libro con título, autor y año de publicación.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // uso la validación del setter
    }

    // Getters requeridos
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    /**
     * Setter con validación para el año de publicación.
     * Reglas: no menor a 1450 (era de la imprenta) y no mayor al año actual.
     * Con Year.now().getValue() obtengo el año del sistema en tiempo de ejecución; 
     * así la validación seguirá funcionando en 2026, 2027, etc.
     */
    public void setAnioPublicacion(int anio) {
        int anioActual = Year.now().getValue();
        if (anio < 1450 || anio > anioActual) {
            throw new IllegalArgumentException(
                "Año de publicación inválido: " + anio +
                ". Debe estar entre 1450 y " + anioActual + "."
            );
        }
        this.anioPublicacion = anio;
    }

    // Utilidad para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}