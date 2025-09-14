/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author Damian Nogueira
 */

public class CuentaBancaria {
    
    private String cbu;
    private double saldo;

    // relaciones
    private ClaveSeguridad claveSeguridad; // Composicion: CuentaBancaria -> ClaveSeguridad
    private Titular titular;               // Asociacion bidireccional 1 a 1

    // constructor
    public CuentaBancaria(String cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
    }

    // getters basicos
    public String getCbu()   { return cbu; }
    public double getSaldo() { return saldo; }

    // relacion: composicion con ClaveSeguridad (parte inseparable)
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        // en composicion, la clave pertenece a esta cuenta
        this.claveSeguridad = claveSeguridad;
    }

    // relacion: asociacion bidireccional con Titular
    public Titular getTitular() { return titular; }
    public void setTitular(Titular nuevo) {
        if (this.titular == nuevo) return;
        Titular anterior = this.titular;
        this.titular = nuevo;
        if (anterior != null && anterior.getCuenta() == this) {
            anterior.setCuenta(null);
        }
        if (nuevo != null && nuevo.getCuenta() != this) {
            nuevo.setCuenta(this);
        }
    }
}

