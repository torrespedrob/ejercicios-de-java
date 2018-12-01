/**
 * Ejercicio 4
 * Pedro
 */
public class Ejercicio4 {
  public static void main(String[] args) {

    int sueldoSemana;

    System.out.print("¿Cuántas horas trabaja a la semana?: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) {
      sueldoSemana = 12 * horasTrabajadas;
    } else {
      sueldoSemana = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo semanal es igual a " + sueldoSemana + " euros");
  }
}
