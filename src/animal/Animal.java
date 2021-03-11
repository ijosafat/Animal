/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Myke
 */
import javax.swing.JOptionPane;
public class Animal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animales anml = new Animales(); //Objeto tipo animales
        Perro prro = new Perro(); //objeto tipo perro
        Gallo gllo = new Gallo(); //objeto tipo gallo
        JOptionPane.showMessageDialog(null,"Animales");
        //Utilizando los metodos de Animales
        anml.ingresodatos();
        anml.mostrardatos();
        JOptionPane.showMessageDialog(null,"Perro");
        //usando los metodos de perro
        prro.ingreso2();
        prro.mostrar2();
        //usando los metodos de gallo
        JOptionPane.showMessageDialog(null,"Gallo");
        gllo.ingreso3();
        gllo.mostrar3();
    }
}
