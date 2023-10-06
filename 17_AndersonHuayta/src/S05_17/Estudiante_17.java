
package S05_17;

import javax.swing.JOptionPane;

public class Estudiante_17 {


   String nombre;
    int edad;
    boolean aprobado;


  public Estudiante_17() {}

  public Estudiante_17(String nombre, int edad, boolean aprobado) {
    this.nombre = nombre;
    this.edad = edad;
    this.aprobado = aprobado;
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

  public boolean isAprobado() {
    return aprobado;
  }

  public void setAprobado(boolean aprobado) {
    this.aprobado = aprobado;
  }

  public void mostrarDatos() {
    JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nAprobado: " + aprobado);
  }
}
