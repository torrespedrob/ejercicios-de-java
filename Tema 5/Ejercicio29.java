/**
 * Ejercicio 29
 * Pedro
 */
 
public class Ejercicio29 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero muy grande: ");
    int grande = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número entero pero esta vez debe ser pequeño: ");
    int pequ = Integer.parseInt(System.console().readLine());
    System.out.print("Los números positivos menores que " + grande );
    System.out.println(" y que no pueden dividirse entre " + pequ + " son estos:");



    int cuenta = 0;
    int suma = 0;
    for (int i = 1; i < grande; i++) {
      if ((i % pequ) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
