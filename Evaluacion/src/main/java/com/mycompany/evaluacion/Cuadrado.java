/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author estef
 */
class Cuadrado extends FiguraGeometrica {
    public double lado;
    

    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    double calcularArea(){
        return lado*lado;
    }

    
    
    
    
}
