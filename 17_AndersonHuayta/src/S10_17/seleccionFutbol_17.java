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
public class seleccionFutbol_17 {
    
    public seleccionFutbol_17() {
	}

	public seleccionFutbol_17(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}
        
        protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;

	public void Concentrarse() {
            System.out.println(getNombre() + " se esta concentrando");
	}

	public void Viajar() {
            System.out.println("El viaje comenzo " + getNombre());
		
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
        
}
