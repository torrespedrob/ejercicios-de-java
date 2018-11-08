/**
 * Ejercicio 7
 * Pedro
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar 100 números aleatorios del 0 al 20: ");
    int [] numero;
    numero = new int[100];
    String color1 = "\033[33m";
    String color2 = "\033[34m";
    
    
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()*21);
      System.out.print(numero[i] + "  ");
    }
    System.out.print("\nIntroduce un número que aparezca arriba y que quieras sustituir: ");
    int reemplazado = Integer.parseInt(System.console().readLine());
    System.out.print("\nAhora introduce el número que desees que ocupe su lugar: ");
    int reemplazador = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 100; i++) {
      if (numero[i] == reemplazado) {
        numero[i] = reemplazador;
        System.out.print(color1 + "\"" + numero[i] + "\" ");
      } else {
      System.out.print(color2 + numero[i] + "  ");
      }
    }
  System.out.println();
  }
}
