/**
 * Ejercicio 36
 * Pedro
 */
 
public class Ejercicio36 {
  public static void main(String[] args) {
    System.out.println("Puedo saber si un número es capicúa o no");
    System.out.println("Introduce un número entero positivo: ");
    long numeroEntrada = Long.parseLong(System.console().readLine());
    long numero = numeroEntrada;
    long giro = 0;
    
    while (numero > 0) {
      giro = (giro * 10) + (numero % 10);
      numero /= 10;
    } 
    
    if (giro == numeroEntrada) {
      System.out.println(numeroEntrada + " es capicúa");
    } else {
      System.out.println(numeroEntrada + " no es capicua");
    }
    
  }
}
