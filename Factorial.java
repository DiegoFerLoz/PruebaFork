package primeraEvaluacion;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Pide un número y calcula la suma de los factoriales hasta ese numero (incluido). MODIFICACION
		Scanner src = new Scanner(System.in);
		System.out.print("Dame un número para calcular factoriales: ");
		int numero = src.nextInt();
		int suma = 0;
		int factor;
		src.close();
		
		for (int i=1; i<=numero; i++) {
			factor = 1;
			for (int j=1; j<=i; j++) {
				factor = factor * j;
			}
			System.out.println("El factorial de "+i+" es: "+ factor);
			suma = suma + factor;
		}
		System.out.println("La suma total es: "+suma);
	}
}
