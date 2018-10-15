/**
 * Ejercicio 9
 * Pedro
 */
 
public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Puedo saber cuántos dígitos tiene un número introducido");
    System.out.println("Por favor, introduce un número entero: ");
    int numero = 1, x, entrada;
    entrada = Integer.parseInt(System.console().readLine());
    x = entrada;
    while (x > 10) {
      x /= 10;
      numero++;
    }
    System.out.println(entrada + " tiene " + numero + " dígitos");
    
  }
}
