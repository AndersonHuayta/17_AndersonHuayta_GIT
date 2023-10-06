
package S08_17;

import javax.swing.JOptionPane;


public class Auto_17 {
    String modelo;
    String marca;
    String color;
    int km;
    public void preguntar(){
    modelo = JOptionPane.showInputDialog("Cual es el modelo? ") ;
    marca = JOptionPane.showInputDialog("Cual es la marca del auto? ") ;
    color = JOptionPane.showInputDialog("Cual es el color del auto? ") ;
    int km = Integer.parseInt(JOptionPane.showInputDialog("cuanto kilometros por hora va "));
 
    }
   public void responde(){
   JOptionPane.showMessageDialog(null,"El Carro es: " + modelo + "  kilometro por hora de: " + km + "Su color es: " + color + "Su marca del carro es: "+marca);
  
    }
   
}
