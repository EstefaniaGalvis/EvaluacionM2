/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion;

/**
 *
 * @author estef
 */
public class Evaluacion {

    public static void main(String[] args) {
        
        Cuadrado c1 = new Cuadrado (4, "Rojo");
       
        System.out.println(c1.calcularArea());
        
        Circulo ci1 = new Circulo(5, "Amarillo");
        
        System.out.println(ci1.calcularArea());
       
    }
}
