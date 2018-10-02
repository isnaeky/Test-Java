/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.certificatic.persona;

import javax.swing.JOptionPane;

/**
 *
 * @author Isnaeky Treiny
 */
public class Persona {
    public String nombre;
    public static int edad;
    public String RFC;
    public String sexo;
    public static float peso;
    public static float altura;
    
    public static void main(String[] args) {
        Persona obj=new Persona();
        
         JOptionPane.showMessageDialog(null, "Resultado De Masa Corporal: "+obj.IMC(altura, peso));
         JOptionPane.showMessageDialog(null, ""+obj.esMayorDeEdad(edad));
        JOptionPane.showMessageDialog(null, "Tu RFC es: "+obj.RFC());
    }
    
    public Persona(){
        nombre =JOptionPane.showInputDialog("Introduce tu Nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Edad"));
        peso=Float.parseFloat(JOptionPane.showInputDialog("Introduce su peso"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce su Altura"));        
    }
    public float IMC(float altura,float peso){
        return (peso/(altura*2));
    }
    public String esMayorDeEdad(int edad){
        if (edad >=18){
            return "Es Mayor de edad";
        }else{
            return "Es Menor de edad";        
        }
    }
    public String RFC(){
        
        return "";
    }
}
