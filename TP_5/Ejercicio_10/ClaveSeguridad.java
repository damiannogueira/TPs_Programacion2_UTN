/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author Damian Nogueira
 */

public class ClaveSeguridad {
   
    private String codigo;
    private String ultimaModificacion;

    // constructor
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // getters simples
    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
}
