/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author Damian Nogueira
 */

public class PlacaMadre {
    
    private String modelo;
    private String chipset;

    // constructor con los datos de la placa
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // getters simples
    public String getModelo() { return modelo; }
    public String getChipset() { return chipset; }
}

