

public class Ejerciciox {

    public static void main(String[] args) {
        System.out.println("Este programa utiliza funciones, en este caso una funci'on de n'umero primo;");
        System.out.println("Introduce un n'umero entero");
        
        int x = Integer.parseInt(System.console().readLine());
		
		
		
		
		if (primo) {
			System.out.println("El " + x + " es primo");
		} else {
			System.out.println("El " + x + " no es primo");
		}
		
        
    }
}

	public static boolean primo(int z) {
		
		for (int x = 2; x< z; x++) {
			if ((z % x ) == 0 ) {
				return false ;
			}
		}
		return true;
	}
}

