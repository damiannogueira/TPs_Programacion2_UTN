/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_14;

/**
 *
 * @author Damian Nogueira
 */

public class Principal {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("Video Clip", 7);
        EditorVideo ev = new EditorVideo();

        // dependencia de creacion: el editor crea el Render adentro de exportar
        ev.exportar("MP4", p1);
    }
}

