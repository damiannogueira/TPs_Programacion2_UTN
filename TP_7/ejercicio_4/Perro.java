/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 4
// Autor: Damian Nogueira

package ejercicio_4;

public class Perro extends Animal {
    // Sobrescribo el comportamiento para que el perro haga su sonido clasico.
    @Override
    public String hacerSonido() {
        return "Guau!";
    }
}

