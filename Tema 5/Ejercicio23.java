/**
 * Ejercicio 23
 * Pedro
 */
 
public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Ve introduciendo números, pero verás qué pasa si superan a 1000 en total: ");
    int entrada;
    int suma = 0;
    int numeros = 0;
    do {
      entrada = Integer.parseInt(System.console().readLine());
      suma += entrada;
      numeros++;
    } while (suma <= 1000);
    
    System.out.println("Has introducido un total de " + numeros + " numeros");
    System.out.println("La suma equivale a " + suma);
    System.out.println("La media equivale a " + suma / numeros);
    
    
    
  }
}
