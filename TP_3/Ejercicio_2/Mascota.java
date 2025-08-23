
package tp_3_Ejercicio_2;

/**
 *
 * @author Damian Nogueira
 */
/**
 * Clase que representa una mascota con nombre, especie y edad.
 */
public class Mascota {
    // Encapsulamiento
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(0, edad); // Usé este método de la clase Math para evitar edades negativas
    }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " año(s)");
    }

    public void cumplirAnios() {
        edad++; // Si cumple años incremento en 1 la edad
        System.out.println(nombre + " ha cumplido años. Nueva edad: " + edad);
    }

    // Getters para pruebas / extensiones
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public int getEdad() { return edad; }
}