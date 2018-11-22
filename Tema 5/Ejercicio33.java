/**
 * Ejercicio 33
 * Pedro
 */
 
public class Ejercicio33 {
  public static void main(String[] args) {
    System.out.println("Puedo pintar la letra U con asteriscos");
    System.out.print("Introduce la altura de U: ");
    int alt = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < alt; i++) {
      System.out.print("* ");
      for (int j = 2; j < alt; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    System.out.print("  ");
    for (int i = 2; i < alt; i++) {
      System.out.print("* ");
    }

  }
}
