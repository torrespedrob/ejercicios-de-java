/**
 * Ejercicio 30
 * Pedro
 */
 
public class Ejercicio30 {
  public static void main(String[] args) {
    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora;
    int segundaHora;
    
    String primerDiaString;
    String segundoDiaString;
    String nombrePrimerDia = "";
    String nombreSegundoDia = "";
    boolean datosCorrectos = true;
    
    do {
      System.out.println("Introduce los datos del primer día");
      System.out.print("Día: ");
      primerDiaString = System.console().readLine();
      System.out.print("Hora: ");
      primeraHora = Integer.parseInt(System.console().readLine());
      switch(primerDiaString) {
        case "lunes":
        case "1":
          primerDia = 1;
          nombrePrimerDia = "lunes";
          break;
        case "martes":
        case "2":
          primerDia = 2;
          nombrePrimerDia = "martes";
          break;
        case "miércoles":
        case "3":
          primerDia = 3;
          nombrePrimerDia = "miercoles";
          break;
        case "jueves":
        case "4":
          primerDia = 4;
          nombrePrimerDia = "jueves";
          break;
        case "viernes":
        case "5":
          primerDia = 5;
          nombrePrimerDia = "viernes";
          break;
        case "sábado":
        case "6":
          primerDia = 6;
          nombrePrimerDia = "sábado";
          break;
        case "domingo":
        case "7":
          primerDia = 7;
          nombrePrimerDia = "domingo";
          break;
        default:
          primerDia = 0;
      }
      
      
      System.out.println("Introduce la segunda hora");
      System.out.print("Día: ");
      segundoDiaString = System.console().readLine();
      System.out.print("Hora: ");
      segundaHora = Integer.parseInt(System.console().readLine());
      switch(segundoDiaString) {
        case "lunes":
        case "1":
          segundoDia = 1;
          nombreSegundoDia = "lunes";
          break;
        case "martes":
        case "2":
          segundoDia = 2;
          nombreSegundoDia = "martes";
          break;
        case "miércoles":
        case "3":
          segundoDia = 3;
          nombreSegundoDia = "miércoles";
          break;
        case "jueves":
        case "4":
          segundoDia = 4;
          nombreSegundoDia = "jueves";
          break;
        case "viernes":
        case "5":
          segundoDia = 5;
          nombreSegundoDia = "viernes";
          break;
        case "sábado":
        case "6":
          segundoDia = 6;
          nombreSegundoDia = "sábado";
          break;
        case "domingo":
        case "7":
          segundoDia = 7;
          nombreSegundoDia = "domingo";
          break;
        default:
          segundoDia = 0;
      }
      datosCorrectos = true;
      if (segundoDia <= primerDia) {
        System.out.println("El segundo día no puede ser anterior al primero");
        datosCorrectos = false;
      }
      if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println("Los datos están mal introducidos o son erróneos");
        System.out.println("Solo son correctos: lunes, martes, miércoles, jueves y viernes");
        datosCorrectos = false;
      }
      if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
        System.out.println("La hora no está bien introducida");
        System.out.println("Las horas válidas son entre 0 y 23.");
        datosCorrectos = false;
      }
    } while (!datosCorrectos);
    System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
    System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
    System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");
  }
}
