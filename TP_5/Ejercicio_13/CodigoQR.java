/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author Damian Nogueira
 */

public class CodigoQR {
    
    private String valor;

    // referencia para la asociacion unidireccional: CodigoQR -> Usuario
    private Usuario usuario;

    // constructor con el valor
    public CodigoQR(String valor) {
        this.valor = valor;
    }

    // getters/setters basicos
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
