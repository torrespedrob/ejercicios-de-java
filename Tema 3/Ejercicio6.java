/**
 * Ejercicio 6
 * Pedro
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
	  double x;
	  double y;
	  String codigo;
	  
	  System.out.printf("Este programa le permite saber al área de un triángulo, por favor introduzca el valor de la base: ");
	  codigo = System.console().readLine();
	  x = Double.parseDouble( codigo );
	  System.out.printf("Ahora introduce el valor de la altura: ");
	  codigo = System.console().readLine();
	  y = Double.parseDouble( codigo );
	  System.out.printf("El área de ese rectángulo es " + ((x*y)/2) );
	  
  } 
}
