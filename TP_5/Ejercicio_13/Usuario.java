/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author Damian Nogueira
 */

public class Usuario {
    
    private String nombre;
    private String email;

    // constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getEmail()  { return email; }
}
