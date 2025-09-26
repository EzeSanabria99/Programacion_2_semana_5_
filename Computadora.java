/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // Composición
    private final Propietario propietario;
    
    public Computadora(String marca, String numeroSerie, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placaMadre = new PlacaMadre("ModeloX", "ChipsetY");
        propietario.setComputadora(this);
    }
    
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
}
