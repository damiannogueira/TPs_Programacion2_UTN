/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author Damian Nogueira
 */

public class Titular {
    
    private String nombre;
    private String dni;

    // referencia para la relacion 1 a 1 con CuentaBancaria (bidireccional)
    /* package-private */ CuentaBancaria cuenta; // ~ en UML

    // constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getDni()    { return dni; }

    // devuelvo la cuenta asociada (si tiene)
    public CuentaBancaria getCuenta() { return cuenta; }

    // relacion 1 a 1: sincronizo ambos lados
    public void setCuenta(CuentaBancaria nueva) {
        if (this.cuenta == nueva) return;
        CuentaBancaria anterior = this.cuenta;
        this.cuenta = nueva;
        if (anterior != null && anterior.getTitular() == this) {
            anterior.setTitular(null);
        }
        if (nueva != null && nueva.getTitular() != this) {
            nueva.setTitular(this);
        }
    }
}

