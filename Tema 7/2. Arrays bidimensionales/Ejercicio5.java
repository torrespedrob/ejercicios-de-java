
package ejs;

public class Ejercicio5 {

  public static void main(String[] args) {
    System.out.println("Array de 6x10");
    int[][] numero = new int [6][10];
    
    int fila;
    int columna;
    
    int minimo = Integer.MIN_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int maximo = Integer.MAX_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    
    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("     ~");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("------");
    }
    System.out.println("¬");
    
    for(fila = 0; fila < 6; fila++) {
      
      System.out.print("  " + fila + " |");
      for(columna = 0; columna < 10; columna++) {
        
        numero[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", numero[fila][columna]);

        if (numero[fila][columna] < minimo) {
          minimo = numero[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }

        if (numero[fila][columna] > maximo) {
          maximo = numero[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("|");
    }
    System.out.print("    L");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("------");
    }

    System.out.println("\n\nEl maximo es " + maximo + " y esta en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El minimo es " + minimo + " y esta en la fila " + filaMinimo + ", columna " + columnaMinimo);
  }
}

