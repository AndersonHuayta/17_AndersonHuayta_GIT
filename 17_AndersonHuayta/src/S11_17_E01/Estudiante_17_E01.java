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
public class Estudiante_17_E01 extends Persona_17_E01 {

    public Estudiante_17_E01(String numeroDeOrden, int Semestre, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numeroDeOrden = numeroDeOrden;
        this.Semestre = Semestre;
        this.carrera = carrera;
    }

    public String getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(String numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    String numeroDeOrden;
    int Semestre;
    String carrera;
    
    public void estudiar(){
    System.out.println("Estoy estudiando para la  carrera " + carrera);
    }
    
    public void aprender(){
    System.out.println("Estoy aprendiendo para poder tener un futuro");
    }
}
