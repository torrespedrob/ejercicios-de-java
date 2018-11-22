/**
 * Ejercicio 1
 * Pedro
 */

public class Ejercicio1 {
  public static void main(String[] args) {
	String dia;
    System.out.print("Dí un día de lunes a viernes y te diré qué asignatura toca en la primera hora: ");
    dia = (System.console().readLine()); 
    if (dia.equals("Lunes")) {
		System.out.println("Toca Entornos de desarrollo");
	}
	if (dia.equals("Martes")) {
		System.out.println("Toca Sistemas Informáticos");
    }
    if (dia.equals("Miércoles")) {
		System.out.println("Toca Programación");
	}
	if (dia.equals("Jueves")) {
		System.out.println("Toca Programación");
	}
	if (dia.equals("Viernes")) {
		System.out.println("Toca Sistemas Informáticos");
	}
  }
}
