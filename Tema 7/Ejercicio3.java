/**
 * Ejercicio 3
 * Pedro
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Introduce 10 números y los mostraré en orden inverso: ");
    
    int [] n = new int[10];
    int i;
    
    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nLos números que has introducido al revés quedan: ");
    for (i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
     
  }
}
