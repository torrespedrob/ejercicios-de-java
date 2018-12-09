/**
 * Ejercicio 26
 * Pedro
 */
 
public class Ejercicio26 {
  public static void main(String[] args) {
    System.out.print("Escribe un número entero: ");
    int numeroEntero = Integer.parseInt(System.console().readLine());

    System.out.print("Escribe un solo dígito: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Desde izquierda a derecha, el " + digito + " aparece dentro de " + numeroEntero + " en estas posiciones: ");
    int numero = numeroEntero;
    int girado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    while (numero > 0) {
      girado = (girado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    while (girado > 0) {
      if ((girado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      girado /= 10;
      posicion++;
    }
    System.out.println();
    
  }
}
