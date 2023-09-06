/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciafor;

import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class SentenciaFor {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++)
        {
            JOptionPane.showMessageDialog(null, "Contador : " + i, "Resultador", JOptionPane.PLAIN_MESSAGE);
        }// fin del for
    }
}
