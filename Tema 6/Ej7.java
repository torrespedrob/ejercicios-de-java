
package ejs;

public class Ej7 {


  public static void main(String[] args) {

      int columna = 3;
      int resultado;
      
      for (int fila = 0; fila < 15; fila++) {
        System.out.printf("%4d. |", fila);
        if (fila == 15) {
          columna = 1;
        }
        for (int apuesta = 1; apuesta <= columna; apuesta++) {
          resultado = (int)(Math.random() * 3) + 1;
          switch (resultado) {
            case 1:
              System.out.print("1  |");
              break;
            case 2:
              System.out.print("  2|");
              break;
            case 3:
              System.out.print(" X |");
            default:
          }
        }
        System.out.println();
      }
    }
  }
