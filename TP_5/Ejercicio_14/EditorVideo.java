/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14;

/**
 *
 * @author Damian Nogueira
 */

public class EditorVideo {
    // dependencia de creacion: crea el Render dentro del método y no lo guarda
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato);   // creo el render aca
        r.setProyecto(proyecto);          // lo asocio al proyecto

        // ejemplo de uso inmediato (sout de verificacion)
        System.out.println("Exportando proyecto '" + proyecto.getNombre()
                + "' (" + proyecto.getDuracionMin() + " min) en formato " + r.getFormato());
        // fin del metodo: 'r' no queda almacenado en ningun atributo
    }
}

