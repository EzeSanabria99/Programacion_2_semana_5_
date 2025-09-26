/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición
    
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(
            "hash_" + titulo.hashCode(), 
            "2024-01-01", 
            new Usuario_2("Sistema", "sistema@empresa.com")
        );
    }
    
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
}