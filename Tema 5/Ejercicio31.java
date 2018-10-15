/**
 * Ejercicio 31
 * Pedro
 */
 
public class Ejercicio31 {
  public static void main(String[] args) {
    System.out.println("Puedo pintar una letra L con asteriscos");
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int x = 1; x < altura; x++) {
      System.out.println("*");
    }
    for (int x = 0; x < altura / 2 + 1; x++) {
      System.out.print("* ");
    }

  }
}
