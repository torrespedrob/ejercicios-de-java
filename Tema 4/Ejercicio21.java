/**
 * Ejercicio 21
 * Pedro
 */

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Notas de programación");
    System.out.println("\nIntroduce la nota que sacaste en el primer examen: ");
    double x = Double.parseDouble(System.console().readLine());
    System.out.println("\nIntroduce la nota que sacaste en el último examen: ");
    double y = Double.parseDouble(System.console().readLine());
    
    double media = (x + y)/2;
    System.out.println("Tu media es " + media);
    if (media >= 5) {
		System.out.println("Enhorabuena, has aprobado");
	} else {
		System.out.println("Introduce la nota de la recuperación: ");
		double z = Double.parseDouble(System.console().readLine());
		boolean apto = false;
		if (z >= 5) {
			media = 5;
			System.out.println("Enhorabuena, tu nota es un " + media + " gracias a la recuperación");
		} else {
			System.out.println("Lo siento, no has aprobado. Tu nota es " + media);
		}
	}
        

  }
}


  

  

