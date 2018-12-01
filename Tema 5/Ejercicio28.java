/**
 * Ejercicio 28
 * Pedro
 */
 
public class Ejercicio28 {
  public static void main(String[] args) {
    int entrada;
    
    do {
      System.out.print("Introduce un número entero: ");
      entrada = Integer.parseInt(System.console().readLine());
      
      if (entrada < 0) {
        System.out.println("Ese número no es válido");
      }
    } while (entrada < 0);
    int factorial = entrada;
    if (entrada == 0) {
      System.out.println("El factorial del " + entrada + " es 1");
    } else {
      for (int i = 1; i < entrada; i++) {
        factorial *= i;
      }
      System.out.println(entrada + "! = " + factorial);
    }
  }
}
