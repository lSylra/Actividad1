/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Juan = input.nextInt();
        int Alberto;
        int Ana;
        int Madre;
        
        Alberto = (Juan/3)*2;
        Ana = (Juan/3)*4;
        Madre = Juan + Ana + Alberto;
        
        System.out.println("La edad de Juan es " + Juan);
        System.out.println("La edad de Alberto es " + Alberto);
        System.out.println("La edad de Ana es " + Ana);
        System.out.println("La edad de la madre es " + Madre);
        
        
        
    }
}
