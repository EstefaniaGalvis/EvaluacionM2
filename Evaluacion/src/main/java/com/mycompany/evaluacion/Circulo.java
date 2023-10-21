/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author estef
 */
class Circulo extends FiguraGeometrica {

    public double radio;
    public double pi = 3.141592;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
   

    @Override
    double calcularArea(){
        return pi * Math.pow(radio, 2);
    }
    
    
    
}
