/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_17_E01;

/**
 *
 * @author ander
 */
public class Main_S11_17_E01 {
    
    public static void main(String[] args) {
        
    
     Empleado_17_E01 objempleado = new Empleado_17_E01("gloria", "gerente" , 12, "jose", 17);
     objempleado.trabajar();
     objempleado.datos();
            
    Profesor_17_E01 objProfesor = new Profesor_17_E01(23, "comunicacion" , 77457866, "jose", 45);
    objProfesor.darClase();
    objProfesor.revisarTarea();
    
    Estudiante_17_E01 objEstudiante = new Estudiante_17_E01("17", 2 , "Sistemas", "jose", 21);
    objEstudiante.estudiar();
    objEstudiante.aprender();
        
    }
    }

