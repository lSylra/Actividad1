/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author USER
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        float Horas = 48;
        float Salario = 5000;
        float Retencion = (float) 0.125;
        
        float SalarioBruto = Horas*Salario;
        float Fuente = SalarioBruto*Retencion;
        float SalarioNeto = SalarioBruto-Fuente;
        
        System.out.println("El Salario Bruto es " + SalarioBruto);
        System.out.println("La retencion en la fuente es "+ Fuente);
        System.out.println("El salario neto del trabajador es "+ SalarioNeto);
    }
}
