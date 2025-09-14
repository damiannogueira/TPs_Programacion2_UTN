/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author Damian Nogueira
 */

public class Impuesto {
    
    private double monto;

    // referencia para la asociacion unidireccional: Impuesto -> Contribuyente
    private Contribuyente contribuyente;

    // creo el impuesto con su monto
    public Impuesto(double monto) {
        this.monto = monto;
    }

    // getters/setters basicos
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
    public void setContribuyente(Contribuyente contribuyente) { this.contribuyente = contribuyente; }
}

