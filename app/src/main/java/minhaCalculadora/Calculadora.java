/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhaCalculadora;

/**
 *
 * @author Admin
 */
public class Calculadora {
    public double somar (double a, double b){
        return a + b;
    }
    
    public double subtrai (double a, double b){
        return a - b;
    }
    public double multiplicar (double a, double b){
        return a * b;
    
}
    public double divisao (double a, double b){
        if (a == 0){
            return 0;
        }
        else {
            return a / b;
        }
    }
}        