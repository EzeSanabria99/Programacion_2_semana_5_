/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Libro {
    private final String titulo;
    private final String isbn;
    private final Autor autor;         // Asociación unidireccional
    private final Editorial editorial; // Agregación
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
}
