/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ofertaproducto;
import javax.swing.JOptionPane;
/**
 *
 * @author alexi
 */
public class OfertaProducto {

    public static void main(String[] args) {
        /*Una tienda ha puesto en oferta la venta de un producto, ofreciendo 15% de descuento por la compra de 3 docenas exactas y 10% en caso contrario. 
        Además por la compra de más de 3 docenas se obsequia una unidad por cada docena en exceso sobre 3. Diseñe un programa que determine 
        el monto de la compra, el monto de descuento y el número de unidades de obsequio para cada uno de los 10 clientes que se atendieron en el día.*/
        
        //Constantes
        final int docena = 12;
        final double Descuento1 = 0.15;
        final double Descuento2 = 0.10;
        final int obsequio = 1;
        final double precioDocena = 15;
        double descuento;
        double monto;
        double precioTotal;
        
        
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas docenas del producto en oferta desea llevar): "));
        int obsequios = cantidad - 3;
        int contador = 0;
        
        for (int i = 0; i < 10; i++) {
            
            if (cantidad == 3) {
                monto = precioDocena * cantidad;
                descuento = monto * Descuento1;
                precioTotal = monto - descuento;

                JOptionPane.showMessageDialog(null, "Monto de la compra: $ " + monto + "\nDescuento: " + descuento
                        + "\nUnidades obsequidas: " + obsequios + "\nTotal: $ " + precioTotal, "Resultado", JOptionPane.PLAIN_MESSAGE);
            } else if (cantidad > 3) {
                monto = precioDocena * cantidad;
                descuento = monto * Descuento2;
                precioTotal = monto - descuento;

                JOptionPane.showMessageDialog(null, "Monto de la compra: $ " + monto + "\nDescuento: " + descuento
                        + "\nUnidades obsequidas: " + obsequios + "\nTotal: $ " + precioTotal, "Resultado", JOptionPane.PLAIN_MESSAGE);

            } else {
                monto = precioDocena * cantidad;
                descuento = monto * Descuento2;
                precioTotal = monto - descuento;

                JOptionPane.showMessageDialog(null, "Monto de la compra: $ " + monto + "\nDescuento: " + descuento
                        + "\nUnidades obsequidas: " + obsequios + "\nTotal: $ " + precioTotal, "Resultado", JOptionPane.PLAIN_MESSAGE);
            }
            contador ++;

        }

    }
}
