/**
 * Ejercicio 18
 * Pedro
 */
 
public class Ejercicio18 {
  public static void main(String[] args) {
    int numero1;
    int numero2;

    do {
      System.out.print("Introduce un número entero: ");
      numero1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce otro número entero distinto al de antes: ");
      numero2 = Integer.parseInt(System.console().readLine());
      if(numero1 == numero2) {
        System.out.println("Tienen que ser distintos");
      }
    } while (numero1 == numero2);
    
    if (numero1 > numero2) {
      int aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    for(int i = numero1; i <= numero2; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
