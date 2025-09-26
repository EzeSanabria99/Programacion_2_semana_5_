/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario_2 usuario_2;    // Agregación
    
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario_2 = usuario_2;
    }
    
    public String getCodigoHash() { return codigoHash; }
    public Usuario_2 getUsuario_2() { return usuario_2; }
}
