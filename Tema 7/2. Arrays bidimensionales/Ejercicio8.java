

public class Ejercicio8array2 {

    public static void main(String[] args) {
        

        System.out.println("\nInserte la posición en la que se encuentra el alfil:");
        String cor = System.console().readLine();

        int columna = (int) (cor.charAt(0)) -96;
        int fila = (int) (cor.charAt(1)) - 48 ;

        System.out.println("El alfil puede moverse hacia las siguientes posiciones:");

        for (int filaMove = 8; filaMove >= 1; filaMove--) {
            for (int columnaMove = 1; columnaMove <= 8; columnaMove++) {
                if ((Math.abs(fila - filaMove) == Math.abs(columna - columnaMove))
                      && (! ((fila == filaMove) && (columna == columnaMove)))) {
                    System.out.print((char)(columnaMove + 96) + "" + filaMove + " ");
                }
            }

        }

    }
}
