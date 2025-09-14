/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // creo los objetos del enunciado
        Motor m1 = new Motor("Nafta 1.6", "SN-MOT-001");
        Conductor c1 = new Conductor("Damian Nogueira", "B2-AR-2025");
        Vehiculo v1 = new Vehiculo("AB123CD", "Peugeot 208");

        // relaciones pedidas
        v1.setMotor(m1);       // agregacion Vehiculo -> Motor
        v1.setConductor(c1);   // asociacion bidireccional 1 a 1

        // chequeo rapido
        System.out.println("Vehiculo " + v1.getPatente() + " / " + v1.getModelo());
        System.out.println("Motor: " + (v1.getMotor() != null ? v1.getMotor().getNumeroSerie() : "sin motor"));
        System.out.println("Conductor: " + (v1.getConductor() != null ? v1.getConductor().getNombre() : "sin conductor"));
    }
}

