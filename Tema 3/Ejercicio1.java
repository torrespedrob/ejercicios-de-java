/**
 * Ejercicio 1 
 * Pedro Torres
 */

public class Ejercicio1 {
  public static void main(String[] args) {
	  String datos;
	  
	  System.out.print("Hola, por favor, introduce un número: ");
	  datos =  System.console().readLine();
	  int numeroCreado;
	  numeroCreado = Integer.parseInt( datos );
	  
	  System.out.print("Escribe otro número, por favor: ");
	  datos = System.console().readLine();
	  int nuevoNumeroCreado;
	  nuevoNumeroCreado = Integer.parseInt( datos );
	  
	  int multiplicacion;
	  multiplicacion = (numeroCreado * nuevoNumeroCreado);
	  System.out.println ("Introdujiste los números " + numeroCreado + " y " +nuevoNumeroCreado);
	  System.out.println ("La multiplicación de ambos números es " + multiplicacion);
  } 
}
