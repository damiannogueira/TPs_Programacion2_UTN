/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author Damian Nogueira
 */

public class Cliente {
    
    private String nombre;
    private String dni;

    // referencia para la relación con la tarjeta (bidireccional)
    /* package-private */ TarjetaDeCredito tarjeta; // ~ en UML

    // creo el cliente con sus datos
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // getters simples
    public String getNombre() { return nombre; }
    public String getDni()    { return dni; }

    // devuelvo la tarjeta asociada (si tiene)
    public TarjetaDeCredito getTarjeta() { return tarjeta; }

    // relación 1 a 1 con Tarjeta: mantengo ambos lados sincronizados
    public void setTarjeta(TarjetaDeCredito nueva) {
        if (this.tarjeta == nueva) return;
        TarjetaDeCredito anterior = this.tarjeta;
        this.tarjeta = nueva;
        if (anterior != null && anterior.getCliente() == this) {
            anterior.setCliente(null);
        }
        if (nueva != null && nueva.getCliente() != this) {
            nueva.setCliente(this);
        }
    }
}

