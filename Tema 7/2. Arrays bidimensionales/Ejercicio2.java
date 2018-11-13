/**
 * Ejercicio 2
 * Arrays bidimensionales
 * Pedro Torres
 */

public class Ejercicio2 {
  public static void main(String[] args) { 
      int[][] n = new int[4][5];

      int fila;
      int columna;
      
      System.out.println("Hola, introduzca números enteros para completar el array");
      for(fila = 0; fila < 4; fila++) {
        for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", Columna " + columna + ": ");
        n[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }
    
    
    int sumFila;
    for(fila = 0; fila < 4; fila ++) {
      sumFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", n[fila][columna]);
        sumFila += n[fila][columna];
      }
      System.out.printf("|%7d\n", sumFila);
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
    }
    System.out.printf("|%7d   ", sumaFin);
  }
}
        

