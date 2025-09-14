/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo los objetos que pide el enunciado
        Propietario p1 = new Propietario("Damian Nogueira", "12345678");
        PlacaMadre pm1 = new PlacaMadre("B550-A Pro", "AMD B550");
        Computadora pc1 = new Computadora("MSI", "SN-001-ABC");

        // relaciones 
        pc1.setPlacaMadre(pm1);  // composicion Computadora -> PlacaMadre
        pc1.setPropietario(p1);  // asociacion bidireccional 1 a 1

        // chequeos simples
        System.out.println(pc1.getPropietario() != null ? pc1.getPropietario().getNombre() : "sin propietario");
        System.out.println(p1.getComputadora() != null ? p1.getComputadora().getNumeroSerie() : "sin computadora");
        System.out.println(pc1.getPlacaMadre() != null ? pc1.getPlacaMadre().getModelo() : "sin placa madre");
    }
}
