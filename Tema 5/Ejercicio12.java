/**
 * Ejercicio 12
 * Pedro
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Calcular la sucesión de Fibonacci de tantos números como indiques");
    System.out.println("Introduce cuántos números quieres mostrar");
    int x = Integer.parseInt(System.console().readLine());
  
    switch (x) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(x > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            x--;
        }
    }
    System.out.println();
  }
}
