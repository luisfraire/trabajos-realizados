package trabajos;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre; 
		double altura;
		int edad;
		System.out.println("Ingrese su nombre");
		Scanner leer = new Scanner(System.in);
		nombre = leer.nextLine(); 
		System.out.println("Ingrese su altura");
		
		altura = leer.nextDouble();
		System.out.println("Ingrese su edad");
		
		edad = leer.nextInt();
		System.out.println("Tu nombre es: "+ nombre);
		System.out.println("Tu altura es: "+ altura);
		System.out.println("Tu edad es: "+ edad);
	}

}
