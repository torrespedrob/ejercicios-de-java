/**
 * Ejercicio 17
 * Pedro
 */
 
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Introduce un número entero positivo");
    int entrada = 0;
    do {
      entrada = Integer.parseInt(System.console().readLine());
      if (entrada <0) {
        System.out.println("No es un número válido");
      }
    } while (entrada < 0);
    int suma = 0; 
    for(int i = entrada; i < entrada + 100; i++) {
      suma += i;
    }
    System.out.println("La suma de los próximos 100 números es " + suma);
    
  }
}
