package Ejercicio_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Damian Nogueira
 */
import java.util.Objects;

/** --- TITULAR (se asocia bidireccionalmente con Pasaporte) --- */
public class Titular {
    private String nombre;
    private String dni;

    // Referencia inversa (asociación bidireccional 1–1)
    Pasaporte pasaporte; // paquete-privado: el vínculo lo gestiona Pasaporte

    public Titular(String nombre, String dni) {
        this.nombre = Objects.requireNonNull(nombre, "nombre requerido");
        this.dni = Objects.requireNonNull(dni, "dni requerido");
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public void setNombre(String nombre) { this.nombre = Objects.requireNonNull(nombre); }
    public void setDni(String dni) { this.dni = Objects.requireNonNull(dni); }

    /** Sólo lectura pública; el set lo maneja Pasaporte para evitar inconsistencias */
    public Pasaporte getPasaporte() { return pasaporte; }

    @Override
    public String toString() {
        return "Titular{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}
