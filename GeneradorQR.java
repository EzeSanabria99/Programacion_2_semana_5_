/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class GeneradorQR {
   
    
    public CodigoQR generar(String valor, Usuario_3 usuario_3) {
        CodigoQR qr = new CodigoQR(valor, usuario_3); 
        System.out.println("QR generado para: " + usuario_3.getNombre());
        return qr; 
    }
}
