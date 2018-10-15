/**
 * Ejercicio 11
 * Pedro
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa calculará el cuadrado y el cubo de los 5 siguientes números del que introduzcas");
    System.out.println("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Has introducido el número " + numero);
    for (int x = numero; x < numero + 5; x++) {
      System.out.printf("%4d %6d %8d\n", x, x*x, x*x*x);
    }
  }
}
