public class Colores {
	public static void main(String[] args) {
		System.out.println("¡Hola mundo!");
		System.out.println("En este ejercicio  vamos a utlizar diferentes colores");
    String rojo = "\033[31m";
    String naranja = "\033[33m";
    String verde = "\033[32m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(azul + "Estos son los colores "+ rojo + "rojo "+ verde +"verde "+ azul + "azul");
    System.out.println("¿Te gustan los " + rojo + "c" + naranja + "o" + verde + "l" + azul+ "o" + morado + "r" + blanco + "e" + rojo + "s" + naranja + "?");
	}
} 
