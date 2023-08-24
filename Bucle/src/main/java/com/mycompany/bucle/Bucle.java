/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucle;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Bucle {

    public static void main(String[] args) {
        String nombre;
        int numero;
        
        int contador = 0;
        
        nombre = JOptionPane.showInputDialog ("Escriba una palabra:");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces quiere que se repita:"));
        
        StringBuilder resultado = new StringBuilder();
        
       while(contador < numero){
           resultado.append(nombre).append("\n");
           contador ++;
       }
       
       JOptionPane.showMessageDialog ( null, resultado.toString(), "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
