package trabajos;

import java.util.Scanner;

public class Programa12b {

	public static void main(String[] args) {
		int pc = 0, n=1, c, c1=0, c2=0, tm=0, nc;
		String oc;
		Scanner leer = new Scanner (System.in);
		System.out.println ("¿Cuántos clientes desea registrar?");
		nc = leer.nextInt();
		while (n<=nc){
		System.out.println("¿Cuánto consume en minutos al mes el cliente "+ n + "?");
		c=leer.nextInt();
		tm+=c;
		pc=tm/n;
		n++;
		if(c<100){
			c1++;
		}
		if (c>100){
			c2++;
		}
		}
		System.out.println("Total de minutos " + tm);
		System.out.println("Promedio de consumo por minutos al mes: " + pc);
		System.out.println("Total  de personas que consumieron más de 100 minutos al mes: " + c2);
		System.out.println("Total  de personas que consumieron menos de 100 minutos al mes: " + c1);
	}

}
