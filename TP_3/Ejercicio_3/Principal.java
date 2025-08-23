package tp_3_Ejercicio_3;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un libro con datos válidos
        Libro libro = new Libro("Tormenta de Espadas", "George RR Martin", 2000);
        
        //Mostrar información inicial
        libro.mostrarInfo();
        
        // Intentar modificar con un valor inválido
        try {
            libro.setAnioPublicacion(1200); // inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar año: " + e.getMessage());
        }

        // Modificar con un valor válido
        libro.setAnioPublicacion(2025);

        // Mostrar información final
        libro.mostrarInfo();
    }
}
