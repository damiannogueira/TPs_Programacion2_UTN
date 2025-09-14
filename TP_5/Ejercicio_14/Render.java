/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14;

/**
 *
 * @author Damian Nogueira
 */

public class Render {
    
    private String formato;

    // referencia a Proyecto (asociacion unidireccional Render -> Proyecto)
    private Proyecto proyecto;

    public Render(String formato) { this.formato = formato; }

    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
    public void setProyecto(Proyecto proyecto) { this.proyecto = proyecto; }
}

