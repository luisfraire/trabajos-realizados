package trabajos;

import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int dia;
		System.out.println ("ingresa un numero de 1-7");
		dia = leer.nextInt();
		
		switch(dia) {
		case 1 : 
			System.out.println("domingo");
			break;
		case 2 : 
			System.out.println("Lunes");
			break;
			
		case 3 : 
			System.out.println("Martes");
			break;
			
		case 4 : 
			System.out.println("Miercoles");
			break;
			
		case 5 : 
			System.out.println("Jueves");
			break;
			
		case 6 : 
			System.out.println("Viernes");
			break;
			
		case 7 : 
			System.out.println("Sabado");
			break;
}
	}
	
}

