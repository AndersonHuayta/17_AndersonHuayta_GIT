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
public class Persona_17_E01 {

    public Persona_17_E01(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    private String nombre;
    private int edad;
    
    
    
    public void hablar(){
     System.out.println("Estoy hablando");
     }
    public void escuchar(){
        System.out.println("Estoy escuchando");
    }
}

