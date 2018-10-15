/**
 * Ejercicio 24
 * Pedro
 */
 
public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("Introduce una altura y formaré una pirámide con varios números");
    int altEntrada = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int x = 0;
    int espacio = altEntrada - 1;
    
    while (altura <= altEntrada) {
      for (x = 1; x <= espacio; x++) {
        System.out.print(" ");
      }
      for (x = 1; x < altura; x++) {
        System.out.print(x);
      } 
      for (x = altura; x > 0; x--) {
        System.out.print(x);
      }
      System.out.println();
      altura++;
      espacio--;
    } 
  }
}
