/**
 * Ejercicio 4
 * Arrays bidimensionales
 * Pedro Torres
 */

public class Ejercicio4 {
  public static void main(String[] args)
    throws InterruptedException {
      
      int[][] n = new int[4][5];

      int fila;
      int columna;
      
      System.out.println("Los números del array son aleatorios: ");
      for(fila = 0; fila < 4; fila++) {
        for(columna = 0; columna < 5; columna++) {
          n[fila][columna] = (int)(Math.random()*900) + 100;
      }
    }
    
    
    int sumFila;
    for(fila = 0; fila < 4; fila ++) {
      sumFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", n[fila][columna]);
        sumFila += n[fila][columna];
        Thread.sleep(200);
      }
      System.out.printf("|%7d\n", sumFila);
      Thread.sleep(400);
    }
    
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("----------");
    int sumCol;
    int sumaFin = 0;
    for (columna = 0; columna < 5; columna ++) {
      sumCol = 0;
      for(fila = 0; fila < 4; fila++) {
        sumCol += n[fila][columna];
      }
      sumaFin += sumCol;
      System.out.printf("%7d   ", sumCol);
      Thread.sleep(500);
    }
    System.out.printf("|%7d   ", sumaFin);
  }
}
        

