/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9;

/**
 *
 * @author Damian Nogueira
 */

public class CitaMedica {
    
    private String fecha;
    private String hora;

    // referencias para las relaciones (ambas unidireccionales)
    private Paciente paciente;         // CitaMedica -> Paciente
    private Profesional profesional;   // CitaMedica -> Profesional

    // creo la cita con fecha y hora
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    // getters de datos propios
    public String getFecha() { return fecha; }
    public String getHora()  { return hora; }

    // relacion: Paciente (unidireccional: solo CitaMedica conoce a Paciente)
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    // relacion: Profesional (unidireccional: solo CitaMedica conoce a Profesional)
    public Profesional getProfesional() { return profesional; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }
}

