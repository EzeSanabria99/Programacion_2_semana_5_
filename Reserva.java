/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente_2 cliente_2;     // Asociación unidireccional
    private Mesa mesa;          // Agregación
    
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente_2 = cliente_2;
        this.mesa = mesa;
    }
    
    public Cliente_2 getCliente() { return cliente_2; }
    public Mesa getMesa() { return mesa; }
}
