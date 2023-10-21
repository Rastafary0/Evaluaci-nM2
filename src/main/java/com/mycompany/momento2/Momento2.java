/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.momento2;

/**
 *
 * @author alexander
 */

public class Momento2 {

    public static void main(String[] args) {
       
          
        
        Cuadrado cuadrado = new Cuadrado("Verde", 8);
        Circulo circulo = new Circulo("Naranja", 15);

        System.out.println("El area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("El area pi del círculo: " + circulo.calcularArea());
    }
    }