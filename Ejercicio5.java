/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo; ");
        float Radio = input.nextFloat();
        float Area = (float) (Math.PI*Math.pow(Radio, 2));
        float Circunferencia = (float) (2*Math.PI*Radio);
        
        System.out.println("El Area de la circunferencia es: "+ Area);
        System.out.println("El Perimetro de la circunferencia es: "+ Circunferencia);
    }
}
