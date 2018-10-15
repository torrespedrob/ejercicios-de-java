/**
 * Ejercicio 27
 * Pedro
 */
 
public class Ejercicio27 {
  public static void main(String[] args) {
    System.out.print("Escribe un número entero mayor que 1: ");
    int entrada = Integer.parseInt(System.console().readLine());
    int cuenta = 0;
    int suma = 0;
    for (int x = 1; x < entrada; x++) {
      if ((x % 3) == 0) {
        System.out.print(x + " ");
        cuenta++;
        suma += x;
      }
    }
    System.out.print("\nDesde 1 hasta " + entrada + " hay " + cuenta);
    System.out.println(" múltiplos de 3 y suman " + suma);
  }
}
