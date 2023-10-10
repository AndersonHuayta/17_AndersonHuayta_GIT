/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_17_E02;

/**
 *
 * @author ander
 */
public class Servivo_17_E02 {

    public Servivo_17_E02(String nombre) {
        this.nombre = nombre;
    }
   


//CLASE PADRE 
    String nombre;
    
    
    public void comer(){
        System.out.println(nombre + " come");
    }
    
}
