
package S10_17;

/**
 *
 * @author ander
 */

import java.util.ArrayList;


public class Main_S10_17 {

    public static ArrayList<seleccionFutbol_17> integrantes = new ArrayList<seleccionFutbol_17>();
    
    public static void main(String[] args) {
        
        futbolista_17 futbolista1 = new futbolista_17(9, "Paolo", "Guerrero", 42 , 9, "Arquero");
        masajista_17 masajista1 = new masajista_17 ("Si", 15, 2, "Raul", "Martinez", 50);
        entrenador_17 RicardoGareca = new entrenador_17 ("Uno", 1 , "Ricardo", "Gareca", 65);
        
    
        
        for(seleccionFutbol_17 integrante : integrantes){
        System.out.println(integrante.getNombre()+ ""+ integrante.getApellidos());
        
        }
       System.out.println("\nTodos los integrantes viajan para jugar el partido");
       RicardoGareca.dirigirEntrenamiento();
       RicardoGareca.Viajar();
       futbolista1.Concentrarse();
       futbolista1.entrenar();
       masajista1.darMasaje();
      
    }
    
}
