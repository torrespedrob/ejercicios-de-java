package ejs;
import java.util.Scanner;

public class Ejercicio2 {
  
Scanner s = new Scanner(System.in);
boolean esPrimo(long numero) {
  if (numero<2) {
    return false;
  } else {
    for (long l = numero/2; l>=2; l--) {
      if (numero % l ==0) {
        return false;
      }
    }
    return true; 
  }
}
}

