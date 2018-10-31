/**
 * Ejercicio 4
 * Pedro
 **/

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar 20 números aleatorios del 1 al 10 separados mediante espacios");
    for (int i = 1; i <=20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
    
    System.out.println();

    
  }
}
