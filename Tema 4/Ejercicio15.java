/**
 * Ejercicio 15 
 * Pedro
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Puedo hacer una pirámide con distintos caracteres");
    System.out.println("Introduce un caracter (*,+,-,$,&...");
    String c = System.console().readLine();
    System.out.println("Ahora introduce la dirección en la que que se encuentra el vértice 1:arriba 2:abajo 3:izquierda 4:derecha");
    int eleccion = Integer.parseInt(System.console().readLine());
    
   
   switch(eleccion) {
	   case 1:
		System.out.println(" " + r);
		System.out.println(" " + r + r + r);
        System.out.println(r + r + r + r + r);
        break;
        
      case 2:
      
        System.out.println(r + r + r + r + r);
        System.out.println(" " + r + r + r);
        System.out.println("  " + r);
        break;
        
      case 3:
      
        System.out.println("    " + r);
        System.out.println("  " + r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println("  " + r + " " + r);
        System.out.println("    " + r);
        break;
        
      case 4:
      
        System.out.println(r);
        System.out.println(r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println(r + " " + r);
        System.out.println(r);
        break;
        
      default: 
    }
  }
}


  

  

