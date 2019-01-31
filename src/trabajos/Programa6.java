package trabajos;

import java.util.Scanner;

public class Programa6 {
	
	public static void main(String[] args) {
		
		double numero;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numero = leer.nextDouble();
		if (numero%2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}
}
