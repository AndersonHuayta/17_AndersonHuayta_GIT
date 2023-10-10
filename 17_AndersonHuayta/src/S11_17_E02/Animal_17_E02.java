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
public class Animal_17_E02 extends Servivo_17_E02{

    public Animal_17_E02(String nombre) {
        super(nombre);
    }
    @Override //el override sirve para decirle que estamos sobreescriendo de la clase padre
     public void comer(){
        System.out.println(nombre + " traga");
    }
    
    
}
