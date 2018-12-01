/**
 * Ejercicio 8
 * Pedro
 */

public class Ejercicio8 {
  public static void main(String[] args) {

    System.out.print("¿Cuántas horas trabaja a la semana?: ");
    
    int horasCobra = Integer.parseInt(System.console().readLine());
    
    System.out.println("En una semana obtiene " + (horasCobra * 12) + " euros.");
  }
}
