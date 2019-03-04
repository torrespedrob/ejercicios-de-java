
package ejercicios;
import java.util.Scanner;
public class Ejercicio38 {


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce una altura: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    
    int altura = 1;
    int relleno = alturaIntroducida;
    int espacioD = 0;
    
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Error, el número no es correcto. Debe ser impar y mayor o igual a 3.");
      }
    else {
      while (altura < alturaIntroducida / 2 + 1) {
        for (int i = 1; i <= espacioD; i++) {
          System.out.print(" ");
        }
        for (int i = 0; i < relleno; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espacioD++;
        relleno -= 2;
      }
      espacioD = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida /2 +1) {
        for (int i = 1; i <= espacioD; i++) {
          System.out.print(" "); 
        }
        
        for (int i = 0; i < relleno; i++) {
          System.out.print("*");
        }
        
      
      }
      System.out.println();
      altura++;
      espacioD--;
      relleno += 2;
    
          
        
        }
      }
    }

