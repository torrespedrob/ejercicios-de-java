/**
 * Ejercicio 19
 * Pedro
 */

public class Ejercicio19 {
  public static void main(String[] args) {
	
	int x, digit=0;  
	System.out.println("Introduce un número entero");
	
    x = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( x < 10 ) {
      digit = 1;
    }   
    if (( x >= 10 ) && ( x < 100 )) {
      digit = 2;
    }    
    if (( x >= 100 ) && ( x < 1000 )) {
      digit = 3;
    }    
    if (( x >= 1000 ) && ( x < 10000 )) {
      digit = 4;
    }    
    if ( x >= 10000 ) {
      digit = 5;
    }
    System.out.println("EL número que has introducido tiene " + digit + " dígitos");
    
  }
}


  

  

