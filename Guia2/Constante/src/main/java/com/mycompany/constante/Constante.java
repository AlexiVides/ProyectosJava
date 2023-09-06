/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constante;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Constante {

    public static void main(String[] args) {
        
        final double pi = 3.1415926535;
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog ("Ingrese el radio del circulo:"));
        
        double area = pi * radio * radio;
        
        double volumen = (4/3) * pi * Math.pow(radio, 3);
        
        JOptionPane.showMessageDialog ( null, "El area del circulo es: " + area + "\nEl volumen es: " + volumen, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
