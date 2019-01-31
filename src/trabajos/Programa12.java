package trabajos;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int cal, i=1;
		double prom, c,a=0;
		System.out.println ("¿Cuántas calificaciones se registrarán?");
		cal=leer.nextInt();
		while (i<=cal){
		System.out.println ("Calificación " + i);
		c = leer.nextDouble();
		a+=c;
		prom=a/i;
		i++;
		if (prom>=0 && prom<=49){
			System.out.println ("Suspendido");
		}
		if (prom>=50 && prom<=69){
			System.out.println ("Aprobado");
		} 
		if (prom>=70 && prom<=89){
			System.out.println ("Notable");
		}
		if (prom>=90 && prom<=99){
			System.out.println ("Sobresaliente");
		}
		if (prom==100){
			System.out.println ("Matricula de honor");
		}
	}

	}

}
