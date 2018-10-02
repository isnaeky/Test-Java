/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.certificatic.palabras;

import javax.swing.JOptionPane;

/**
 *
 * @author Isnaeky Treiny
 */
public class Cadena {
    public static String ca;
    public static void main(String[] args) {
         ca =JOptionPane.showInputDialog("Introduce tu Texto");
         Cadena obj=new Cadena();
          JOptionPane.showMessageDialog(null, "Texto Minusculas: "+obj.palabras(ca));
    }
    
    public String palabras(String ca){
        return ca.toLowerCase();
    }
}