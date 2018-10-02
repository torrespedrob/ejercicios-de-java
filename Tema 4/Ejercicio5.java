/**
 * Ejercicio 5
 * Pedro
 */

public class Ejercicio5 {
  public static void main(String[] args) {   
	  System.out.println ("Puedo resolver una ecuación de primer grado del tipo ax + b = 0");
	  System.out.println ("Introduce el valor de a: ");
	  Double a = Double.parseDouble(System.console().readLine());
	  System.out.println("Ahora introduce el valor de b: ");
	  Double b = Double.parseDouble(System.console().readLine());
	  
	  if (a == 0) {
		  System.out.println("Esa ecuación no tiene solución real");
	  } else {
		  System.out.println("Resultado " +  ((-b)/a));
	  }
	  
   }
}
