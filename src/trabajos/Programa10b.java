package trabajos;

import java.util.Scanner;

public class Programa10b {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		byte numero;
		int suma=0, i=0;
		
		do{
			System.out.print("ingrese un numero:");
			numero = leer.nextByte();
		if (numero>=0 && numero <=76){
			suma+=numero;
			i++;
		}
		}while (numero<=76);
		System.out.println("cantidad de numero" + i);
		System.out.println("el promedio es:"+(suma/i));
	}

}
