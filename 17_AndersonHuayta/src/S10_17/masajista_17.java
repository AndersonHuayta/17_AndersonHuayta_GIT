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
public class masajista_17 extends seleccionFutbol_17 {

    public masajista_17(String Titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }


	private String Titulacion;
	private int aniosExperiencia;

	

	public void darMasaje() {
            System.out.println(getNombre() + " dar masaje");
	}
}
