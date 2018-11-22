/**
 * Ejercicio 19
 * Pedro
 */
 
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Puedo hacer una pirámide con el carácter que indiques y con una altura específica");
    System.out.println("Introduce el carácter a utilizar: ");
    String caracter = (System.console().readLine());
    System.out.println("Introduce la altura que debe tener la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int actual = 1;
    if (altura < 0) {
      System.out.println("Debes introducir una altura válida");
    }
    int longitud = 1;
    int espacio = altura-1;
    while (actual <= altura) {
       for (int i = 1; i <= espacio; i++) {
         System.out.print(" ");
       }
       for (int i = 1; i <= longitud; i++) {
         System.out.print(caracter);
       }
       System.out.println();
       actual++;
       espacio--;
       longitud += 2;
     }
     
  }
}
