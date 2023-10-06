
package S08_17;

import java.util.Scanner;


public class calculadora_17 {
    int a;
    int b;
    public void datos(){
    Scanner calculo = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    a = calculo.nextInt();
    System.out.println("Ingrese el segundo numero");
    b = calculo.nextInt();
        
    }
    
    public void operadores(){
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        int division = a/b;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    
        
    }
}