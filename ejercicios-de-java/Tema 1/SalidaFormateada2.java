public class SalidaFormateada2 {
	public static void main(String[] args) {
		System.out.println("En este ejercicio veremos una salida formateada con caracteres");
    System.out.println("   Artículo       Precio/caja       Nº cajas");
    System.out.println("---------------------------------------------");
    System.out.printf("%-10s       %8.2f          %6d\n",    "Naranjas", 4.3, 10);
    System.out.printf("%-10s       %8.2f          %6d\n",    "Limones", 3.28, 120);
    System.out.printf("%-10s       %8.2f          %6d\n",    "Mandarinas", 8.0, 6);
    
		
	}
} 
