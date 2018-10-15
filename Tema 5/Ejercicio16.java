/**
 * Ejercicio 16
 * Pedro
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Puedo saber si un número es primo o no");
    System.out.println("Introduce un número entero");
    int x = Integer.parseInt(System.console().readLine());
    
    boolean Primo = true;
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        Primo = false;
      }
    }
    if (Primo) {
      System.out.println("El número es primo");
    } else {
      System.out.println("El número no es primo");
    }
  }
}
