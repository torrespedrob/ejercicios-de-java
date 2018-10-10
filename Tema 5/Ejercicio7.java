/**
 * Ejercicio 7
 * Pedro
 */
 
public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Esto es una caja fuerte, solo se abrirá con una combinación de 4 números y tienes 4 intentos");
    System.out.println("Intenta introducir el número correcto: ");
    int intentos = 4;
    int numero;
    
    do {
      numero = Integer.parseInt(System.console().readLine()); 
      if (numero == 1111) {
        System.out.println("Enhorabuena, has acertado");
        break;
      
      } else { 
        System.out.println("No es correcto");
        intentos --; }
        if (intentos ==0) {
          System.out.println("El sistema se ha bloqueado");
        }
      }
      while (intentos >0);
      
        
      
    
    
  }
}
