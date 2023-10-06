
package S05_17;

public class Main_S05_17 {

 
      public static void main(String[] args) {
      
        Estudiante_17 estudiante = new Estudiante_17("Anderson", 18, false);
 
        estudiante.mostrarDatos();
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
        System.out.println("¿Está aprobado? " + estudiante.isAprobado());

       
        Libro_17 libro = new Libro_17("la ciudad y los perro", "Mario vargas llosa", 49);
        System.out.println("\nTítulo del libro: " + libro.getTitulo());
        System.out.println("Autor del libro: " + libro.getAutor());
        System.out.println("Precio del libro: " + libro.getNumeroEjemplares());
    }
}