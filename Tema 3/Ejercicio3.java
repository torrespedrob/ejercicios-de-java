/**
 * Ejercicio 3
 * Pedro
 */
 
public class Ejercicio5 {
  public static void main(String[] args) {
	  int x;
	  int y;
	  String codigo;
	  
	  System.out.print("Este programa le permite saber al área de un rectángulo, por favor introduzca el valor de la base: ");
	  codigo = System.console().readLine();
	  x = Integer.parseInt( codigo );
	  System.out.print("Ahora introduce el valor de la altura: ");
	  codigo = System.console().readLine();
	  y = Integer.parseInt( codigo );
	  System.out.print(" El área de ese rectángulo es " + (x*y));
	  
  } 
}
