/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Circulo {

    public static void main(String[] args) {
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog ("Ingrese el radio del circulo:"));
        
        double area = Math.PI * radio * radio;
        
        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
        
        JOptionPane.showMessageDialog ( null, "El area del circulo es: " + area + "\nEl volumen es: " + volumen, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
