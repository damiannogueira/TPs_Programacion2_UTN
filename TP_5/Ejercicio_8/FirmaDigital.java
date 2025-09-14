/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author Damian Nogueira
 */

public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;

    // referencia para la relacion de agregacion: FirmaDigital -> Usuario
    private Usuario usuario;

    // creo la firma con su hash y fecha
    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    // getters basicos
    public String getCodigoHash() { return codigoHash; }
    public String getFecha()      { return fecha; }

    // relacion con Usuario (agregacion: se puede cambiar)
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}

