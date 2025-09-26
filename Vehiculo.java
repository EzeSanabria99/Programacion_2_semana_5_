/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // Agregación
    private Conductor conductor; // Asociación bidireccional
    
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }
    
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
}
