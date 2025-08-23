package tp_3_Ejercicio_1;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

   
    public static void main(String[] args) {
        // Instanciamos un estudiante
        Estudiante est1 = new Estudiante("Damián", "Nogueira", "Programación II", 7.5);

        // Mostramos su información
        est1.mostrarInfo();

        // Subimos y bajamos calificación
        est1.subirCalificacion(1.5);
        est1.mostrarInfo();

        est1.bajarCalificacion(3.0);
        est1.mostrarInfo();
    }
    
}
