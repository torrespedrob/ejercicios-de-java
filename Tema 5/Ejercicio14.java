/**
 * Ejercicio 14
 * Pedro
 */
 
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Introduce una base y un exponente entero positivo");
    System.out.println("Primero introduce la base y después el exponente: ");
    int base = Integer.parseInt(System.console().readLine());
    int exponente = Integer.parseInt(System.console().readLine());
    int resultado = (int) Math.pow(base,exponente);
    System.out.println("Has introducido " + base + " y " + exponente);
    System.out.println("Es igual a " + resultado);
  }
}
