/**
 * Ejercicio 2
 * Pedro
 **/

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar el nombre de una carta y un número");
     String palo = "";
     String carta = "";
     int numPalo = (int)(Math.random()*4) + 1;
     switch(numPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
      default:
    }

    int numCar = (int)(Math.random()*13) + 1;
    
    switch(numCar) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numCar);
    }
    System.out.println(carta + " de " + palo);
  }
}

