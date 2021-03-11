/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author Myke
 */
class Gallo extends Animales{

    String color_plumas;

    public void mostrar3() {
        mostrardatos(); //metodo heredado de Animales
        JOptionPane.showMessageDialog(null, color_plumas);
    }

    public void ingreso3() {
        ingresodatos(); //Metodo heredado de Animales
        JOptionPane.showInputDialog("ingrese color de plumas: ");
    }
}
