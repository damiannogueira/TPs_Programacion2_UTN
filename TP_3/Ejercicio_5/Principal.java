package tp_3_Ejercicio_5;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {
    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible y capacidad 100
        NaveEspacial nave = new NaveEspacial("Libertad", 50, 100);
        nave.mostrarEstado();

        // Despegar y tratar de avanzar sin recargar (pedimos más de lo que tenemos para que falle)
        nave.despegar();
        nave.avanzar(80); // va a fallar porque requiere 80 y tenemos disponible 50

        // Recargar y avanzar correctamente
        nave.recargarCombustible(40); // pasa de 50 -> 90 (sin exceder 100)
        nave.avanzar(80);             // ahora sí alcanza

        // Estado final
        nave.mostrarEstado();
    }
}
