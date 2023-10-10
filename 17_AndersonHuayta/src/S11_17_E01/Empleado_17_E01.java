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
public class Empleado_17_E01 extends Persona_17_E01 {

    public Empleado_17_E01(String Empresa, String cargo, int aniosExperiencia, String nombre, int edad) {
        super(nombre, edad);
        this.Empresa = Empresa;
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    
    String Empresa;
    String cargo;
    int aniosExperiencia;
    
    
    public void trabajar(){
        System.out.println("Estoy trabajando en " + Empresa + "Como" + cargo);
    }
    public void datos(){
        System.out.println("Estoy entregando los datos de mi proyecto");
    }
}
