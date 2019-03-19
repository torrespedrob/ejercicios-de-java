
package ejs;

public class Ejercicio6 {


  public static void main(String[] args) {

    int[][] num = new int[6][10];

    int fila;
    int columna;

    boolean repetido;
    int i;
    int j;
      
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);
          
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("|||||||||");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("------");
    }
    System.out.println("┓");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + "|||");
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%5d ", num[fila][columna]);
        
        // Calcula el mÃ­nimo y guarda sus coordenadas
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        
        // Calcula el mÃ¡ximo y guarda sus coordenadas
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("|");
    }
    System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("|");
    }

    System.out.println("\n\nEl maximo es " + maximo + " y esta en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El minimo es " + minimo + " y esta en la fila " + filaMinimo + ", columna " + columnaMinimo);
  }
  
}
