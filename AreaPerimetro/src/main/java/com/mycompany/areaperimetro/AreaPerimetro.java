/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaperimetro;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class AreaPerimetro {

    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog ("Ingrese la altura del rectangulo:"));
        double base = Double.parseDouble(JOptionPane.showInputDialog ("Ingrese la base del rectangulo:"));
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        JOptionPane.showMessageDialog ( null, "Altura : " + altura + "\nBase: " + base + 
                "\nEl area del rectangulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
