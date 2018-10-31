/**
 * Ejercicio 1
 * Pedro
 **/

public class Ejercicio1 {
  public static void main(String[] args) {
    int dadostotal;
    int sumadados = 0;
    System.out.println("Puedo mostrar la tirada de tres dados y mostrar su suma: ");
    
    for(int i = 0; i < 3; i++) {
      dadostotal = (int)(Math.random() * 6) + 1;
      System.out.print(dadostotal + " ");
      
      sumadados += dadostotal;
    }
    System.out.println("\nSuma total: " + sumadados);
  }
}
