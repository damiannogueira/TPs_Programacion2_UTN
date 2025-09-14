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

/** --- FOTO (parte compuesta por Pasaporte) --- */
public class Foto {
    private final String imagen;   // ruta/identificador de la imagen
    private final String formato;  // ej: "JPG", "PNG"

    public Foto(String imagen, String formato) {
        this.imagen = Objects.requireNonNull(imagen, "imagen requerida");
        this.formato = Objects.requireNonNull(formato, "formato requerido");
    }

    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }

    @Override
    public String toString() {
        return "Foto{" + "imagen='" + imagen + '\'' + ", formato='" + formato + '\'' + '}';
    }
}
