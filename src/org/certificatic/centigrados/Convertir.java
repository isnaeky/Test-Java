/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.certificatic.centigrados;

import javax.swing.JOptionPane;

/**
 *
 * @author Isnaeky Treiny
 */
public class Convertir {

    static double centigrados;

    public static void main(String[] args) {
        centigrados=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce los centigrados"));
        Convertir obj=new Convertir();
        JOptionPane.showMessageDialog(null, "Centígrados: "+centigrados +"\nResultado Fahrenheit: "+obj.datos(centigrados));
    }

    public double datos(double centigrados) {
        double f;
        f=((centigrados*9)/5)+32;
        return f;
    }

}
