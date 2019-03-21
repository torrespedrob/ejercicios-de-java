
package ejs;

public class Ejercicio10 {
    public static void main(String[] args) {
		
	int[] numero = new int[20];
	int[] par = new int[20];
	int[] impar = new int[20];
				
	for(int i=0; i<20; i++) {
		int aleatorio = ((int)(Math.random() * 101));
		numero [i] = aleatorio;
                System.out.print(numero[i] + " ");
	}
	System.out.println();
		
	int numpar = 0;
	int numimpar = 0;
		
	for (int i = 0; i < 20; i++) {
		if ((numero [i] % 2) ==0) {
                    par [numpar] = numero[i];
			numpar++;
		} else {
			impar [numimpar] = numero[i];
                        numimpar++;
		}
	}
	
		
	for (int i = 0; i < numpar; i++) {
            numero[i] = par[i];
                 
	 }
	 for (int i = numpar; i < 20; i++) {
             numero[i] = impar[i - numpar];
                 
	 }
         
         //Impresión de pares e impares//
         System.out.print("\nPares: ");
         for (int i = 0; i < 20; i++) {
             System.out.print(par[i] + "  ");
         }
         System.out.print("\nImpares: ");
         for (int i = 0; i < 20; i++) {
             System.out.print(impar[i] + "  ");
         }
         
         System.out.println("\n");
         for (int i=0; i < 20; i++) {
             System.out.print(numero[i] + " ");
         }
		 
		
	}
}
