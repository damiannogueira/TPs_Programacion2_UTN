/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {
    public static void main(String[] args) {
        Bateria b1 = new Bateria("HB-4867", 5000);
        Usuario u1 = new Usuario("Damián Nogueira", "12345678");
        Celular c1 = new Celular("352099001234567", "Cat", "S62 Pro");

        // Relación de agregación (Celular → Bateria)
        c1.setBateria(b1);

        // Asociación bidireccional 1–1 (Celular ↔ Usuario)
        c1.setUsuario(u1);

        // Chequeos mínimos
        System.out.println(c1.getUsuario() != null ? c1.getUsuario().getNombre() : "sin usuario");
        System.out.println(u1.getCelular() != null ? u1.getCelular().getImei() : "sin celular");
        System.out.println(c1.getBateria() != null ? c1.getBateria().getModelo() : "sin bateria");
    }
}



