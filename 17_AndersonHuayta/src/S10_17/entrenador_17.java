/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_17;

/**
 *
 * @author ander
 */
public class entrenador_17 extends seleccionFutbol_17 {
   
    
    
    private String idFederacion;
    
    
    
    public void dirigirPartido(){
    
    }
    public void dirigirEntrenamiento(){
        System.out.println(Nombre + " Es el entrenador");
    }

    public entrenador_17(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
}
    

