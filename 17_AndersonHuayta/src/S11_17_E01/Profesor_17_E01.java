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
public class Profesor_17_E01 extends Persona_17_E01 {

    public Profesor_17_E01(int aniosExperiencia, String curso, int dni, String nombre, int edad) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.curso = curso;
        this.dni = dni;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   
    
    
    int aniosExperiencia;
    String curso;
    int dni;
    
    public void darClase(){
    System.out.println("estoy dando clases");
    }
    public void revisarTarea(){
    System.out.println("Estoy revisando las tareas");
    }
}
