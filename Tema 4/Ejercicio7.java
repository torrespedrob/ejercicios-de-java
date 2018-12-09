/**
 * Ejercicio 7
 * Pedro
 */

public class Ejercicio7 {
  public static void main(String[] args) {   
	  System.out.println("Hola, vamos a calcular la media de tres notas");
	  System.out.println("Introduce la nota del primer examen");
	  Double a = Double.parseDouble(System.console().readLine());
	  System.out.println("Ahora introduce la nota del segundo examen");
	  Double b = Double.parseDouble(System.console().readLine());
	  System.out.println("Introduce la nota del tercer examen");
	  Double c = Double.parseDouble(System.console().readLine());
	  double nota = (a+b+c)/3;
	  System.out.println("La media de los tres exámenes es: " + ((a+b+c)/3));
	  if (nota < 5) {
		  System.out.println("Has suspendido");
	  }
	  if ((nota) >=5 && (nota<6)) {
		  System.out.println("Has aprobado con suficiente");
	  }
	  if ((nota >=6) && (nota<7)) {
		  System.out.println("Has sacado un bien");
	  }
	  if ((nota >=7) && (nota<9)) { 
		  System.out.println("Enhorabuena, has sacado un notable");
	  }
	  if ((nota >=9) && (nota==10)) {
		  System.out.println("Enhorabuena, has sacado un sobresaliente");
	  }
	  
	  
	  
	  
  }
}
