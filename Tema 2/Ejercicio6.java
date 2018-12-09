/**
 * Ejercicio 6
 * Pedro
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
    double baseNoIva = 22.75;
    System.out.printf("Base sin IVA %8.2f\n", baseNoIva);
    System.out.printf("IVA          %8.2f\n", (baseNoIva * 0.21));
    System.out.printf("____________________\n");
    System.out.printf("TOTAL        %8.2f\n", (baseNoIva * 1.21));
  }
}
