/**
 * Ejercicio 4
 * Pedro
 */
 
public class Ejercicio4 {
  public static void main(String[] args) {
	  String codigop;
	  String codigos;
	  System.out.print("Hola, introduce dos números y realizaré su suma, resta, multiplicación y división. Introduce el primero: ");
	  codigop = System.console().readLine();
	  int numero1;
	  numero1 = Integer.parseInt( codigop );
	  System.out.print("Ahora introduce el segundo número: ");
	  codigos = System.console().readLine();
	  int numero2;
	  numero2 = Integer.parseInt( codigos );
	  System.out.println("La suma de ambos es " +(numero1+numero2));
	  System.out.println("La resta de ambos es " +(numero1-numero2));
	  System.out.println("La multiplicación de ambos es " + (numero1*numero2));
	  System.out.println("La división de ambos es " + (numero1/numero2));
  } 
}
