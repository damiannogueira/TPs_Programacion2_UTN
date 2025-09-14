package Ejercicio_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Damian Nogueira
 */
import java.time.LocalDate;
import java.util.Objects;

/** --- PASAPORTE (agregador + compone Foto, y se asocia 1–1 con Titular) --- */
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;

    // Composición: vida de Foto depende de Pasaporte
    private Foto foto;

    // Asociación bidireccional 1–1 con Titular
    private Titular titular;

    /**
     * Constructor principal.
     * Crea la Foto "dentro" del Pasaporte (composición) y vincula el Titular (asociación bidireccional).
     */
    public Pasaporte(String numero,
                     LocalDate fechaEmision,
                     String rutaImagen, String formatoImagen,
                     Titular titular) {
        this.numero = Objects.requireNonNull(numero, "numero requerido");
        this.fechaEmision = Objects.requireNonNull(fechaEmision, "fechaEmision requerida");
        // composición: la foto se crea y pertenece a este pasaporte
        this.foto = new Foto(
                Objects.requireNonNull(rutaImagen, "ruta imagen requerida"),
                Objects.requireNonNull(formatoImagen, "formato requerido")
        );
        // asociación bidireccional
        setTitular(Objects.requireNonNull(titular, "titular requerido"));
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    public void setNumero(String numero) { this.numero = Objects.requireNonNull(numero); }
    public void setFechaEmision(LocalDate fechaEmision) { this.fechaEmision = Objects.requireNonNull(fechaEmision); }

    /** Reemplazar la foto (mantiene la composición; no se acepta inyectar Foto externa). */
    public void reemplazarFoto(String nuevaImagen, String nuevoFormato) {
        this.foto = new Foto(
                Objects.requireNonNull(nuevaImagen, "imagen requerida"),
                Objects.requireNonNull(nuevoFormato, "formato requerido")
        );
    }

    /** Maneja la asociación bidireccional 1–1 de forma consistente. */
    public void setTitular(Titular nuevoTitular) {
        if (this.titular == nuevoTitular) return;

        // Desvincular titular actual (si lo hay)
        if (this.titular != null) {
            Titular viejo = this.titular;
            this.titular = null;
            if (viejo.pasaporte == this) {
                viejo.pasaporte = null;
            }
        }

        // Vincular nuevo titular
        this.titular = nuevoTitular;
        if (nuevoTitular != null && nuevoTitular.pasaporte != this) {
            nuevoTitular.pasaporte = this;
        }
    }

    /** Simula invalidar el pasaporte: rompe lazos y libera la foto compuesta. */
    public void invalidar() {
        this.foto = null; // composición: la foto "muere" con el pasaporte
        setTitular(null); // rompe asociación bidireccional
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", foto=" + foto +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
}
