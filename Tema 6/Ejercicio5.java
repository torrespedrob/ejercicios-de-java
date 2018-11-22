/**
 * Ejercicio 5
 * Pedro
 **/

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar 50 números aleatorios entre 100 y 199 separados mediante espacios: ");
    for (int i = 1; i <= 50; i++) {
      System.out.print((int)(Math.random()*100 + 100) + " ");
    }
    System.out.println();
  }
}
