/**
 * Ejercicio 13
 * Pedro
 */

public class Ejercicio13 {
  public static void main(String[] args) { 
	  System.out.println("Puedo ordenar tres números enteros");
	  System.out.println("Introduce un número: ");
	  int numero1 = Integer.parseInt(System.console().readLine());
	  System.out.println("Ahora introduce otro número");
	  int numero2 = Integer.parseInt(System.console().readLine());
	  System.out.println("Introduce el último número");
	  int numero3 = Integer.parseInt(System.console().readLine());
	  int aux;
	  
	  System.out.println("Ordenados de menor a mayor quedarían:");
	  if (numero1>numero2) {
		  aux = numero1;
		  numero1 = numero2;
		  numero2 = aux;
	  }
	  if (numero2>numero3) {
		  aux = numero2;
		  numero2 = numero3;
		  numero3 = aux;
	  }
	  if (numero1>numero2) {
		  aux = numero1;
		  numero1 = numero2;
		  numero2 = aux;
	  }
	  
	  System.out.println(numero1 + "<" + numero2 + "<" + numero3);
	  
	  
	  
  }
}
