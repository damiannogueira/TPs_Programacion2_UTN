/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 4
// Autor: Damian Nogueira

package ejercicio_4;

// Clase base de la jerarquía. No la hago abstracta porque quiero poder instanciar un Animal generico si hiciera falta.
public class Animal {
    // Metodo comun para describir en general. Las subclases pueden heredarlo tal cual.
    public String describirAnimal() {
        // Nota personal: uso getClass().getSimpleName() para ver el tipo concreto.
        return "Soy un " + getClass().getSimpleName();
    }

    // Metodo que voy a sobrescribir en las subclases para cambiar el sonido.
    public String hacerSonido() {
        // Sonido generico por defecto. Las subclases devolveran su propio sonido.
        return "(sonido generico)";
    }
}
