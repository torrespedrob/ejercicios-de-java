/**
 * Ejercicio 17
 * Pedro
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Puedo decir la última cifra de un número entero introducido ");
    System.out.println("\nIntroduce un número entero");
    
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra de ese número es: " + (x % 10));
    
  }
}


  

  

