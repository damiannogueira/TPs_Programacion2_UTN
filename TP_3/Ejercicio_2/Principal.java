package tp_3_Ejercicio_2;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Jasy", "Perro", 2);

        // Mostrar información inicial
        m1.mostrarInfo();

        // Simular paso del tiempo (cumple años 2 veces)
        m1.cumplirAnios();
        m1.cumplirAnios();

        // Verificar cambios
        m1.mostrarInfo();
    }
}