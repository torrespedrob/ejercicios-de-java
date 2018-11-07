/**
 * Ejercicio 4
 * Pedro
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    int [] numero;
    int [] cuadrado;
    int [] cubo;
    
    numero = new int[20];
    cuadrado = new int [20];
    cubo = new int [20];
    
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }

    System.out.println("Mostrando en tres columnas un número aleatorio de 0 a 100, el cuadrado y el cubo");
    for (int i = 0; i < 20; i++) {
        System.out.printf("%4d | %5d |%8d\n", numero[i], cuadrado[i], cubo[i]);
      }
  }
}
 
