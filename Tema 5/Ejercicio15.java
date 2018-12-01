/**
 * Ejercicio 15
 * Pedro
 */
 
public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.print("Introduce una base que sea un número real: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce un exponente que sea un número entero: ");
    int expoFinal = Integer.parseInt(System.console().readLine());

    double pot;
    int expo;
        
    for (int i = 1; i <= expoFinal; i++) {
        
      pot = 1;
      expo = i;
      
      for (int j = 0; j < expo; j++) {
        pot *= base;
      }
      
      System.out.println(base + "^" + i + " = " + pot);
    }

  }
}
