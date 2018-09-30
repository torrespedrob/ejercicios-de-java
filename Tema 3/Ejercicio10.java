/**
 * Ejercicio 10
 * Pedro
 */

public class Ejercicio10{
  public static void main(String[] args) {
    System.out.printf("Esto es un conversor de megabytes a kilobytes, por favor introduce la cantidad a convertir: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.printf("Has introducido " + mb + " megabytes y su conversión a kilobytes es " + (mb*1024));
    
    
  }
}
