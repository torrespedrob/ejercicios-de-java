/**
 * Ejercicio 22
 * Pedro
 */

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Cronómetro de fin de semana");
    System.out.println("¿Qué día es hoy?: ");
    String dia = System.console().readLine();
    System.out.println("¿Qué hora es?: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("¿Cuáles son los minutos?: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int valordia = 0;
    switch (dia) {
		case "lunes":
			valordia = 0;
			break;
		case "martes":
			valordia = 1;
			break;
		case "miercoles":
			valordia = 2;
			break;
		case "jueves":
			valordia = 3;
			break;
		case "viernes":
			valordia = 4;
			break;
		default:
		System.out.println("Error");
	}
		
	int minutosTot = (4 * 24 * 60) + (15 * 60);
    int minutosAct = (valordia * 24 * 60) + (hora * 60) + minutos;
    System.out.print("Quedan " + (minutosTot - minutosAct) + " minutos para que sea fin de semana.");
  }
}


  

  

