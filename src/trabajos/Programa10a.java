package trabajos;

import java.util.Scanner;

public class Programa10a {

	public static void main(String[] args) {
		byte noProductos=0, i=0;
		Scanner leer = new Scanner (System.in);
		double precioProducto = 0.0, suma = 0.0, aumento = 0.0;
		System.out.print("ingrese el numero de productos:");
		noProductos = leer.nextByte();
		i++;
		do {
			
			System.out.print("ingrese el numero de productos:"+i+":");
			noProductos = leer.nextByte();
			suma+=precioProducto;
			i++;
			
			
		}while (i<=noProductos);
		if (suma>=1500){
			aumento = suma * .11;
		}else{
			aumento = suma * 0.10;
			
		}
		System.out.println("Total de productos"+ noProductos);
		System.out.println("El monto es:"+suma);
		System.out.println("El monto es:"+(suma+aumento));
	}

}
