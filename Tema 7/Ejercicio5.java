/**
 * Ejercicio 5
 * Pedro
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println ("Introduce 10 números e indicaré cuál es mínimo y cuál es máximo: ");
    int [] numero = new int[10];
    int i;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    
    if (numero[i] < minimo) {
      minimo = numero[i];
    }
    
    if (numero[i] > maximo)  {
      maximo = numero[i];
    }
  }
    System.out.println("--------");
    System.out.println();
    
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      if (numero[i] == maximo) {
        System.out.print(" es el máximo");
      }
      
      
      if(numero[i] == minimo) {
        System.out.print(" es el mínimo");
      }
      
      System.out.println();
    }
  }
}
