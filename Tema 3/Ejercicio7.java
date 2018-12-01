/**
 * Ejercicio 7
 * Pedro
 */

public class Ejercicio7 {
  public static void main(String[] args) {

    System.out.printf("Introduce el precio de un artículo sin IVA: ");
    double baseNoIva = Double.parseDouble(System.console().readLine());

    System.out.printf("Base sin IVA   %8.2f\n", baseNoIva);
    System.out.printf("IVA            %8.2f\n", (baseNoIva * 0.21));
    System.out.printf("_______________________\n");
    System.out.printf("Total          %8.2f\n", (baseNoIva * 1.21));
  }
}
