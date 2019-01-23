/**
 * Ejercicio 19
 * Pedro
 */

public class Ejercicio19 {
  public static void main(String[] args) {
	System.out.println("Sé cuantos dígitos tiene el número entero que introduces: ");
  int x = Integer.parseInt(System.console().readLine());



  if (x < 10 && x >=0) {
    System.out.println("Ese número tiene un dígito");
  }
  if (x < 100 && x >= 10) {
    System.out.println("Ese número tiene dos dígitos");
  }
  if (x < 1000 && x >= 100) {
    System.out.println("Ese número tiene tres dígitos");
  }
  if (x < 10000 && x >= 1000) {
    System.out.println("Ese número tiene cuatro dígitos");
  }
  if (x < 100000 && x >= 10000) {
    System.out.println("Ese número tiene cinco dígitos");
  }
  
  if (x < 0) {
    System.out.println("Error");
  }
  

  }
}


  

  

