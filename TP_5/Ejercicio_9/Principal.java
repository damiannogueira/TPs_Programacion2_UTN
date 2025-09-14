/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author Damian Nogueira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // creo paciente y profesional (objetos segun el enunciado)
        Paciente pa1 = new Paciente("Damian Nogueira", "OSDE");
        Profesional pr1 = new Profesional("Dra. Lopez", "Clinica");

        // creo la cita
        CitaMedica cm1 = new CitaMedica("2025-09-25", "10:30");

        // relaciones pedidas por la consigna
        cm1.setPaciente(pa1);       // asociacion unidireccional CitaMedica -> Paciente
        cm1.setProfesional(pr1);    // asociacion unidireccional CitaMedica -> Profesional

        // chequeo rapido (opcional)
        System.out.println("Cita: " + cm1.getFecha() + " " + cm1.getHora()
                + " | Paciente: " + cm1.getPaciente().getNombre()
                + " | Profesional: " + cm1.getProfesional().getNombre());
    }
}
