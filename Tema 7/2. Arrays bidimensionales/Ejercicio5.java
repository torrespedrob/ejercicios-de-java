/**
 * Ejercicio 5
 * Arrays bidimensionales
 * Pedro Torres
 */

public class Ejercicio5 {
  public static void main(String[] args)
    throws InterruptedException {
      
      int[][] n = new int[6][10];

      int fila;
      int columna;
      int total;
      System.out.print(" ");
      for(fila = 0; fila < 6; fila ++) {
        for (columna = 0; columna < 10; columna++) {
          n[fila][columna] = (int)(Math.random()*901)+100;    
        }
      }
      for(fila = 0; fila<6; fila++) {
        total = 0;
        for (columna = 0; columna < 10; columna++) {
          System.out.printf("\n    ", n[fila][columna]);
        }
      }
          
  }
}
        

