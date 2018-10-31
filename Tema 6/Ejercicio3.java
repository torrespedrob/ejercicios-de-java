/**
 * Ejercicio 3
 * Pedro
 **/

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Puedo mostrar una carta al azar de la baraja española");
    String palo = "";
    String carta = "";
    switch((int)(Math.random()*4)) {
      case 0:
      palo = "oros";
      break;
      case 1:
      palo = "copas";
      break;
      case 2:
      palo= "bastos";
      break;
      case 3:
      palo = "espadas";
      default:
    }
    int numCar = (int)(Math.random()*11)+1;
    switch(numCar) {
      case 1:
      carta = "As";
      break;
      case 8:
      carta = "Sota";
      break;
      case 9:
      carta = "Caballo";
      break;
      case 10:
      carta = "Rey";
      break;
      default:
      carta = String.valueOf(numCar);
    }
    System.out.println(carta+ " de " + palo);
  }
}
