/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_17;

/**
 *
 * @author ander
 */
public class Estudiante_17 extends Persona_17 {

    public Estudiante_17(String carrera, int numeroDeOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroDeOrden = numeroDeOrden;
        this.ciclo = ciclo;
    }
    
    
    
    
    String carrera;
    int numeroDeOrden;
    int ciclo;
    
}
