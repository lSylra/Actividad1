/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un Numero: ");
        float X = input.nextFloat();
        float Cuadrado = X*X;
        float Cubo = X*X*X;
        
        System.out.println("El cuadrado del numero es: " + Cuadrado);
        System.out.println("El Cubo del numero es : "+ Cubo);
    }
}
