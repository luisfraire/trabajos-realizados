package trabajos;

import java.util.Scanner;

public class Programa7 {
	
	public static void main(String[] args) {
		
		double cent=0.0, fah=0.0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese los grados fharenhit");
		fah = leer.nextDouble();
		cent=(fah-32)/1.8;
		System.out.println("Los grados fharenhit son:" +fah);
		System.out.println("Los fharenthit en centigrados son:" +cent);
	}
}

