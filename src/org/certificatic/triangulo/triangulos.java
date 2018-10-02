/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.certificatic.triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Isnaeky Treiny
 */
public class triangulos {

    public static void main(String[] args) {
        int base;
        int altura;
        base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base del triangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
        if (base <= 0 | altura <= 0) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        } else {
            triangulos triangulo = new triangulos();
            JOptionPane.showMessageDialog(null, "Resultado Area: "+triangulo.area(base, altura));
            JOptionPane.showMessageDialog(null, "Resultado Perimetro: "+triangulo.perimetro(base));
        }
    }

    public double area(double base, double altura) {
        return ((base * altura) / 2);
    }

    public double perimetro(double base) {
        return base * 3;
    }
}
