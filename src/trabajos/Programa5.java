package trabajos;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double calif=0.0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su calificación");
		calif = leer.nextDouble();
		if (calif>= 80) {
			System.out.println("Aprobado");
		}
		else  {
		System.out.println("Reprobado");
		}

	}

}
