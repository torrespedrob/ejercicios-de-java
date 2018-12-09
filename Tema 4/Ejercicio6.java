/**
 * Ejercicio 6
 * Pedro
 */

public class Ejercicio6 {
  public static void main(String[] args) {   
	  System.out.println("Este programa te permite saber cuanto tiempo tarda en caer un objeto desde una altura h. Introduce la altura a la que cae el objeto: ");
	  
	  Double a = Double.parseDouble(System.console().readLine());
	  
	  double s = Math.sqrt(2*a/9.98);
	  
	  System.out.println("Tardará en caer " + s + " segundos");
	  
	  
  }
}
