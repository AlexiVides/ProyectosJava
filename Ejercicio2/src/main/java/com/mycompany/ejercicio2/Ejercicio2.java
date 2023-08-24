/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import javax.swing.JOptionPane;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
/**
 *
 * @author alexi
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        
        
        nombre = JOptionPane.showInputDialog ("Escriba su nombre:");
        apellido = JOptionPane.showInputDialog("Esciba su apellido:");
       
        LocalDate fechaActual = LocalDate.now();
        String fechaFormat = fechaActual.format(DateTimeFormatter.ofPattern("d LLLLL yyyy"));
        
        
        JOptionPane.showMessageDialog( null, "Su nombre completo es: " + nombre +" " + apellido + " " + fechaFormat , "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
