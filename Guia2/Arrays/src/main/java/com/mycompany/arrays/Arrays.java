/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Arrays {

    public static void main(String[] args) {
        
        String abcdario = "abcdefghijklmnopqrstuvwxyz"; // Arreglo de letras del alfabeto
        
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");
        nombre = nombre.toLowerCase(); // Convertir el nombre a minúsculas para comparar con el alfabeto

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < nombre.length(); i++) {
            char letraNombre = nombre.charAt(i);
            int posicion = abcdario.indexOf(letraNombre) + 1;

            // Verificar si la letra está en el alfabeto
            if (posicion != 0) {
                resultado.append(letraNombre).append(" posición ").append(posicion).append("\n");
            } else {
                resultado.append(letraNombre).append(" no está en el abcdario\n");
            }
        }

        // Mostrar el resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

