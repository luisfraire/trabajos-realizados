package trabajos;

import java.util.Scanner;

public class Programa9 {
	public static void main (String args []){
		Scanner leer = new Scanner (System.in);
		int op;
		double pul, pie;
		double con;
		System.out.println ("Men�");
		System.out.println ("1.- Pulgadas a cent�metros");
		System.out.println ("2.- Pies a cent�metros");
		System.out.println ("3.- Pies a pulgadas");
		System.out.println ("Elige una opci�n");
		op = leer.nextInt();
		switch (op)
		{
		case 1:
			System.out.println ("Ingrese las pulgadas");
			pul = leer.nextInt();
			con=(pul*2.54);
			System.out.println ("Pulgadas: " + pul + " igual a: " + con + " en cent�metros");
			break;
		case 2:
			System.out.println ("Ingrese los pies");
			pie = leer.nextInt();
			con = (pie*30.48);
			System.out.println ("Pies: " + pie + " igual a: " + con + " en cent�metros");
			break;
		case 3:
			System.out.println ("Ingrese los pies");
			pie = leer.nextInt();
			con = (pie*12);
			System.out.println ("Pies: " + pie + " igual a: " + con + " en pulgadas");
			break;
			default:
				System.out.println ("NO eligi� una opci�n del 1 al 3");
				break;
		}
	}
	
}
