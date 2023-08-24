/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Operaciones {

    public static void main(String[] args) {
        //Variables para almacenar los datos de entrada
        float num1;
        float num2;

        
        //Variables para almacenar las operaciones
        float suma;
        float resta;
        float multi;
        float div;
        

        
        //Convertir los datos de entrada a enteros
        num1 = Float.parseFloat(JOptionPane.showInputDialog ("Escriba el primer numero:"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog ("Escriba el Segundo numero:"));

        
        //Hacer las operaciones 
        suma = num1 + num2 ;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1/num2;
        
        //Imprimir los resultados
        JOptionPane.showMessageDialog (null,"Los numeros ingresados fueron: " + num1 + "   " + num2 + "\n"
        + "Suma: " + suma + "\nResta: " + resta + "\nMiltiplicacion: " + multi + "\nDivision: " + div, "Resultado", JOptionPane.PLAIN_MESSAGE);
         
    }
}
