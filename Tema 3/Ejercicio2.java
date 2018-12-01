/**
 * Ejercicio 2
 * Pedro
 */
 
public class Ejercicio2 {
  public static void main(String[] args) {
	  System.out.printf("Hola, esto es un conversor de pesetas a euros, por favor introduce la cantidad que deseas convertir: ");
	  
	  int peseta = Integer.parseInt(System.console().readLine());
	  int euro = (int) (peseta / 166.386);
	  System.out.println (peseta + " pesetas son " + euro + " euros.");
  } 
}
