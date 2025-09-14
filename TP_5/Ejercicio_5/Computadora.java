/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author Damian Nogueira
 */

public class Computadora {
    
    private String marca;
    private String numeroSerie;

    // relaciones 
    private PlacaMadre placaMadre;   // Composicion: Computadora -> PlacaMadre
    private Propietario propietario; // Asociacion bidireccional 1 a 1

    // creo la computadora con sus datos
    public Computadora(String marca, String numeroSerie) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
    }

    // getters basicos
    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }

    // relacion: composicion con PlacaMadre (parte inseparable)
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public void setPlacaMadre(PlacaMadre placaMadre) {
        // en composicion, la placa pertenece a esta computadora
        this.placaMadre = placaMadre;
    }

    // relacion: asociacion bidireccional con Propietario
    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario nuevo) {
        if (this.propietario == nuevo) return;
        Propietario anterior = this.propietario;
        this.propietario = nuevo;
        if (anterior != null && anterior.getComputadora() == this) {
            anterior.setComputadora(null);
        }
        if (nuevo != null && nuevo.getComputadora() != this) {
            nuevo.setComputadora(this);
        }
    }
}

