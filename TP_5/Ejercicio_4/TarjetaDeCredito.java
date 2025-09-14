/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author Damian Nogueira
 */

public class TarjetaDeCredito {
    // atributos del enunciado
    private String numero;
    private String fechaVencimiento;

    // referencias para las relaciones del ejercicio
    private Cliente cliente; // asociación bidireccional 1–1
    private Banco banco;     // agregación 1–1

    // creo la tarjeta con sus datos
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    // getters de los datos de la tarjeta
    public String getNumero()            { return numero; }
    public String getFechaVencimiento()  { return fechaVencimiento; }

    // relación con banco (agregación: se puede cambiar)
    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    // relación con cliente (bidireccional 1–1)
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente nuevo) {
        if (this.cliente == nuevo) return;
        Cliente anterior = this.cliente;
        this.cliente = nuevo;
        if (anterior != null && anterior.getTarjeta() == this) {
            anterior.setTarjeta(null);
        }
        if (nuevo != null && nuevo.getTarjeta() != this) {
            nuevo.setTarjeta(this);
        }
    }
}
