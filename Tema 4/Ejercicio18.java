/**
 * Ejercicio 18
 * Pedro
 */

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Puedo saber la primera cifra de un número introducido");
    System.out.println("\nIntroduce un número entero: ");
    
    int x, cifra = 0;
    
    x = Integer.parseInt(System.console().readLine());
    
    if (x < 10) {
		cifra = x;
	}
	if ((x >= 10) && (x < 100)) {
		cifra = x/10;
	}
	if ((x >= 100) && (x < 1000)) {
		cifra = x/100;
	}
	if ((x >= 1000) && (x < 10000)) {
		cifra = x/1000;
	}
	if ((x >= 10000) && (x < 100000)) {
		cifra = x/10000;
	}
	
	System.out.println("La primera cifra del número que has introducido es: " + cifra);
  }
}


  

  

