package trabajos;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int op;
		double pul, pie;
		double con;
		System.out.println ("Menú");
		System.out.println ("1.- Pulgadas a centímetros");
		System.out.println ("2.- Pies a centímetros");
		System.out.println ("3.- Pies a pulgadas");
		System.out.println ("4.- Finalizar");
		System.out.println ("Elige una opción");
		op = leer.nextInt();
		do{
		
		switch (op)
		{
		case 1:
			System.out.println ("Ingrese las pulgadas");
			pul = leer.nextInt();
			con=(pul*2.54);
			System.out.println ("Pulgadas: " + pul + " igual a: " + con + " en centímetros");
			break;
		case 2:
			System.out.println ("Ingrese los pies");
			pie = leer.nextInt();
			con = (pie*30.48);
			System.out.println ("Pies: " + pie + " igual a: " + con + " en centímetros");
			break;
		case 3:
			System.out.println ("Ingrese los pies");
			pie = leer.nextInt();
			con = (pie*12);
			System.out.println ("Pies: " + pie + " igual a: " + con + " en pulgadas");
			break;
		
		}
		} while (op>4);
		if (op==4){
			System.out.println ("Usted eligio salir del programa");
	} else {
		System.out.println ("La ejecución ha terminado");
	}

}
	}

