/**
 * Ejercicio 9
 * Pedro
 */
public class Ejercicio9 {

  public static void main(String[] args) {
    
    double xPrimera, xSegunda;

    System.out.println("Puedo resolver ecuaciones de segundo grado.");
    System.out.println("ax^2 + bx + c = 0");
    
    System.out.println("Introduce los valores siguientes->");
    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    } 

    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("xPrimera = 0");
      System.out.println("xSegunda = " + (-b / a));
    }
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("xPrimera = xSegunda = " + (-c / b));
    }
    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double discriminante = b*b - (4 * a * c);
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene solucion real");
      }  else {
        System.out.println("xPrimera = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("xSegunda = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }

  }
}
