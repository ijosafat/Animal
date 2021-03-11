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
class Perro extends Animales{
       String color_pelo;
   public void mostrar2(){
       mostrardatos(); //metodo heredado de Animales
       JOptionPane.showMessageDialog(null,color_pelo);
   }
   public void ingreso2()
   {
       ingresodatos(); //Metodo heredado de Animales
       JOptionPane.showInputDialog("ingrese color de pelo: ");
   }
}
