/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Calculadora {
   
    
    public void calcular(Impuesto impuesto) { 
        double total = impuesto.getMonto() * 1.21; // IVA 21%
        System.out.println("Impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("Total a pagar: $" + total);
    }
}