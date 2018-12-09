/**
 * Ejercicio 12
 * Pedro
 */

public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.printf("Introduce la nota que sacastes en el primer examen: ");
    double notaPrimera = Double.parseDouble(System.console().readLine());

    System.out.print("¿Cuánto quieres sacar en el próximo trimestre?: ");
    double notaUltima = Double.parseDouble(System.console().readLine());
    double notaSegunda = ((notaUltima * 100) - (notaPrimera * 40)) / 60;
    
    System.out.println("Para sacar un " + notaUltima + " en el trimestre tienes que sacar un " + notaSegunda + " en el segundo examen.");
  }
}
