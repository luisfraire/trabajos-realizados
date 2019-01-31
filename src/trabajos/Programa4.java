package trabajos;
import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		System.out.println("Ingresa tu edad");
		Scanner leer = new Scanner(System.in);
		edad = leer.nextInt();
		if (edad>=18) {
		System.out.println("Mayor de edad");
		
			
	}
		else {
			System.out.println("Menor de edad");
		}
	}

}
