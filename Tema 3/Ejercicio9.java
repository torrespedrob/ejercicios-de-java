/**
 * Ejercicio 9
 * Pedro
 */

public class Ejercicio9{
  public static void main(String[] args) {
    System.out.println("Vamos a calcular el volumen de un cono, primero introduce la altura: ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.println("Ahora introduce el radio: ");
    double r = Double.parseDouble(System.console().readLine());
    final double PI = 3.141592654;
    double v = ((1.0/3.0)*(PI)*(r*r)*(h));
    System.out.printf("El volumen del cono con las medidas que has especificado es " + (v));
    
    
  }
}
