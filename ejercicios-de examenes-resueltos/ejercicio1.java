/*
Ejercicio 1
Pedro Torres Barba
*/
import java.util.Scanner;
import java.util.HashMap;
public class ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    HashMap<Integer, String> m = new HashMap<Integer, String>();
    m.put(1, "Madrid");
    m.put(2, "Lisboa");
    m.put(3, "Paris");
    String pais;
    System.out.println("Escribe el nombre de un pais y te dire su capital (en minusculas y sin tildes ni caracteres conflictivos)");
    
    do {
      System.out.println("Introduce un pais (escribe salir para acabar): ");
      
      pais = s.nextLine();
      switch (pais) {
        case "espana":
          System.out.println("Su capital es " + m.get(1));
          break;
        case "portugal":
          System.out.println("Su capital es " + m.get(2));
          break;
        case "francia":
          System.out.println("Su capital es " + m.get(3));
          break;
          
        
      }
      
      
    }
    while (!"salir".equals(pais));
    
    
  }

  
  
}
