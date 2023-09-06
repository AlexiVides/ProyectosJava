/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descuentos;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Descuentos {

    public static void main(String[] args) {
        /*Diseñe un programa en java que calcule los descuentos a un trabajador sabiendo que son aplicables un 6.25% del salario en AFP 
        solo si este es superior a $300.00. Además, si es un trabajador hombre se le descuenta aparte del AFP, el 3% sobre el sueldo en conceptos de
        ISSS y 10% en concepto de RENTA y si es mujer se le descuenta solamente un 2% en concepto de ISSS.*/
        
        //Variables ingresadas por el usuario
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog ("Ingrese su sueldo: "));
        
        String genero = (JOptionPane.showInputDialog ("Cual es su genero (hombre o mujer): "));
        
        //constantes
        final double AFP = sueldo * 0.0625;
        final double SinAFP = 0;
        final double ISSS = sueldo * 0.03;
        final double Renta = sueldo * 0.10;
        final double RentaM = 0;
        final double ISSSM = sueldo * 0.02;
        double descuento;
        double SueldoFinal;

        
        switch (genero) {
            case "hombre":
                if (sueldo > 300) {
                    descuento = AFP + ISSS + Renta;
                    SueldoFinal = sueldo - descuento;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: " + sueldo + "\nDescuento de AFP: " + AFP + "\nDescuento de ISSS: " + ISSS
                        + "\nDescuento de Renta: " + Renta + "\nDescuento Total: " + descuento + "\nSaldo total: " + SueldoFinal, "Resultado", JOptionPane.PLAIN_MESSAGE);
                } else {
                    descuento = ISSS + Renta;
                    SueldoFinal = sueldo - descuento;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: " + sueldo + "\nDescuento de AFP: " + SinAFP + "\nDescuento de ISSS: " + ISSS
                        + "\nDescuento de Renta: " + Renta + "\nDescuento Total: " + descuento + "\nSaldo total: " + SueldoFinal, "Resultado", JOptionPane.PLAIN_MESSAGE);
                }
                

                break;

            case "mujer":
                if (sueldo > 300) {
                    descuento = AFP + ISSSM;
                    SueldoFinal = sueldo - descuento;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: " + sueldo + "\nDescuento de AFP: " + AFP + "\nDescuento de ISSS: " + ISSSM
                        + "\nDescuento de Renta: " + RentaM + "\nDescuento Total: " + descuento + "\nSaldo total: " + SueldoFinal, "Resultado", JOptionPane.PLAIN_MESSAGE);
                } else {
                    descuento = ISSSM;
                    SueldoFinal = sueldo - descuento;
                    
                    JOptionPane.showMessageDialog(null, "Sueldo: " + sueldo + "\nDescuento de AFP: " + SinAFP + "\nDescuento de ISSS: " + ISSSM
                        + "\nDescuento de Renta: " + RentaM + "\nDescuento Total: " + descuento + "\nSaldo total: " + SueldoFinal, "Resultado", JOptionPane.PLAIN_MESSAGE);
                }
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
