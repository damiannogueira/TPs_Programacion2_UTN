/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// TP 7 Programacion 2 – Caso Practico 4
// Autor: Damian Nogueira

package ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Armo una lista polimorfica: guardo distintos animales en la misma coleccion.
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Animal()); // dejo uno generico para ver el comportamiento base

        // Recorro la lista e invoco los metodos. No me importa el tipo concreto,
        // cada objeto responde con su propia implementacion gracias al polimorfismo.
        System.out.println("== Sonidos ==");
        for (Animal a : animales) {
            System.out.println(a.describirAnimal() + " -> " + a.hacerSonido());
        }
    }
}
