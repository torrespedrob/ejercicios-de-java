/**
 * Ejercicio 16 
 * Pedro
 */

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al test de fidelidad, responde a estas preguntas para saber cómo de fiel es tu pareja.");
    String r;
    int puntos = 0;
    
    System.out.println("\n1.Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.(v/f)");
    r = System.console().readLine();
    if ( r.equals("v") ) {
      puntos += 2;
    }
    System.out.println("2.Ha aumentado sus gastos de vestuario más de lo común.(v/f)");
    r = System.console().readLine();
    if ( r.equals ("v") ) {
      puntos += 3;
    }
    System.out.println("3.Ha perdido el interés que mostraba por ti.(v/f)");
    r = System.console().readLine();
    if ( r.equals ("v") ) {
      puntos += 4;
    }
    System.out.println("4.Se afeita y se asea con más frecuencia, o se arregla más el pelo.(v/f)");
    r = System.console().readLine();
    if ( r.equals ("v") ) {
      puntos += 3;
    }
    System.out.println("5.No te deja que mires su teléfono.(v/f)");
    r = System.console().readLine();
    if (r.equals ("v") ) {
      puntos += 5;
    }
    System.out.println("6.Tiene llamdas que dice no querer constestar cuando estás tú.(v/f)");
    r = System.console().readLine();
    if (r.equals ("v") ) {
      puntos += 4;
    }
    System.out.println("7.Se preocupa mucho en su forma física, en la dieta, o en su bronceado.(v/f)");
    r = System.console().readLine();
    if (r.equals ("v") ) {
      puntos += 3;
    }
    System.out.println("8.Muchas veces llega tarde por decir que tiene mucho trabajo.(v/f)");
    r = System.console().readLine();
    if (r.equals ("v") ) {
      puntos += 4;
    }
    System.out.println("9.Se perfuma mucho más.(v/f)");
    r = System.console().readLine();
    if (r.equals ("v") ) {
      puntos += 2;
    }
    System.out.println("10.Se confunde y te dice que ha estado en sitios donde no ha ido contigo.(v/f)");
    r = System.console().readLine();
    if (r.equals ("v") ) {
      puntos += 3;
    }
    
    if (puntos <=11) {
      System.out.println("¡Parece que tu pareja es fiel, enhorabuena!");
    }
    if ( (puntos > 12 )  && (puntos <= 24) ) {
      System.out.println("Puede que alguien esté en la mente de tu pareja, aunque también podría no significar nada y te estás preocupando de más. No bajes la guardia.");
    }
    if ( puntos >= 25 ) {
      System.out.print("Tiene toda la pinta de que tu pareja te esté engañando con otra persona. Busca pruebas suficientes que lo demuestren y prepara una larga charla...");
    }
    
    
  }
}


  

  

