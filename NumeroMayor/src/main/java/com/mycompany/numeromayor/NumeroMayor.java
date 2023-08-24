/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayor;

import javax.swing.JOptionPane;
import java.math.*;
/**
 *
 * @author alexi
 */
public class NumeroMayor {

    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog ("Escriba el primer numero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog ("Escriba el Segundo numero:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog ("Escriba el tercer numero:"));
        
        int max = Math.max(num1, Math.max(num2, num3));
        
        JOptionPane.showMessageDialog ( null, "El numero mayor es: " + max, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
