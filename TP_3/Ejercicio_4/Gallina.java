package tp_3_Ejercicio_4;

/**
 *
 * @author Damian Nogueira
 */
/**
 * Clase que representa gallinas en una granja digital
 */
public class Gallina {
    // Encapsulamiento
    private int idGallina;
    private int edad;   // en años
    private int huevosPuestos;  // acumulado
    
    // Constructor
    public Gallina (int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edadInicial); // Para evitar edades negativas
        this.huevosPuestos = 0; // Inicia en cero huevos puestos
    }
    
    // Métodos requeridos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina N#" + idGallina + " puso un huevo. Total: " + huevosPuestos);
}
    public void envejecer() {
        edad++;
        System.out.println("Gallina N#" + idGallina + " ha envejecido. Edad actual: " + edad + " año(s).");
    }
    
    public void mostrarEstado() {
        System.out.println("-- Estado Gallina N#" + idGallina + " --");
        System.out.println("Edad: " + edad + " año(s)");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
     // Getters opcionales
    public int getIdGallina() { return idGallina; }
    public int getEdad() { return edad; }
    public int getHuevosPuestos() { return huevosPuestos; }
}
