/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author estef
 */
abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica (String color) {
        this.color = color;
    }
    
    abstract double calcularArea();
}
