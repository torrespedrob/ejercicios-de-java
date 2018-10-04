/**
 * Ejercicio 11
 * Pedro
 */

public class Ejercicio11 {
  public static void main(String[] args) {   
	  System.out.println("Puedo calcular cuantos segundos faltan hasta medianoche");
	  System.out.println("Introduce la hora actual (en formato 24 horas): ");
	  int hora = Integer.parseInt(System.console().readLine());
	  System.out.println("Ahora introduce los minutos: ");
	  int minutos = Integer.parseInt(System.console().readLine());
	  
	  System.out.println("Quedan " + (24-hora) + "horas y " + (60-minutos) + ("minutos"));
	  System.out.println("Lo que sería unos " + ((24-hora)*3600 + (60-minutos)*60) + "segundos");
  }
}
