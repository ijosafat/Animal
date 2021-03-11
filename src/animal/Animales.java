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
public class Animales {
private String nombre;
private int edad;
private String alimento;

//Metodo mostrar el contenido de los atributos
public void mostrardatos()
{
    JOptionPane.showConfirmDialog(null,nombre+"\n"+edad+"\n"+alimento);
}
//Metodo para ingresar datos a los atributos
public void ingresodatos()
{
    nombre=JOptionPane.showInputDialog("ingrese el nombre: ");
    String e = JOptionPane.showInputDialog("ingrese la edad: ");
    alimento=JOptionPane.showInputDialog("ingrese el alimento: ");
    edad=Integer.parseInt(e);
}
}
