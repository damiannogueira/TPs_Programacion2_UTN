/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

/**
 *
 * @author Damian Nogueira
 */

public class Documento {
    
    private String titulo;
    private String contenido;

    // relacion de composicion: Documento -> FirmaDigital (parte inseparable)
    private FirmaDigital firmaDigital;

    // creo el documento con su titulo y contenido
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // getters basicos
    public String getTitulo()    { return titulo; }
    public String getContenido() { return contenido; }

    // relacion: seteo la firma digital (composicion)
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    public void setFirmaDigital(FirmaDigital firmaDigital) {
        // en composicion, la firma pertenece a este documento
        this.firmaDigital = firmaDigital;
    }
}

