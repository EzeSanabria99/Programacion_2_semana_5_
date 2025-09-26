/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Celular {
    private final Bateria bateria; // Agregación
    private final Usuario usuario; // Asociación bidireccional
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    }
    
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
}