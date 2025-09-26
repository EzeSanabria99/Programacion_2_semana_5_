/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;       // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional
    
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
}
