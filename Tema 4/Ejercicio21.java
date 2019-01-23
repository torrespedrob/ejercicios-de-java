/**
 * Ejercicio 21
 * Pedro
 */

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Notas de programación");
    boolean media = false;
    boolean recuperacion = false;
    boolean apto = false;
    System.out.println("Introduce la nota del primer examen: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la nota del segundo examen: ");
    int y = Integer.parseInt(System.console().readLine());
    
    if ((x+y)/2 >= 5) {
      recuperacion = false;
    }
    if ((x+y)/2 < 5) {
      recuperacion = true;
    }
    System.out.println("Notas
    if (recuperacion) {
      System.out.println("Introduce la nota del examen de recuperación: ");
      int z = Integer.parseInt(System.console().readLine());
      if (z < 5) {
        apto = false;
        
      }
      if (z >=5) {
        apto = true;
      }
      if (apto) {
        System.out.println("Has recuperado");
      }
      if (apto=false) {
        System.out.println("NO has recuperado, lo siento");
    }
  }
        

  }
}


  

  

