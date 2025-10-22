package Ejercicio_Parte_1;

// Autor: Damián Ignacio Nogueira

// Clase que representa al cliente del sistema.
// Implementa la interfaz Notificable para recibir notificaciones.
public class Cliente implements Notificable {
    private String nombre;

    // Constructor que recibe el nombre del cliente
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Muestra por consola un mensaje cuando recibe una notificación
    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " recibió notificación: " + mensaje);
    }
}

