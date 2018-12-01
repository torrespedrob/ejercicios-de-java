/**
 * Ejercicio 11
 * Pedro
 */

public class Ejercicio11{
  public static void main(String[] args) {
    System.out.printf("Esto es un conversor de kilobytes a megabytes, por favor introduce la cantidad a convertir: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.printf("Has introducido " + kb + " kilobytes y su conversión a megabytes es " + (kb/1024));
    
    
  }
}
