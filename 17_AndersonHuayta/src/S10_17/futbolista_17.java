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
public class futbolista_17 extends seleccionFutbol_17{
   
   
  public futbolista_17() {
		super();
	}

	public futbolista_17(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
   

    private int dorsal;
    private String demarcacion;
    
    public void jugarPartido(){
        System.out.println(getNombre() + " El esta jugando partido");
    
    }
    
    public void entrenar(){
        System.out.println(getNombre() + " esta entrenando");
    }
    
}
