
package S05_17;


public class Libro_17 {


 String titulo;
 String autor;
   int precio;
  


  public Libro_17() {}

  public Libro_17(String titulo, String autor, int precio) {
    this.titulo = titulo;
    this.autor = autor;
    this.precio = precio;
  }


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumeroEjemplares() {
    return precio;
  }

  public void precio(int precio) {
    this.precio = precio;
  }
}