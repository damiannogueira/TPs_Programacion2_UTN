package tp_3_Ejercicio_5;

/**
 *
 * @author Damian Nogueira
 */
/**
 * Clase que simula una nave espacial con combustible y operaciones básicas
 */
public class NaveEspacial {
    // Encapsulamiento
    private String nombre;
    private int combustible;    // actual en unidades
    /**
     * La consigna me exige validar el combustible antes de avanzar y evitar superar el límite al recargar;
     * por eso agregué capacidadMaxima, enVuelo y chequeos en cada operación.
     */
    private int capacidadMaxima;    // tope de combustible
    private boolean enVuelo;    // para validación
    
    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial, int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser > 0.");
        }
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        // Normalizo el combustible inicial al rango [0, capacidadMaxima]
        if (combustibleInicial < 0) combustibleInicial = 0;
        if (combustibleInicial > capacidadMaxima) combustibleInicial = capacidadMaxima;
        this.combustible = combustibleInicial;
        this.enVuelo = false;   // la nave arranca aterrizada
    }


    // Métodos requeridos
    
 /** Intenta despegar si hay combustible disponible. */
    public void despegar() {
        // si está en vuelo solo informa
        if (enVuelo) {
            System.out.println("La nave " + nombre + " ya está en vuelo.");
            return;
        }
        // si no hay combustible no permite despegar
        if (combustible <= 0) {
            System.out.println("No hay combustible para despegar.");
            return;
        }
        // si hay combustible, despega la nave, cambia enVuelo a verdadero
        enVuelo = true;
        System.out.println("La nave " + nombre + " ha despegado.");
    }

    /**
     * Avanza una distancia; consume 1 unidad de combustible por unidad de distancia.
     * Valida que esté en vuelo y que alcance el combustible.
     */
    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        // exijo que esté en vuelo, no puede avanzar en tierra
        if (!enVuelo) {
            System.out.println("No se puede avanzar: la nave no está en vuelo.");
            return;
        }
        // verifica que el combustible sea suficiente
        if (combustible < distancia) {
            System.out.println("Combustible insuficiente: requerido " + distancia +
                               ", disponible " + combustible + ".");
            return;
        }
        // consumo de combustible de forma lineal
        combustible -= distancia;
        System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
    }

    /**
     * Recarga combustible sin exceder la capacidad máxima.
     * Informa si quedó cantidad sin cargar por falta de espacio.
     */
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        // calculo el espacio disponible
        int espacio = capacidadMaxima - combustible; // espacio disponible
        int cargado = Math.min(cantidad, espacio); // evita que se supere el límite al recargar
        combustible += cargado; // actualizar combustible
        /** carga hasta el tope, si sobra lo informa */
        if (cargado < cantidad) {
            System.out.println("Se cargaron " + cargado + " unidades. " +
                               "Límite alcanzado, sobraron " + (cantidad - cargado) + " sin cargar.");
        } else {
            System.out.println("Se cargaron " + cargado + " unidades. Combustible: " + combustible + "/" + capacidadMaxima);
        }
    }

    /** Muestra el estado actual de la nave. */
    public void mostrarEstado() {
        System.out.println("-- Estado de nave " + nombre + " --");
        System.out.println("En vuelo: " + (enVuelo ? "Sí" : "No"));
        System.out.println("Combustible: " + combustible + "/" + capacidadMaxima);
    }

    // Getters opcionales
    public String getNombre() { return nombre; }
    public int getCombustible() { return combustible; }
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public boolean isEnVuelo() { return enVuelo; }
}
