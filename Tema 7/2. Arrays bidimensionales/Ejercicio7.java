package ejs;

import java.util.Scanner;

public class Ejercicio7 {
  
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Juego: Busca el tesoro");
    int [][] cuadrante = new int [5][4];
    int x;
    int y;
    
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    int minax = (int)(Math.random()*4);
    int minay = (int)(Math.random()*3);
    
    cuadrante[minax][minay] = MINA;
    
    int tesorox;
    int tesoroy;
    
    do {
      tesorox = (int)(Math.random()*4);
      tesoroy = (int)(Math.random()*3);
    }
    while ((minax == tesorox) && (minay == tesoroy));
    
    cuadrante[tesorox][tesoroy] = TESORO;
    
    System.out.println("Encuentra el tesoro");
    int oportunidad = 6;
    boolean salir = false;
    String c = "";
    
    do {
      for(y = 3; y >= 0; y--) {
        System.out.print(y + "|");
        for(x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
      System.out.println(" ----------\n  0 1 2 3 4\n");
      
      System.out.print("Coordenada x: ");
      x = s.nextInt();
      System.out.print("Corrdenada y: ");
      y = s.nextInt();
      
      switch(cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          if ((Math.abs(x - minax) < 2) && (Math.abs(y - minay) < 2)) {
            System.out.println("Cuidado, hay una mina cerca.");
          }
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena, has encontrado el tesoro!"); 
          salir = true;  
      }
    } while (!salir);

    // Pinta el cuadrante
    for(y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for(x = 0; x < 5; x++) {
        switch(cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "⊕⊕";
            break;
          case INTENTO:
            c = "x ";
            break;
        }
        System.out.print(c);
      }      
      System.out.println();
    }
    System.out.println("  ----------\n  0 1 2 3 4\n");
    }
  }