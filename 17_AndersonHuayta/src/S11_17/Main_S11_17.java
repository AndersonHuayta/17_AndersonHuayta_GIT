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
public class Main_S11_17 {
    
    public static void main(String[] args) {
        
        Estudiante_17 objEstudiante = new Estudiante_17("Sistemas", 20 , 2, "jose", 17);
        
        objEstudiante.hablar();
        objEstudiante.escuchar();
        objEstudiante.caminar();
        objEstudiante.getNombre();
        objEstudiante.getEdad();
    }
}
