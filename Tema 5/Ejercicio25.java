/**
 * Ejercicio 25
 * Pedro
 */
 
public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar un número al revés");
    System.out.print("Introduce un número entero: ");
    int entrada = Integer.parseInt(System.console().readLine());

    int numero = entrada;
    int invertido = 0;
    while (numero > 0) {
      invertido = (invertido * 10) + (numero % 10);
      numero /= 10;
    }
    System.out.println("Si giro el " + entrada + " vemos " + invertido);
  }
}
