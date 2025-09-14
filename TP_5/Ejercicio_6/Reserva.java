/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author Damian Nogueira
 */

public class Reserva {
    
    private String fecha;
    private String hora;

    // referencias para las relaciones
    private Cliente cliente; // Asociacion unidireccional: Reserva -> Cliente
    private Mesa mesa;       // Agregacion: Reserva -> Mesa

    // creo la reserva con fecha y hora
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    // getters de datos propios
    public String getFecha() { return fecha; }
    public String getHora()  { return hora; }

    // relacion: Cliente (unidireccional, solo Reserva conoce a Cliente)
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    // relacion: Mesa (agregacion, se puede cambiar)
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
}
