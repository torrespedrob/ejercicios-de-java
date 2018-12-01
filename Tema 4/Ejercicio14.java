/**
 * Ejercicio 14
 * Pedro
 */

public class Ejercicio14 {
  public static void main(String[] args) {
	  System.out.println("Puedo decir si un número entero es par y divisible entre 5");
	  System.out.println("Introduce un número: ");
	  int num = Integer.parseInt(System.console().readLine());
	  int par = num%2;
	  int div5 = num%5;
	  
	  if (par == 0) {
		  System.out.println("El número es par");
	  }	else {
		  System.out.println("El número es impar");
	  }
	  
	  if (div5 == 0) {
		  System.out.println("El número es divisible entre 5");
	  }	else {
		  System.out.println("El número no es divisible entre 5");
	  }
	  
	  
	  
	  
  }
}
