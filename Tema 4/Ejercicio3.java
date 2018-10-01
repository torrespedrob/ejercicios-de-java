/**
 * Ejercicio 3
 * Pedro
 */

public class Ejercicio3 {
  public static void main(String[] args) {

    String dia;
    System.out.print("Introduce un número del 1 al 7 y te diré a qué día corresponde: ");
    int d = Integer.parseInt(System.console().readLine());
    
    switch(d) {
      case 1:
        dia = "Lunes";
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miércoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "Sábado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "Tiene que ser un número del 1 al 7";
    }
    
    System.out.println(dia);

  }
}
